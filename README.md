# request-dispatcher-example
"request-dispatcher-example" is a GitHub repository containing a Java servlet code example demonstrating the usage of request dispatching in a web application.
# Request Dispatcher Example

This repository contains a Java servlet code example demonstrating the usage of request dispatching in a web application.

## Introduction

In this example, we have two servlets: `HelloServlet` and `Home`. The `HelloServlet` is responsible for handling the login request and forwarding it to the `Home` servlet based on the provided username and password. The `Home` servlet then displays a welcome message to the logged-in user.

## Prerequisites

- Java Development Kit (JDK)
- Java Servlet API
- Servlet container or application server (e.g., Apache Tomcat)

## Getting Started

1. Clone the repository:

   ```shell
   git clone https://github.com/your-username/request-dispatcher-example.git

Import the project into your IDE.

Set up the project dependencies and Servlet API in your build configuration.

Deploy the application to a servlet container or application server.

Access the application through the URL: http://localhost:8080/hello-servlet (assuming the default server configuration).

## Usage
Open a web browser and navigate to the login page at http://localhost:8080/hello-servlet.

Enter a valid username and password:

For the admin user:
Username: admin
Password: 123
For the student user:
Username: student
Password: 123
After successful login, you will be redirected to the home page, where you will see a welcome message displaying the logged-in user's name.

If the login credentials are incorrect, you will see an "Invalid user" message.

## License
This project is licensed under the MIT License.
