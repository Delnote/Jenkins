pipeline {
    agent any
    tools {
        maven "3.6.3"
    }

    stages {
        stage('---clean---') {
            steps {
                sh "rm -rf Jenkins"
                sh "git clone https://github.com/Delnote/Jenkins.git"
                sh "mvn clean -f Jenkins"
            }
        }
        stage('--install--') {
            steps {
                sh "mvn install -f Jenkins"
            }
        }
        stage('--package--') {
            steps {
                sh "mvn package -f Jenkins"
            }
        }
    }
}