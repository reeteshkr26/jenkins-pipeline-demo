pipeline {
    agent any
	triggers {
		pollSCM '* * * * *'
	}
    stages {
        stage('Compile Stage') {
            steps {
            		withMaven(maven : 'Maven 3.5.3'){
            			sh 'mvn clean compile'
            		}
            }
        }
        stage('Test Stage') {
            steps {
            
            		withMaven(maven : 'Maven 3.5.3'){
            			sh 'mvn test'
            		}
            }
        }
        stage('Deployment stage') {
            steps {
            		withMaven(maven : 'Maven 3.5.3'){
            			sh 'mvn deploy'
            		}
            }
        }
    }
}