pipeline {
    agent any
    stages {
        stage('---clean---') {
            steps {
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