pipeline {
    agent any
    tools {
        maven 'MAVEN3'
    }

    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/selenemgr/lab3-devops.git']])

                bat 'mvn clean install'
            }
        }

        stage('Build Docker Image') {
            steps {
                script{
                    bat 'docker build -t lab3/lab3-devops .'
                }
            }
        }
    }
}