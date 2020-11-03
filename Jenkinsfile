pipeline {
    agent any
    stages {
        stage('---clean---') {
            steps {
                bat "rmdir -rf Jenkins"
                bat "git clone https://github.com/Delnote/Jenkins.git"
                bat "mvn clean -f Jenkins"
            }
        }
        stage('--install--') {
            steps {
                bat "mvn install -f Jenkins"
            }
        }
        stage('--package--') {
            steps {
                bat "mvn package -f Jenkins"
            }
        }
    }
}