pipeline {
    agent any
	triggers {
		pollSCM '* * * * *'
	}
	 
    stages {
    
        stage('build && SonarQube analysis') {
        	steps {
                withSonarQubeEnv('sonarserver') {
                
                    withMaven(maven : 'Maven 3.5.3') {
                        bat 'mvn clean package sonar:sonar'
                    }
                }
            }
        }
        
        stage("Quality Gate") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
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

    }
    
}
