pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script {
                echo "${env.CHANGE_ID}"
                echo "${env.ghprbPullId}"
                echo "${env.ghprbSourceBranch}"
                echo "${env.ghprbTargetBranch}"
                }
            }
        }
    }
}
