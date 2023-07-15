pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script {
                    // def ch = CHANGE_ID
                echo "${CHANGE_ID}"
                echo "${env.ghprbPullId}"
                echo "${env.ghprbSourceBranch}"
                echo "${env.ghprbTargetBranch}"
                }
            }
        }
    }
}
