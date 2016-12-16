# DevOps Project - Continuous Delivery Code Pipeline for a PHP Application

An easy, fast, and portable DevOps pipeline. Automated testing (static analysis, unit tests, etc) on code pushes for PHP development. For use in small industries and curriculum. Primarily built to educate Software Engineering students and beginning professionals about the concept and the process of Continuous Delivery through hands-on experimentation with a prototype 

A major problem in the field of DevOps is the sheer complexity of different tools used in DevOps pipelines as well as the lack of a standard in the industry for the tools used.

The DevOps Research Group at UWF is responsible for the design, implementation and maintenance of this fast, easy, portable, and visual and hands-on way of teaching DevOps practices. This code pipeline is focused mainly on continuous integration, to teach the process of CI/CD to students going into careers in Software Engineering. This project thus, consists of a CD pipeline that uses Jenkins as the configuration manager, a testing environment configured and managed using Docker, as well as light-weight but full-fledged PHP application, designed and created by the same group. 

## Setup of the CD Pipeline

The tools that have been used for creating this pipeline, were chosen with Industrial best practices and standards in mind. Although the code pipeline does not meet the actual professinal standards, it does a very good job at teaching the process of Continuous Delivery to students. 

Tools:
Jenkins: Jenkins is a Continuous Integration Configuration Management service
Docker: Docker is a Containerization service
Git: Git is a version control and source code management service
GitHub: GitHub is a collection of code repositories

## Getting Started

These instructions aim at getting the project up and running on Amazon EC2 instances for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisities

Packages and services that need to be installed and configured

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

## Deployment

Add additional notes about how to deploy this on a live system

## Tools and Services

Bash, Amazon EC2, Docker, Jenkins(w/plugins), PHP, MySQL, PHPUnit, PHP CodeSniffer

## Authors

###DevOps at the University of West Florida
Faculty Mentors: Dr. Norman Wilde, Dr. Brian Eddy
Creators: Bhavyansh Mishra, Nathan Cooper 
Honourable Mention:Khyati Patel, Keenal Shah
