def call(String username = 'null'){
	echo "This is shared library of greetUser: ${username}"
	pipeline{
		environment{
			USER_NAME = "$username"
		}
		agent any
		stages{
			stage('SHARED-STAGE'){
				steps{
					echo "Hello $USER_NAME , how are you"
				}
			}
		}
	}
}
