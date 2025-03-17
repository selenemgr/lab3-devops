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

       
    }
}