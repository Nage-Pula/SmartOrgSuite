# 🚀 SmartOrgSuite

**SmartOrgSuite** is a real-time departmental task management simulation built in Java 17.  
It models a multi-department organization and handles task assignments, parallel execution, deadline monitoring, and activity logging — following modern enterprise coding practices.

---

## 🏢 Project Description

This project simulates an organization's task workflow across multiple departments (`Tech`, `HR`, `Admin`) using **OOP**, **Multithreading**, **Collections**, **Exception Handling**, **Streams API**, and **File I/O**.

Tasks are dynamically assigned to employees and executed in real-time using Java's `ExecutorService`.  
All activities like task assignment, start, completion, or failure are logged into a file.

---

## 🛠️ Tech Stack

| Component          | Technology        |
|--------------------|--------------------|
| Language           | Java 17 (LTS)       |
| Build Tool         | Maven               |
| IDE                | Eclipse             |
| Testing Framework  | JUnit 5             |
| Logging            | FileWriter, Logger  |
| Version Control    | Git + GitHub        |

---

## ✨ Features

- 🧠 Object-Oriented Design with Inheritance, Abstraction, Interfaces
- 📚 Collections Framework usage (HashMap, Queue)
- ⚡ Multithreading using ExecutorService
- 🧪 Unit Testing with JUnit 5
- 🛡️ Custom Exception Handling
- 📜 Persistent task logs written to `/logs/task_log.txt`
- 📈 Console summary report of all tasks
- 🔥 Deadline validation for automatic failure handling
- 🎯 Professional project structure (modular, scalable, maintainable)

---

## 📥 Installation & Running

### Prerequisites:
- Java 17+
- Maven installed

### Steps:

```bash
# Clone the repo
git clone https://github.com/nage-pula/SmartOrgSuite.git

# Navigate into the project directory
cd SmartOrgSuite

# Build the project
mvn clean install

# Run the application
mvn exec:java -Dexec.mainClass="com.smartorg.MainApp"


SmartOrgSuite/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com.smartorg/
│   │           ├── departments/
│   │           ├── models/
│   │           ├── services/
│   │           ├── utils/
│   │           └── exceptions/
│   └── test/
│       └── java/
│           └── com.smartorg/
│               ├── AppTest.java
├── logs/
│   └── task_log.txt
└── pom.xml


Sample Output (Console)
Welcome to SmartOrgSuite 

--- Task Summary ---
Total Tasks Assigned: 4
Total Tasks Completed: 4
Total Tasks Failed: 0
----------------------

Sample Log File (task_log.txt)
[2025-04-27 18:28:22] [ASSIGNED] Task: Fix backend bug to: Alice
[2025-04-27 18:28:24] [STARTED] Task: Fix backend bug by: Alice
[2025-04-27 18:28:26] [COMPLETED] Task: Fix backend bug by: Alice
...

/**************************************************************************************************************/
 Author:-
 
Nageswara Rao Pula

--> https://github.com/Nage-Pula/   						**GitHub Profile --> Nageswara Rao Pula**
--> https://www.linkedin.com/in/nageswara-rao-pula-a9b751144/ 	**LinkedIn profile --> Nageswara Rao Pula**.

/**************************************************************************************************************/