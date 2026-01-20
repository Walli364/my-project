# Java with Gradle - CI/CD Practice

A simple Java project with Gradle for practicing CI/CD with GitHub Actions.

## Prerequisites

- Java 17 or higher
- Gradle 8.x (or use the included Gradle wrapper)

## Project Structure

```
java-with-gradle/
├── src/
│   ├── main/java/com/example/
│   │   └── App.java           # Main application
│   └── test/java/com/example/
│       └── AppTest.java       # Unit tests
├── .github/workflows/
│   └── ci.yml                 # GitHub Actions workflow
├── build.gradle               # Gradle build configuration
├── settings.gradle            # Gradle settings
└── README.md
```

## Building the Project

```bash
# Build the project
./gradlew build

# Run the application
./gradlew run

# Run tests only
./gradlew test

# Generate test coverage report
./gradlew jacocoTestReport
```

## CI/CD Pipeline

The GitHub Actions workflow (`.github/workflows/ci.yml`) includes:

### Build Job
- Triggers on push to `main`, `master`, or `develop` branches
- Triggers on pull requests to `main` or `master`
- Sets up JDK 17
- Builds the project
- Runs all tests
- Generates code coverage report
- Uploads test results and coverage reports as artifacts

### Deploy Job
- Runs only on the `main` branch after successful build
- Builds the JAR file
- Uploads the JAR as an artifact

## Practice Exercises

Here are some exercises to practice CI/CD:

### 1. Break the Build
- Introduce a bug in `App.java` and push to see the CI fail
- Fix the bug and push again to see it pass

### 2. Add New Tests
- Add a new method to `App.java`
- Write tests for it in `AppTest.java`
- Push and verify the CI passes

### 3. Create a Pull Request Workflow
- Create a new branch
- Make changes
- Open a PR and observe the CI checks

### 4. Add Code Quality Checks
- Add Checkstyle or SpotBugs to `build.gradle`
- Update the CI workflow to run these checks

### 5. Add Deployment Steps
- Modify the deploy job to publish to GitHub Packages
- Or add Docker build and push steps

## Viewing Reports

After the CI runs, you can download the artifacts:
- **test-results**: HTML test report
- **coverage-report**: JaCoCo code coverage report
- **application-jar**: Built JAR file (only from main branch)

## License

MIT
