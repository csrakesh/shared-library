def call(string username = 'null'){
	echo "This is shared library of greetUser: ${username}"
	pipeline{
		environment{
			USER_NAME = "$username"
		}
		agent any
		stages{
			stage{
				steps{
					echo "Hello $USER_NAME , how are you"
				}
			}
		}
	}
}