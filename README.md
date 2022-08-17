# buggs-cars-automation

This repository is to create, update and run selenium tests scripts for buggy cars application.


## Requirements:
[Java (min 8)](https://www.java.com/en/download/apple.jsp)

[Installation guide](https://www.geeksforgeeks.org/how-to-install-java-on-macos/)

[Maven build tool](https://maven.apache.org/download.cgi)

[IntelliJ IDE Community Edition](https://www.jetbrains.com/idea/download/#section=mac)

###### Maven dependencies

[Selenium Webdriver (3.141.59)](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59)

[TestNG for test runner](https://mvnrepository.com/artifact/org.testng/testng/6.14.3)

[JSON for handing inputs](https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple/1.1.1)
 
 
## Instructions:
Download and Install Java

java -version => should print version

Download and Install Maven (set Java path)

mvn -version => should print version

Install IntelliJ IDE

Import the project

Open cmd and run `mvn test -Dtest=BuggyCarsTest`


###### Note
Please add chromedriver file in src/main/resources/ for both [MAC and Windows](https://chromedriver.chromium.org/downloads)

Please update the path format for windows from "/" to "\\" in the below files

`main/java/base/driver.java`

`test/java/tests/BuggyCarsTest.java`


###### Update username:
If you are running the test again, please update the "username" field in src/main/resources/data.json

--------------------------------------------
###### API AUTOMAION
---------------------------------------------

###### Requirements:
1. Postman client
Download link → https://www.postman.com/product/rest-client/
2. Node.js
Download link → https://nodejs.org/en/download/
3. newman (NPM Package) 
	Command → npm install -g newman

###### Test description:
API request with POST:
https://k51qryqov3.execute-api.ap-southeast-2.amazonaws.com/prod/users

Body:
{"username":{{$randomUserName}},"firstName":"test-9","lastName":"test-9","password":"Test#123","confirmPassword":"Test#123"}

Assertion performed:
Verify status code returns 201

###### Instructions to run tests on console:
1. Make sure Node.js is installed in the system
2. Install newman NPM package
	Command : npm install -g newman
3. Download you API collection from postman
4. Open command prompt and Navigate to the folder where your API collection file is located
5. Run the command to execute your test
	Command : newman run <collection_name.json>

