# Codtech_Task1

*COMPANY* : CODTECH IT SOLUTUINS

*NAME* : SHLOK GOYAL

*INTERN ID* : CT04DN206

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTOR* : NEELA SANTOSH


*DESCRIPTION* -
This Java project demonstrates basic file handling operations such as writing, reading, and modifying the contents of a file using core Java I/O classes. It is designed to help beginners understand how file manipulation works in Java and how to organize code using classes and methods. The program is structured in a simple and clear manner to make learning easy and practical.

The main class in this project is FileHandler, which extends a utility class called methods. The methods class contains three main static methods: writeToFile, readToFile, and modifyFile. These methods encapsulate the logic required to perform basic file operations on a text file named myfile.txt.

The program begins execution in the main method of the FileHandler class. It first writes the string “Hello, This is Task 1” to myfile.txt. This is done using the writeToFile method, which creates a FileWriter object to write content to the file. If the file already exists, it will be overwritten. After writing, a confirmation message is printed to the console.

Next, the readToFile method is called, which opens the file using a FileReader wrapped in a BufferedReader. It reads and prints each line of the file until the end is reached. This step demonstrates how to read file content line by line in Java.

The third operation is performed using the modifyFile method. This method internally calls the writeToFile method again with new content—“Hello, Task 1 is completed”. It overwrites the original content in the file. After modification, the file is read again using readToFile to display the updated content.

The program is robust against errors. Each file operation is enclosed in a try-catch block to handle potential IOExceptions. If an error occurs during writing or reading, it is caught and a descriptive message is printed to the console. The stack trace is also printed to help in debugging.

This project uses only Java’s standard I/O libraries, making it lightweight and portable without any external dependencies. It is well-suited for academic tasks, beginner-level assignments, and those learning file operations in Java. The separation of logic into a parent methods class also demonstrates the concept of inheritance and modular design.

The file name is stored as a static string variable in the methods class, making it easy to change the target file without modifying multiple lines of code. All methods are static, meaning they can be called directly without creating an instance of the class.

In summary, this Java project is a simple but complete demonstration of file handling. It shows how to write to, read from, and modify a text file, and it’s structured in a way that promotes code reuse and clarity. Whether used for practice or as a component in a larger system, it offers a practical and educational experience in handling files with Java.
