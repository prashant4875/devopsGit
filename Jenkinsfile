pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo "${env.CHANGE_ID}"
                echo "${env.ghprbPullId}"
                echo "${env.ghprbSourceBranch}"
                echo "${env.ghprbTargetBranch}"
            }
        }
    }
}
