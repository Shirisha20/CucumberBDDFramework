Feature: Facebook Unsuccessful Signup

 Scenario: Create a new Account scenario with Blank FirstName
 When user enters Signup Credentials with blank firstname
 |FName|LName|EmailId|ReEmail|Pwd|
| |abcd|abc@gmail.com|abc@gmail.com|test123|
Then verify blank FirstName error messege 

 Scenario: Create a new Account scenario with Blank EmailId
 When user enters Signup Credentials with blank EmailId
 |FName|LName|EmailId|ReEmail|Pwd|
| abc|abcd|abc@gmail.com||test123|
Then verify blank EmailId error messege 
