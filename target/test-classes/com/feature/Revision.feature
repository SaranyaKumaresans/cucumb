Feature: login
@tag1
Scenario: successfull logins with valid credentials
Given User Launches the Chrome browser
When User opens Url
And user enters username 
And user enters password 
Then user clicks Login and successfully logged

@tag2
Scenario:User has to search for hotel
Given adactin group of hotels search hotel form
When user select the desired location and the name of the hotel
And user select the type of room and the number of rooms
And user enter the check in date and check out date
And user select the number of adults and children
And user click the search button
Then user get the available hotels
@tag3
Scenario:User selects from available hotels
Given user has the selects hotel form
When user select the desired hotel
And user click on the continue button
Then user succesfully selected the available hotels

@tag4
Scenario:user book a hotels
Given user has the book a hotel form
When user enter the first name and last name
And user enter the Billing address and valid credit card number
And user select the credid card type and month and year of expiry date
And user enter the cvv number
Then click on the book now option and the hotel is booked successfull
