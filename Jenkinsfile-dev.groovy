// @Library('shared') _
properties([
    parameters([
        choice(name: 'Environment', choices: ['dev', 'sit2'], description: 'The target environment'),
        choice(name: 'GithubRepo', choices: ['https://github.com/prashant4875/Netflix-clone'], description: 'Select Github repo to checkout'),
        gitParameter(
            name: 'Branch',
            branchFilter: "*",
            defaultValue: 'origin/master',
            sortMode: 'DESCENDING_SMART',
            type: 'PT_BRANCH',
            // useRepository: 'https://github.com/prashant4875/Netflix-clone.git'
        )
    ])
])
// dev()
pipeline{
    agent any

    stages{
        stage('Checkout Stage') {
                steps{
                    script{
                        echo "${params.Environment}"
                        echo "${params.GithubRepo}"
                        def release_branch = "${params.Branch}"
                        def release = release_branch.substring(7)
                        git branch: 'develop', url: "${params.GithubRepo}"
                        sh "git checkout develop"
                    }
                }
            }
    }
}