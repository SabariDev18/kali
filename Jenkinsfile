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
          sshagent(['ec2-ssh-key']) {
                    sh 'ansible-playbook -i ansible-m.ini jensible.yml'
                }
           }
         }
       }
 }
