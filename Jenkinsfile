pipeline{
  agent any
  tools{
       jdk 'Java-25'
       maven 'Maven-3.9.16' 
       }
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
