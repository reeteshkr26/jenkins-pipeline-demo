pipeline {
    agent any
	triggers {
		pollSCM '* * * * *'
	}
	 tools {
        maven : 'Maven 3.5.3'
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

                			bat'mvn deploye'

 
            }
        }
    }
}