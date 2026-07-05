1. What is Spring Initializer?
Ans:Spring Initializer is a website that generates a ready-to-use Spring Boot project.Without it, we'd have to create the Maven project, configure dependencies, and set up the project manually.
2. Why did we choose JAR instead of WAR?
Ans:JAR: Includes an embedded Tomcat server. Modern Spring Boot applications use this.
   WAR: Used when deploying to an external application server like Tomcat or JBoss.
3. What is Maven?
Ans: Maven is a build automation and dependency management tool.
It helps us:
Download required libraries.
Build the project.
Run tests.
Package the application.
4. What is pom.xml?
Ans: A pom.xml (Project Object Model) is the core configuration file for any Maven-based Java project. It serves as the blueprint of your project, containing metadata (name, version), dependencies, plugins, and build instructions. Maven reads this file to automatically download libraries and compile your code.
5. What is Git?
Ans:Git is a Version Control System (VCS).
It records every change made to your project.
6. What does git init do?
Ans:Creates a hidden .git folder.This folder stores the complete history of your project.Without .git, your project is just a normal folder.
7. What does git status do?
Ans: Which files changed.Which files are untracked.Which files are ready to commit.
8. What does git add . do?
ANs:Moves all changes into the staging area.It does not save them permanently.Think of it as putting documents into an envelope before mailing them.
9. What does git commit do?
Ans:git commit saves a snapshot of your staged changes to your local repository's history.
10. What does git remote add origin do?
Ans:Connects your local project to a remote GitHub repository.
origin is just the default name for that remote repository.
11. What does git push do?
Ans:Uploads your local commits to GitHub.
12. 
