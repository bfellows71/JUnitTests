stage('Test') {
    steps {
        // Run JUnit tests
        sh 'mvn test'
        // Print contents of the workspace
        sh 'ls -R'
    }
    post {
        // Publish JUnit test results
        always {
            junit 'tests/results/*.xml'
        }
    }
}
