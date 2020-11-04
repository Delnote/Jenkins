pipeline {
    agent any

    stages {
        stage('build') {
                docker.image('maven:3.5.0-jdk-8').inside {
                    git 'https://github.com/Delnote/Jenkins.git'
                    withMaven() {
                        sh 'mvn clean install'
                    }
                }
            }
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