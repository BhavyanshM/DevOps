import groovy.json.JsonSlurper

// Parsing the push notification to get the repo's url
@NonCPS
def urlParse(def json)
{
    new groovy.json.JsonSlurper().parseText(json).repository.ssh_url
}

// Parsing the push notification to get the repo's branch
@NonCPS
def branchParse(def json)
{
    new groovy.json.JsonSlurper().parseText(json).ref
}

node('docker_box')
{

    // Cloning the updated git repo
    stage 'Git Checkout'

    // Grabbing the repo's url
    def url = urlParse(payload)

    // Parsing the url to grab the repo's name
    def repo = url.tokenize('/')[1].tokenize('.')[0].toLowerCase()

    // Grabs the branch that was updated
    def branch = branchParse(payload).tokenize('/')[2].trim()

    // Setting the name of the build to the something unique to the repo and branch
    currentBuild.displayName = "${repo}: ${branch}"

    if(branch != "master")
    {

        // Updating tester repo
        dir('/home/ec2-user/workspace/DevOps')
        {
            try
            {
                sh "git pull"
            }
            catch(e)
            {
                currentBuild.result = "FAILURE"
            }
        }

    	// Changing directories
        dir("/home/ec2-user/workspace/jenkins_pipeline/")
        {
            try
            {
                // Cloning in the new repo to the current directory
                sh "git clone ${url} ${repo}"
            }
            catch(e)
            {
                currentBuild.result = "FAILURE"
            }
        }

        // Starting static analysis testing
        stage 'Static Analysis'

        // Changing directories
        dir("/home/ec2-user/workspace/jenkins_pipeline/${repo}")
        {
            sh "git checkout ${branch}"
        }

        // Building Gadget Docker image
        sh "docker build -t ${repo} /home/ec2-user/workspace/DevOps/tests/phpcs/Gadget"

        try
        {
            // Running PHP tests
            sh "docker run -v /home/ec2-user/workspace/jenkins_pipeline/${repo}:/pipeline --rm ${repo}"
        }
        catch(e)
        {
            currentBuild.result = "UNSTABLE"
        }


        // Building phpcs Index Docker image
        sh "docker build -t ${repo} /home/ec2-user/workspace/DevOps/tests/phpcs/Index"

        try
        {
            // Running PHP tests
            sh "docker run -v /home/ec2-user/workspace/jenkins_pipeline/${repo}:/pipeline --rm ${repo}"
        }
        catch(e)
        {
            currentBuild.result = "UNSTABLE"
        }


        // Building phpcs Tester Docker image
        sh "docker build -t ${repo} /home/ec2-user/workspace/DevOps/tests/phpcs/Tester"

        try
        {
            // Running PHP tests
            sh "docker run -v /home/ec2-user/workspace/jenkins_pipeline/${repo}:/pipeline --rm ${repo}"
        }
        catch(e)
        {
            currentBuild.result = "UNSTABLE"
        }

        if(currentBuild.result != "FAILURE")
        {
            echo currentBuild.result
            // Starting Unit Tests
            stage 'Unit Tests'    // Building localphpunit Docker image

            sh "docker build -t ${repo} /home/ec2-user/workspace/DevOps/tests/localphpunit"

            try
            {
                // Running PHP tests
                sh "docker run -v /home/ec2-user/workspace/jenkins_pipeline/${repo}:/pipeline --rm ${repo}"
            }
            catch(e)
            {
                currentBuild.result = "FAILURE"
            }
        }

        if(currentBuild.result != "FAILURE")
        {
            // Starting Integration Test
            stage 'Integration Test'

            if (currentBuild.result != "FAILURE")
            {

                // Building phpunit integration Docker image
                sh "docker build -t ${repo} /home/ec2-user/workspace/DevOps/tests/phpunit"

                try
                {
                    // Running PHP tests
                    sh "docker run --link database:db -v /home/ec2-user/workspace/jenkins_pipeline/${repo}:/pipeline --rm ${repo}"
                }
                catch(e)
                {
                    currentBuild.result = "FAILURE"
                }

            }
            else echo 'Skipping Integration'
        }

        if(currentBuild.result != "FAILURE")
        {
            // Starting Staging
            stage 'Staging'

            if (currentBuild.result != "FAILURE")
            {

                // Starting stage

                try
                {
                    // Running PHP tests
                    sh "bash /home/ec2-user/workspace/DevOps/tests/push/push.sh ${repo}"
                }
                catch(e)
                {
                    currentBuild.result = "FAILURE"
                }

            }
            else echo 'Skipping Staging'
        }

        if(currentBuild.result != "FAILURE")
        {
            // Starting Merge
            stage 'Merging'

            try
            {
                dir("/home/ec2-user/workspace/jenkins_pipeline/${repo}")
                {
                    sh "git checkout master"
                    sh "git merge ${branch}"
                    sh "git push ${url} master"
                }
            }
            catch(e)
            {
                currentBuild.result = "FAILURE"
            }
        }

        if(currentBuild.result != "FAILURE")
        {
            try
            {
                // Starting BackUp
                stage 'BackUp'
                dir("/home/ec2-user/workspace/jenkins_pipeline/")
                {
                    sh "sudo cp -r ${repo}/ /home/ec2-user/workspace/DevOps/tests/stage/backUps/"
                }

                dir("/home/ec2-user/workspace/DevOps/")
                {
                    sh "sudo -u ec2-user git push"
                }
            }
            catch(e)
            {
                currentBuild.result = "FAILURE"
            }
        }

        // Starting Cleanup
        stage 'Repo Cleanup'

        try
        {
            // Removing the repo after the tests are complete
            sh "sudo rm -rf /home/ec2-user/workspace/jenkins_pipeline/${repo}"
            sh "sudo rm -rf /home/ec2-userx/workspace/jenkins_pipeline/${repo}\\@tmp"
            //sh "sudo rm -rf /home/ec2-user/workspace/*\\@*"
        }
        catch(e)
        {

        }

    }
    else echo "Cannot test master branch"

}
