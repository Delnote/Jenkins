pipeline {
    agent any

    stages {
         stage('--start--') {
            steps {
                echo "PATH = ${PATH}"
                sh "rm -rf Jenkins"
                sh "git clone https://github.com/Delnote/Jenkins.git"
                sh "${maven}/bin/mvn --version"
                sh "${maven}/bin/mvn clean -f Jenkins"
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