pipeline {
    agent any

    stages {
        stage('---clean---') {
            steps {
                echo $M2_HOME
                echo $PATH
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