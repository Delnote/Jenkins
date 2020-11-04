pipeline {
    agent any

    tools {
            jdk 'Java 8'
            maven '3.6.3'
        }

    stages {
         stage('--start--') {
            steps {
                sh "rm -rf Jenkins"
                sh "git clone https://github.com/Delnote/Jenkins.git"
                sh "docker run --rm -v maven:3.6.3-jdk-8 mvn clean -f Jenkins"
                /*
                sh "rm -rf Jenkins"
                sh "git clone https://github.com/Delnote/Jenkins.git"
                sh "mvn --version"
                sh "mvn clean -f Jenkins"
                */
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