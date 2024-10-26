# Project SAE 3.A.01

## Role Assignment
- Mathias Morel: Project Manager
- Benjamin Cornet: Team Member
- Mathéo Dalmasso: Team Member
- Simon Caillieret: Team Member

---

## Task Assignment

| Feature                                   | Design Pattern(s) Used            | Author(s)                      |
| ----------------------------------------- |------------------------------------|--------------------------------|
| Test Case Representation                  |                                    | Mathéo                         |
| Problem Representation                    | Builder                            | Benjamin                       |
| Problem Configuration                     | Builder                            | Benjamin                       |
| Process Representation                    | Adapter                            | Benjamin                       |
| Execution Time Limitation for a Process   | Decorator                          | Benjamin                       |
| Memory Limitation for a Process           | Decorator                          | Benjamin                       |
| C Program Compilation                     | Strategy                           | Mathias                        |
| C++ Program Compilation                   | Strategy                           | Mathias                        |
| Java Program Compilation                  | Strategy                           | Mathias                        |
| Python Program Compilation                | Strategy                           | Mathias                        |
| Executing a Compiled C Program            | Strategy                           | Simon                          |
| Executing a Compiled C++ Program          | Strategy                           | Simon                          |
| Executing a Compiled Java Program         | Strategy                           | Simon                          |
| Strict Solution Verification              | Decorator and Strategy             | Mathéo                         |
| Real Number Tolerance Verification        | Decorator and Strategy             | Mathéo                         |
| Case Sensitivity Tolerance Verification   | Decorator and Strategy             | Mathéo                         |
| Space Tolerance Verification              | Decorator and Strategy             | Mathéo                         |
| Order Tolerance Verification              | Decorator and Strategy             | Mathéo                         |
| One of Several Solutions Verification     | Decorator and Strategy             | Mathéo                         |
| External Program Delegated Verification   |                                    |                                |
| Test Case Execution Configuration         | Builder                            | Mathias/Mathéo                 |
| Main Program for Automatic Judge          | Singleton                          | Mathias/Mathéo/Simon/Benjamin  |

---

### How to Launch the Main Program

To launch the main program, use the following command:

```java
./gradlew shadowJar
```

Then execute the following command:

```java
java -jar app/build/libs/lensjudge-shadow-1.0-all.jar app\src\test\resources\ProgTestSae\nameOfTheFile.extension app\src\test\resources\ProgTestSae\file.in ProgTestSae\file.ans -v (1-5)
```
-  -v 1 = Strict verification
-  -v 2 = Order verification
-  -v 3 = Case verification
-  -v 4 = Real numbers verification
-  -v 5 = One of several solutions verification

### Library used
    - AnsiConsole
    - Apache Commons CLI

We used AnsiConsole to color the output of the program.
We used the Apache Commons CLI library to handle command-line arguments.

### IA used
    - Copilot
    - Chatgpt

We used Copilot primarily for error correction and code generation.
We used ChatGPT to gain a deeper understanding of how different design patterns work and to gather insights about our code.

## Commit examples

### For closing an issue
    - git commit -m "Fixes #? - Description of the commit"

### For a bug fix or program changes commit
    - git commit -m "Description of the commit"

### For mentioning an issue 
    - git commit -m "#? - Description of the commit"
    
---

