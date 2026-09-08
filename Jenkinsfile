pipeline{
  agent any
  stages{
    stage('mvn'){
      steps{
          sh 'mvn clean package'
           }
         }
    stage('trivy'){
        steps{
            sh 'trivy fs --severity HIGH,CRITICAL .'
             }
           }
        }
 }
