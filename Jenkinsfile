pipeline {
    agent any

    stages{
        stage('SonarQube Analysis'){
            steps{
                container('gradle') {
                    withSonarQubeEnv('SonarQube-Server'){
                        sh '''
                            chmod +x ./gradlew 
                            ./gradlew clean build sonarqube \
                            -Dsonar.projectKey=java-labs-v1 \
                            -Dsonar.projectName=java-labs-v1
                        '''
                    }
                }
            }
        }


    }//stages


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
    }//post
}