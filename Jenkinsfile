pipeline {
    agent any

    stages {
        stage('---clean---') {
        def mvn = tool (name: '3.6.3', type: 'maven') + '/bin/mvn'
            steps {
                sh "rm -rf Jenkins"
                sh "git clone https://github.com/Delnote/Jenkins.git"
                sh "${mvn}/bin/mvn --version"
                sh "${mvn}/bin/mvn clean -f Jenkins"
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