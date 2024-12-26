pipeline {
    agent any
    tools {
        maven "maven" // Replace with your configured Maven tool name
    }
    stages {
        stage("SCM checkout") {
            steps {
                checkout scmGit(
                    branches: [[name: '*/main']], 
                    extensions: [], 
                    userRemoteConfigs: [[url: 'https://github.com/anandraw/jenkins-ci-cd-demo.git']]
                )
            }
        }
        stage("Maven build") {
            steps {
                bat 'mvn clean install' // Use 'bat' instead of 'sh' for Windows
            }
        }
        stage("deploy build"){
            steps{
                deploy adapters: [tomcat9(credentialsId: '251f777e-51da-4cab-9587-8ae5c8519af3', path: '', url: 'http://localhost:9090/')], contextPath: 'jenkinsCiCd', war: '**/*.war'
            }
        }
    }
}
