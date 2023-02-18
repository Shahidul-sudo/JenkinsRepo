pipeline {
    agent any
    parameters{
    string defaultValue: 'DevOps', description: 'Which course do u want to join?', name: 'CourseName'
    }
    stages {
        stage('Hello') {
            steps {
                echo "Hello World ${CourseName}"
            }
        }
    }
}