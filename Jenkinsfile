pipeline{
  agent any
# keep  tools section  if ur using mavens from tools not from jenkins running machine/node
  tools{
     jdk 'Java-25'
     maven 'Maven-3.9.16'
    }
  stages{
# keep stage checkout if ur using pipeline not pipeline fromscm
    stage('checkout'){
        steps{
            git branch:'maven',
            url:'https://github.com/SabariDev18/kali.git'
            }
        }
     stage('build'){
         steps{
            sh 'mvn clean package'
             }
            }
     stage('jar files'){
         steps{
              sh 'find . -type f -name "*.jar" '
             }
           }
         }
    }
