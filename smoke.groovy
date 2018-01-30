pipeline {
    agent any
    stages {
        stage("sync") {
            steps {
                print "test sync"
            }
        }
    }
}