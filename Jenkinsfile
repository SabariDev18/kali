pipeline{
  agent any
  stages{
    stage('mvn'){
      steps{
          sh 'mvn clean package'
           }
         }
    stage('deploy'){
      steps{
          sh 'ansible-playbook -i ansible-m.ini jensible.yml'
           }
         }
       }
 }
