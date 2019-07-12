#!groovy

pipeline {

    agent any

    stages {

        stage("Clean") {
            steps {
                sh './scripts/clean.sh'
            }
        }

        stage("Build") {
            steps {
                sh './scripts/build.sh'
            }
        }

        stage("Test") {
            steps {
                sh './scripts/test.sh $BRANCH_NAME'
            }
        }

    }

}
