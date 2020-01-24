Feature: login

@validlogin
Scenario: logincheck
Given open chrome and start app
When i enter valid crendentials
Then user should login
@invalidlogin
Scenario: invalidlogincheck
Given start chrome browser and open application
When i enter invalid username and password
Then i should not login