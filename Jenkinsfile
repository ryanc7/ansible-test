pipeline {
    agent {
        label 'vm-node'
    }
    environment {
        ANSIBLE_HOST_KEY_CHECKING = 'false' // Optional: Disable host key checking if necessary
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from GitHub
                git 'https://github.com/ryanc7/ansible' // Replace with your repo URL
            }
        }

        stage('Install Ansible') {
            steps {
                // Install Ansible if it's not already installed
                sh 'sudo apt-get update && sudo apt-get install -y ansible' // Adjust this command based on your OS
            }
        }

        stage('Run Ansible Playbook') {
            steps {
                // Run the Ansible playbook with the specified inventory
                sh 'ansible-playbook -i inventory.ini nginx.yaml'
            }
        }
    }

    post {
        success {
            echo 'Ansible playbook executed successfully!'
        }
        failure {
            echo 'Ansible playbook execution failed!'
        }
    }
}
