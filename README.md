# Week 1 Java Lab — Introduction to Java

Welcome to the Week 1 lab! This lab is intentionally simple and repetitive by design.

You will mostly be working with `System.out.println`. The goal of this lab is to give you as much hands-on practice with the basic structure of Java as possible so it starts to feel familiar.

To be as successful as possible, run your code often.


---


## Running your code

This lab contains many small programs. Each program has its own main method.

You can run any individual program in two ways.


### Option 1: Run from Visual Studio Code

1. Open the Java file you want to run  
   Example:  
   `src/main/java/week01/part00_start_here/HelloWorld.java`
2. Right click anywhere in the file
3. Select Run Java

The program output will appear in the terminal.

If you have the java extension installed, you can also simply click the play button in the top right corner of the editor. 


### Option 2: Run using javac and java

From the root of the project, compile the file:

``` java 

javac src/main/java/week01/part00_start_here/HelloWorld.java
```

Then run it:

``` java
java -cp src/main/java week01.part00_start_here.HelloWorld
```

You can repeat this for any file that has a main method.

---

## What TODO means

You will see many comments that start with TODO.

Example:

// TODO: Print exactly: Hello, Java!

A TODO comment tells you what code you need to write. Once you have written the required code, you can remove the TODO comment.
