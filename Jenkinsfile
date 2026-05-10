pipeline {
	agent any
	
	tools {
		maven 'Maven'
	}
	stages {
		stage('Check-out') {
			steps {
				git branch: 'main' , url: 'https://github.com/narasimhaa44/Devops.git'
				}
			}
		stage('Build') {
			steps{
				dir('mymavenpipe') {
					sh 'mvn clean package'
				}
			}
		}
		
		stage('Test') {
			steps{
				dir('mymavenpipe') {
					sh 'mvn test'
				}
			}
		}
		
		stage('Run application') {
			steps{
				dir('mymavenpipe') {
					sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
					}
				}
			}
			
		}
		
		post {
			success {
				echo 'Build and deployment Successful'
				}
				failure {
				echo 'Build failed!'
				}
		}
	}
