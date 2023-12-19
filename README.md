#DocumentationDetective
: Develop a task using Gradle that automatically scans the codebase for classes and methods annotated with @ClassDocumentaion and @MethodDocumentation.


## Features
- Lists all classes in a specified package.
- Identifies classes annotated with @ClassDocumentation.
- Identifies methods annotated with @MethodDocumentation.
- Checks for Javadoc comments in classes and methods.
- Highlights classes annotated with @ClassDocumentation but lacking Javadoc.
- Highlights methods annotated with @MethodDocumentation but lacking Javadoc.
- Lists methods lacking @MethodDocumentation but containing Javadoc.


## Usage
- Run the Application:

- Execute the main method in the DocumentationDetectiveApplication class.
The application will print its output to the console and write detailed results to "ExtractedDocumentation.txt".