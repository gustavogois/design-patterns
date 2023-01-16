# Single Responsability Principle

A class should have only one reason to change (responsability).

When you follow the SRP, your code is smaller, cleaner, and less fragile. 

## Introduction

### how do you follow this principle? 

A simple answer is you can divide a big problem into smaller chunks based on different responsibilities and put each of these small parts into separate classes.

### what do we mean by responsibility? 

In simple words, **responsibility is a reason for a change**. 

In his best-selling book Clean Architecture (Pearson, 2017), Robert C. Martin warns us not to confuse this principle with the principle that says a function should do one, and only one, thing. He also says that perhaps the best way to understand this principle is when you look at the symptoms of violating it.

## Practice

### 01

#### Problems:

I violate the SRP here. You can see that displaying an employee detail, generating an employee id, or checking a seniority level are all different activities. Since I put everything in a single class, I may face problems adopting new changes in the future.

Here are some possible reasons:

- The top management can set a different criterion to decide a seniority level.
- They can also use a complex algorithm to generate the employee id.

In each case, I’ll need to modify the Employee class. Now you understand that it is better to follow the SRP and separate these activities.

### 02

I introduce two more classes. The SeniorityChecker class now contains the checkSeniority() method and the EmployeeIdGenerator class contains the generateEmpId(...) method to generate the employee id. As a result, in the future, if I need to change the program logic to determine the seniority level or use a new algorithm to generate an employee id, I can make the changes in the respective classes. Other classes are untouched, so I do not need to retest those classes.

To improve the code readability and avoid clumsiness inside the main() method, I use the static method showEmpDetail(...). This method calls the displayEmpDetail() method from Employee, the generateEmpId() method from EmployeeIdGenerator, and the checkSeniority() method from SeniorityChecker. You understand that this method was not necessary, but it makes the client code simple and easily understandable.

## Point To Note

Note that the SRP does not say that a class should have at most one method. Here the emphasis is on the single responsibility. There may be closely related methods that can help you to implement a responsibility. For example, if you have different methods to display the first name, the last name, and a full name, you can put these methods in the same class. These methods are closely related, and it makes sense to place all these display methods inside the same class.

In addition, you should not conclude that you should always separate responsibilities in every application that you make. You need to analyze the change’s nature. It is because too many classes can make your application complex and thus difficult to maintain. But if you know this principle and think carefully before you implement a design, you are likely to avoid the mistakes discussed earlier.
