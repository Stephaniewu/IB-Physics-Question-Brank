========================
BUILD OUTPUT DESCRIPTION
========================

When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, go to the dist folder and
type the following:

java -jar "CSIANew.jar" 

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.

Notes: This program is be in the form of a multiple choice quiz game that presents physics questions of different IB physics topics to users, keeping track of the number of questions they answered correctly, incorrectly, and their scores. Users are awarded 10 points with each correct answer (but not penalized for incorrect answers), and are promoted to the next level upon answering 5 questions correctly, until Level 3 is reached. Additionally, this program incorporates persistence by allowing users the choice to save their 1) number of questions answered correctly, 2) incorrectly, 3) score, 4) level, and the 5 last question that they worked on before exiting the program. These aforementioned information will stored into and retrieved from a text file. 


* If two JAR files on the project classpath have the same name, only the first
JAR file is copied to the lib folder.
* Only JAR files are copied to the lib folder.
If the classpath contains other types of files or folders, these files (folders)
are not copied.
* If a library on the projects classpath also has a Class-Path element
specified in the manifest,the content of the Class-Path element has to be on
the projects runtime path.
* To set a main class in a standard Java project, right-click the project node
in the Projects window and choose Properties. Then click Run and enter the
class name in the Main Class field. Alternatively, you can manually type the
class name in the manifest Main-Class element.
