pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        git 'https://github.com/bfellows71/JUnitTests.git'
        sh './mvn clean compile'
      }
    }
    stage('Test') {
      steps {
        sh './mvnw test'
      }

      post {
        always {
          junit '**/target/surefire-reports/TEST-*.xml'
      }
      }
    }
  }
}
        
