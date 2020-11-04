pipeline {
    agent {
            docker {
                image 'aven:3.6.3-jdk-8'
                args '-v $HOME/.m2:/root/.m2'
            }
        }

    tools {
            jdk 'Java 8'
            maven '3.6.3'
        }

    stages {
         stage('--start--') {
            steps {
                sh "rm -rf Jenkins"
                sh "git clone https://github.com/Delnote/Jenkins.git"
                sh "mvn --version"
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