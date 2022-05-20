Feature: Validating login function of Adacitin Hotel application

Scenario: validating login with incorrect username and incorrect password
Given user is on adactin hotel app on chrome browser
When user enter username and password
And user should click login button
Then user validate home page
