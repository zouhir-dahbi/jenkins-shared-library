def call(Map config=[:], Closure body) {
    node {

        stage('Install') {
            sh 'npm install'
        }

        stage('Test') {
            sh 'npm test'
        }
        stage('Deploy') {
            if (config.deploy) {
                sh 'npm publish'
            }
        }

        body()
    }
}