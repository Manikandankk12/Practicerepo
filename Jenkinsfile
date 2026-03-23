pipeline {
    agent any

    stages {
        stage('Checkout Jenkinsfile (main branch)') {
            steps {
                // Jenkinsfile is already running from main branch
                echo 'Pipeline is defined in main branch'
            }
        }

        stage('Checkout Code from branch5') {
            steps {
                // Pull all files from branch5
                checkout([$class: 'GitSCM',
                          branches: [[name: '*/branch5']],
                          userRemoteConfigs: [[url: 'https://github.com/Manikandankk12/Practicerepo.git']]
                ])
                echo 'Checked out Python, Java, and HTML files from branch5'
            }
        }

        stage('Run Python Script') {
            steps {
                sh 'python3 python.py'
            }
        }

        stage('Compile Java Program') {
            steps {
                sh 'javac javafile.java'
            }
        }

        stage('Run Java Program') {
            steps {
                sh 'java javafile'
            }
        }

        stage('Serve HTML File') {
            steps {
                sh 'python3 -m http.server 8080 &'
                echo 'HTML file is being served at http://localhost:8080/index.html'
            }
        }
    }
}

