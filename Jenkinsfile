pipeline{
  agent any
  stages{
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
              sh 'ls -l /var/lib/jenkins/workspace/maven-java/target'
             }
           }
         }
    }
