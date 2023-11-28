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

        script {
    echo "Contents of target directory:"
    sh 'ls -R target'
}

        stage('Test') {
            steps {
                // Run JUnit tests
                sh 'mvn test'
            }

            post {
                // Publish JUnit test results
                always {
                    junit 'tests/results/*.xml'
                }
            }
        }
    }
} 
