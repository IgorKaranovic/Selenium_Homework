# Selenium_Homework
Basic Navigation TestsCreating project
1.Create a newproject named BasicNavigationTestsusing IntelliJ. 
2.Add all the requiredseleniumdependencies.
3.Under src create two packages com.cbt.utilities and com.cbt.tests.Utilities
1.Create class BrowserFactoryunder utilitiespackage. 
2.Create a public static methodgetDriverwhich takes a string argument. 
3.If you are using Windows, andifthe String argument is `safari`, return null. 
If you are using Mac, andifthe String argument is `edge`, return null. NOTEFor this step, you need to researchhow to find out your operating system programmatically using Java.
4.Inall other cases,return a new WebDriver objectforChromeDriver, FirefoxDriver, EdgeDriveror SafariDriverbased on the value of the string argument.
NOTEFor this exercise, you need to research how to launchEdgeusing Seleniumif you are using Windows.
NOTEFor this exercise, you need to research how to launchSafariusing Seleniumif you are using Mac.
5.Create class StringUtilityunder utilitiespackage. 
6.Create a publicstatic method verifyEquals which takes two string arguments,expected and actual.
7.The method prints `PASS`if both strings are equals to each other. Else it prints `FAIL`and it also prints the values of both arguments.
Tests
1.Create class NavigationTestsunder testspackage.
2.Automate the provided testcaseusing 3 different browsers. 


Create a separate test method for each browser. 
a.If you are using Windows, create test methods for Chrome, Firefox, Edge. 
b.If you are using Windows, create test methods for Chrome, Firefox, Safari. 
4.Each testshould close the browser after completion.
5.Test methods must use the utilities.
6.Runall threetest methods from the main method. 
Test Case
1.Open browser
2.Go to website https://google.com
3.Savethe titlein a string variable
4.Go to https://etsy.com
5.Savethe title in a string variable
6.Navigate back to previouspage
7.Verify that title is same is in step 3
8.Navigate forward to previous page
9.Verify that title is same is in step 5
