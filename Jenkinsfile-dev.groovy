
properties([
    parameters([
        choice(name: 'Environment', choices: ['dev', 'sit2'], description: 'The target environment'),
        choice(name: 'GithubRepo', choices: ['https://github.com/prashant4875/Netflix-clone.git'], description: 'Select Github repo to checkout')
    ])
])
dev()