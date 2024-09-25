pipeline {
    agent 'any'

    stages{
        stage('Install Ansible') {
            sh '''
            sudo apt update
            sudo apt install -y ansible
            '''
            
        }
    }
}