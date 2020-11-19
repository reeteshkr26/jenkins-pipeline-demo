pipeline {
    agent any
	triggers {
		pollSCM '* * * * *'
	}
	 
    stages {
    
        stage('Compile Stage') {
            steps {
            		withMaven(maven : 'Maven 3.5.3'){
            			bat'mvn clean compile'
            		}                            
            }
        }
        
        stage('Test Stage') {
            steps {
            		withMaven(maven : 'Maven 3.5.3'){
            			bat'mvn test'
            		}              			
            }
        }
        
        stage('Deployment stage') {
            steps {
					withMaven(maven : 'Maven 3.5.3'){
            			bat'mvn deploy'
            		}   			

            }
        }
    }
    
}
