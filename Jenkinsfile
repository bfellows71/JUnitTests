pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the GitHub repository
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Build the Java project using Maven
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run JUnit tests
                sh 'mvn clean test'
                
                // Print contents of the workspace for debugging
                script {
                    echo "Contents of the workspace:"
                    sh 'ls -R'
                }
            }

            post {
                // Publish JUnit test results
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
