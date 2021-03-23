Feature: Validating the REmaap login page
Background:
Given User is in the login page
@smoke
Scenario Outline: User verifying the login page with combination of credentials
When User passing the "<username>" and "<password>"
And Clicking on the login button
Then User should see the invalid password after dashboard
Examples:
|username|password|
|rnooralamine@entrustsoft.in|Admine@1334|
|rnooralamine@entrustsoft.in|Admin@123|
@regression
Scenario: Validating the project selection
When user click on the project
Then user should see the lease details page
@smoke @regression
Scenario: Verifying the add button in the Lease details screen
When user is in the Lease details screen
And click on Add button
And User should see the add record screen
Then user can add and save the new lease
