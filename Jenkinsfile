pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the Project with Maven Compiler'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing the Project with Maven Test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the Project with Maven Package'
            }
        }
    }
}
