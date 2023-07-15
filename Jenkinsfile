pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script {
                    def ch = env.CHANGE_ID
                echo "${ch}"
                echo "${env.ghprbPullId}"
                echo "${env.ghprbSourceBranch}"
                echo "${env.ghprbTargetBranch}"
                }
            }
        }
    }
}
