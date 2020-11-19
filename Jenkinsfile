pipeline {
    agent any
	triggers {
		pollSCM '* * * * *'
	}
	
    stages {
        stage('Compile Stage') {
            steps {
            		
                              bat'mvn clean compile'
            }
        }
        stage('Test Stage') {
            steps {
            
                			bat'mvn test'
            }
        }
        stage('Deployment stage') {
            steps {

                			bat'mvn deploy'

            }
        }
    }
    
}