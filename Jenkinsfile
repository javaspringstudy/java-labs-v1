pipeline {
    agent any

    stages {
        stage('Install SonarScanner') {
            steps {
                sh '''
                    apt-get update
                    apt-get install -y unzip curl
                    curl -o sonar-scanner.zip https://binaries.sonarsource.com/Distribution/sonar-scanner-cli/sonar-scanner-cli-5.0.1.3006-linux.zip
                    unzip sonar-scanner.zip
                    export PATH=$PATH:$(pwd)/sonar-scanner-5.0.1.3006-linux/bin
                '''
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube-Server') {
                    sh '''
                        sonar-scanner \
                        -Dsonar.projectKey=java-labs-v1 \
                        -Dsonar.projectName=java-labs-v1 \
                        -Dsonar.sources=src
                    '''
                }
            }
        }
    }

    post {
        always {
            withCredentials([string(
                credentialsId: 'Discord-Webhook',
                variable: 'DISCORD_WEBHOOK_URL'
            )]) {
                discordSend description: """
                제목 : ${currentBuild.displayName}
                결과 : ${currentBuild.result}
                실행시간 : ${currentBuild.duration / 1000}s
                """,
                result: currentBuild.currentResult,
                title: "${env.JOB_NAME} : ${currentBuild.displayName}",
                webhookURL: "${DISCORD_WEBHOOK_URL}"
            }
        }
    }
}
