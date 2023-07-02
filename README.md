## Testing the Login Functionality of Souce Demo with Selenium and Java

This Java program employs Selenium WebDriver to test the https://www.saucedemo.com/ login functionality. It executes two scenarios:
- Logging in as a standard user and confirming navigation to the homepage
- Logging in as a locked-out user
- Confirming the error message


## Prerequisites

Ensure you have the following dependencies installed and configured before executing the tests:

- Selenium WebDriver (version 4.10.0)
- ChromeDriver (version 114) *Depending on your Chrome development version


## Setup

1. Download the source code or clone the repository.
2. Ensure that the most recent version of Chrome is installed on your computer.
3. Download the ChromeDriver version compatible with your Chrome browser and operating system.
4. Set the JRE Library System to JavaSE-1.8


## Testing Procedures

1. Open the project in your Java IDE.
2. Configure the project to use the necessary dependencies (Selenium WebDriver, Selenium Dev Tools, and Selenium Chrome Driver).
3. Construct and execute the 'run' class.
The program will execute the logon scenario tests and output the results to the console.


## Troubleshooting

If you encounter any problems, consider the following solutions:

- Ensure the correct ChromeDriver version is used based on the Chrome browser version.
- Verify that the ChromeDriver executable is accessible and that its path is appropriately set in the code.
- Check that all required dependencies (Selenium WebDriver, Selenium Dev Tools, and Selenium Chrome Driver) are installed and configured correctly.
