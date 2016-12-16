# DevOps Project

An easy, fast, and portable DevOps pipeline. Automated testing (static analysis, unit tests, etc) on code pushes for PHP development. For use in small industries and curriculum.

The problems that faces teaching DevOps is the sheer complexity of different tools used in DevOps pipelines as well as there not being a standard in the industry for what tools to use, it is what best fits your organization. This factored in with the time constraints of trying to fit DevOps practices into already existing curriculum causes serious problems.

We here at UWF wanted a fast, easy, portable, and visual way of teaching DevOps practices, focused mainly on continuous integration, for students going into the computer science field. So with that in mind we decided to get started with our vision and create the DevOps Project. This project consists of a pipeline using Jenkins to manage it, a testing environment configured and managed using Docker and it is targeted towards PHP.

## So, how did we go about this?

The tools we are using for creating our pipeline tries to follow industry commonalities to expose the students to tools they will see and use in the real world.

Tools:
Jenkins: Jenkins is a continuous integration automation tool.
Docker: Docker is a portable and lightweight way of descripting containers, microservices that perform some task.
Git: Git is a version control manager and helps with keeping your code organized.
GitHub: GitHub is a remote repository where you can put your git repositories, the place where you code is located locally, to be available to everyone working on the project and to prevent losing your code.

# DevOps Project

An easy, fast, and portable DevOps pipeline. Automates testing (static analysis, unit tests, etc) on code pushes for PHP development. For use in small industries and curriculum.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisities

What things you need to install the software and how to install them

**Build Server**

1. Jenkins
2. Git

**Docker Box**

1. Docker
2. Git

**Jenkins Plugins**

1. Pipeline
2. Pipeline (Stage View Plugin)
3. Git
4. GitHub
5. SSH Slave

**Build Server:**

```
sudo wget -O /etc/yum.repos.d/jenkins.repo http://pkg.jenkins-ci.org/redhat/jenkins.repo // Remember to select your own OS
sudo rpm --import https://jenkins-ci.org/redhat/jenkins-ci.org.key
sudo yum install jenkins

sudo yum install git
```

**Docker Box:**

```
sudo yum install docker

sudo yum install git
```

### Installing

A step by step series of examples that tell you have to get a development env running

Stay what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* Dropwizard - Bla bla bla
* Maven - Maybe
* Atom - ergaerga

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags).

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc
