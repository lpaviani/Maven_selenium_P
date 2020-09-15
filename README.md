# Maven_selenium_P

### Installation
- Install java: 1.8.x (https://java.com/en/download/)
- Install maven: Apache Maven 3.6.3 (https://maven.apache.org) "make sure you have maven working properly by running on console `mvn -v`"
- Clone or download this repository (git clone https://github.com/lpaviani/Maven_selenium_P.git)



### Running Through CLI

In order to run using CLI use the follow steps:
- Open a terminal and access the root folder of the project
- Run the command line : `mvn clean test`
This will run anything on the test folder that has the @Test on it.

### Docker ...In progress...

I did not manage to fully work with docker yet. but here is the steps i manage to run so far:

1. From the project root forlder, run the comand <docker build --tag tagname .>
2. Then you would simply run the container created with <docker run tagname> //But im getting issues initializing chrome inside the container
