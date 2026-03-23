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

        stage('Serve HTML File') {
            steps {
                // Start a simple Python HTTP server to serve the HTML file
                // Replace 'index.html' with your HTML file name
                sh 'python3 -m http.server 8080 &'
                echo 'HTML file is being served at http://localhost:8080/index.html'
            }
        }
    }
}

