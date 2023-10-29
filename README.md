

# Automation project with Cucumber and Java

This repository contains a Automation test for frontend with serenity framework.




## Table of contents
 - [Introduction](https://github.com/stiagoq/prueba_arus_serenity_bdd/tree/main#introduction) 
 - [Getting started](https://github.com/stiagoq/prueba_arus_serenity_bdd/tree/main#getting-stared)
 - [Running the tests](https://github.com/stiagoq/prueba_arus_serenity_bdd/tree/main#running-test)
 - [Web browser](https://github.com/stiagoq/prueba_arus_serenity_bdd/tree/main#web-browsers)
 - [General implementation details](https://github.com/stiagoq/prueba_arus_serenity_bdd/edit/main/README.md#general-implementation-details)
 - [Tests](https://github.com/stiagoq/prueba_arus_serenity_bdd/tree/main#test)

## Introduction 

This project contains examples of test automation using Cucumber and the Java programming lenguage. Cucumber is tool that allows you to create automation test using the Gherkin format, which uses the natural lenguaje used  in behavior-driven development (BDD).

This automation uses the screenplay pattern through the Serenity BDD framework which is an open source that allows creating automation software testing.

## Getting stared

The following instructions are for running this automation test repository on your local machine.

### Requirements 
To run the project on your local machine it is necessary to install:


```bash
  Java JDK 8 or superior 
  Gradle
```

## Project Setup 
Steps for setting up a development environment:
- Clone this repository in your local machine.
- Open the automation project in integred development environment (IDE), for instance; IntelliJ IDEA, VScode, Eclipse, etc.
- It is necessary to have the dependencies found in the build.gradle file.

## Running test
- You can compile the project with following command:

```bash
gradle test
```
- You can running the project in the IDE 

## Web browsers
This automation test currently runs on the following web browsers:
- Google Chrome Version 115 or higher
Another option is to use the  of [WebDriverManager](https://github.com/bonigarcia/webdrivermanager) denpendecy created by Boni Garcia

## General implementation details
The test scenario are created  in the feature files that have ending *.feature*. These files supports the Gherking format and connected to step definition methods using keywords such as @Given, @When and @Then. The step definition are connected that Task classes that use the elements created in the User Interface classes to replicate the user's actions. Task classes are used by Given and When,where high-level actions are performed. For the Then step,  it communicates with Question classes to perform validations.

```bash
   📦prueba_tyba_serenity_bdd
   ┣ 📂src
   ┃ ┣ 📂 main
   ┃ ┃ ┣ 📂java
   ┃ ┃ ┃ ┣ 📂test
   ┃ ┃ ┃   ┣ 📂certificationlogin
   ┃ ┃ ┃     ┣ 📂exceptions
   ┃ ┃ ┃     ┣ 📂questions
   ┃ ┃ ┃     ┣ 📂task
   ┃ ┃ ┃     ┣ 📂userinterfaces
   ┃ ┃ ┃     ┣ 📂utils 
   ┃ ┃ ┃       ┣ 📂ConstantManage
   ┃ ┃ ┃       ┣ 📂drivers
   ┃ ┃ ┃       ┣ 📂others    
   ┃ ┃ ┃       
   ┃ ┣ 📂test
   ┃ ┃ ┣ 📂java
   ┃ ┃ ┣ 📂test
   ┃ ┃  ┣ 📂certificationlogin
   ┃ ┃     ┣ 📂runners
   ┃ ┃     ┣ 📂stepdefinitions
   ┃ ┃  ┣ 📂resources
   ┃ ┃ ┃    ┣ 📂login
   ┃ ┃ ┃      ┗ 📂features 
   ┣ 📂target
   ┣ 📜.gitignore
   ┣ 📜bulid.gradle
   ┣ 📜README.md
```



`src/main/java/test/validationshoppingcar/exceptions`: This folder contains the file the class that encapsulate some the errors. 

`src/main/java/test/validationshoppingcar/questions`: This folder contains class that validate the test was completed.

`src/main/java/test/validationshoppingcar/task`: This folder contains classes with methods of Serenity BDD that with interact app web simulating the user actions.

`src/main/java/test/validationshoppingcar/userinterfaces`:This folder contains classes that have the elements which with the user interacts. For examples buttons, inputs, links, etc.

`src/main/java/test/validationshoppingcar/utils`: This folder contains classes that have constants which used in the test and settings of web browser.

`src/test/java/test/validationshoppingcar/runners`: This folder contains class that have method to run the test scenario in the features.

`src/test/java/test/validationshoppingcar/stepdefinitios`: This folder contians classes that have annotations @Given, @When, and @Then, they are connected with scenarios writeten in the files *.feature*.

`src/test/java/resources/features`: This folder contians classes that have feature files that are written of test scenarios. These files support the Gherkin format.

## Test 
Test scenarios are created in the feature files using the Gherkin language. They are connected to methods in StepDefinition classes using annotations like @Given, @When, and @Then. The step definition methods are connected to Task classes for Given and When steps, where high-level actions are performed. These Task classes can invoke Interaction classes for low-level actions. For the Then step, it communicates with Question classes to perform validations.

### Build with
- [Cucumber](https://cucumber.io/)-Framework
- [Serenity BDD](https://serenity-bdd.info/)-Framework
- [Java](https://www.java.com/es/)-Technology

### Author 
- [@Santiago Quintero](https://github.com/stiagoq)
