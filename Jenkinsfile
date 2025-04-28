pipeline {
    agent any

    environment {
        SONARQUBE_SERVER = 'java-labs-v1-SonarQube-Server' // Jenkins에 등록된 소나큐브 서버 이름
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
                    javac -d out $(find chapter1 -name "*.java")
                '''
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv("${SONARQUBE_SERVER}") {
                    withEnv(["PATH+SONAR=${tool 'SonarScanner'}/bin"]) {
                        sh """
                        sonar-scanner \
                        -Dsonar.projectKey=java-labs-v1 \
                        -Dsonar.projectName=java-labs-v1 \
                        -Dsonar.sources=chapter1 \
                        -Dsonar.java.binaries=out
                        """
                    }
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
