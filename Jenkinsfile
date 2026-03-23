pipeline {
    agent any

    stages {
        stage('Checkout Main Branch') {
            steps {
                // Checkout the Jenkinsfile itself from main branch
                checkout([$class: 'GitSCM',
                          branches: [[name: '*/branch5']],
                          userRemoteConfigs: [[url: 'https://github.com/Manikandankk12/Practicerepo.git']]
                ])
                echo 'Jenkinsfile is running from main branch...'
            }
        }

        stage('Checkout Code Branch') {
            steps {
                // Checkout another branch (e.g., dev) for Python, Java, HTML files
                checkout([$class: 'GitSCM',
                          branches: [[name: '*/branch6']],
                          userRemoteConfigs: [[url: 'https://github.com/Manikandankk12/Practicerepo.git']]
                ])
                echo 'Code files checked out from dev branch...'
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

