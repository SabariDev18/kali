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
         }
    }
