pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/selenemgr/Lab2-devops.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'  // Use 'bat' instead of 'sh'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'  // Use 'bat' for Windows instead of 'sh'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying application..."
            }
        }
    }
}
