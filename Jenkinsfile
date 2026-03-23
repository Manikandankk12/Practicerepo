pipeline {
    agent any

    stages {
        stage('Run Python Script') {
            steps {
                // Replace 'script.py' with the name of your Python file
                sh 'python3 python.py'
            }
        }

        stage('Compile Java Program') {
            steps {
                // Replace 'HelloWorld.java' with your Java file
                sh 'javac javafile.java'
            }
        }

        stage('Run Java Program') {
            steps {
                // Run the compiled Java class
                sh 'java javafile'
            }
        }
    }
}

