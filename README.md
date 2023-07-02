# Tweteroo-back

Back-end for tweteroo, a simplified twitter clone.

:)

## About

Tweteroo is a simplified twitter clone where you can write your tweets and view other users' posts

## How to run

To run the Tweteroo-back project, follow the steps below:

1. Clone this repository.

2. Make sure you have the JDK (Java Development Kit) installed on your system. You can check this by running the java -version command in your terminal or command prompt. If you don't have the JDK installed, download and install it for your operating system.

3. In the project directory, check if the JAR file is present. It is usually generated in the target folder for Maven projects. If the JAR file is not present, you may need to generate it by running the appropriate build command, such as `mvn package` for Maven projects.

4. Open a terminal or command prompt in the project folder or navigate to it using the cd command (e.g., cd /path/to/project).

5. Run the following command to start the Spring application in JAR format:

  ```bash
  java -jar filename.jar
  ```

  Replace filename.jar with the actual name of your JAR file.

6. Wait for Spring to initialize and look for the "Started Application" or similar message in the terminal.

7. After successful initialization, you can access the Tweteroo application in your browser using the URL http://localhost:8080 or the port defined by your application.

8. Follow the steps from the frontend repository [tweteroo-front](https://github.com/gabrielportelagomes/tweteroo-front).

Make sure you have all the necessary dependencies in your JAR file and the correct configurations set for the environment you are running the application in.