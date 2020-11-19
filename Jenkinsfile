pipeline {
    agent any
	triggers {
		pollSCM '* * * * *'
	}
    stages {
        stage('Compile Stage') {
            steps {
            		
            			sh 'mvn clean compile'
        
            }
        }
        stage('Test Stage') {
            steps {
            
            			sh 'mvn test'

            }
        }
        stage('Deployment stage') {
            steps {

            			sh 'mvn deploy'
 
            }
        }
    }
}