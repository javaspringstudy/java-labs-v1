pipeline {
    agent any

    environment {
        SONARQUBE_SERVER = 'SonarQube-Server' // Jenkins에 등록된 소나큐브 서버 이름
    }

    stages {
        stage('Checkout') {
            steps {
                git credentialsId: 'todo-github-deploy-key',
                    url: 'https://github.com/javaspringstudy/java-labs-v1.git',
                    branch: 'main'
            }
        }

        stage('Compile') {
            steps {
                sh '''
                    mkdir -p out
                    javac -d out $(find src -name "*.java")
                '''
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv("${SONARQUBE_SERVER}") {
                    sh '''
                        sonar-scanner \
                          -Dsonar.projectKey=java-labs-v1 \
                          -Dsonar.projectName=java-labs-v1 \
                          -Dsonar.sources=src \
                          -Dsonar.java.binaries=out
                    '''
                }
            }
        }

        stage('Quality Gate') {
            steps {
                timeout(time: 5, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
