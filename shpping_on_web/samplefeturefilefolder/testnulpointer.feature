Feature: User Registration Process
Scenario Outline: to test user registration process end to end
Given navigates to website and click on sign in button
Then Enter "<useremailid>" user email id
Then click on create an account button
Then system should show message for successful log in 

Examples:
         |useremailid|
         |ak.yesankar@outlook.com|