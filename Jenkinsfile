pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'docker compose build'
            }
        }
        stage('scan'){
            steps{
                echo 'Trivy scanning...'
                sh 'trivy image --exit-code 1 --severity HIGH,CRITICAL backend'
                sh 'trivy image --exit-code 1 --severity HIGH,CRITICAL frontend'
                 }
                 }

        stage('Deploy') {
            steps {
                sh 'docker compose up -d'
            }
        }

    }
}
