Feature: Login fuctionality

Scenario: validate login page with valid creadential

Given user should be on chrome browser
When user enter username, password
And click on login button
Then page should be navigate home page
And close the browser


Scenario: validate login page with invalid creadential

Given user should be on chrome browser
When user enter invalid username, password
And click on login button
Then error massage should be dispaly to the user
And close the browser

@RunThis
Scenario Outline: validate login page with multiple sets of creadential

Given user should be on chrome browser
When the user enters username "<username>" and password "<password>"
And click on login button
Then error massage should be dispaly to the user
And close the browser

Examples:
      | username | password |
      | kiran@gmail.com    | 123456 |
      | swapnil@gmail.com     | swapnil123 |
      | guest@gmail.com    | guest123 |
      
      