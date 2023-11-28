pipeline {
  agent any

  stages {
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
        
