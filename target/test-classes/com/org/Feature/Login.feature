Feature: Login Functionality module of automation practise Webpage 
Contains E2E functionality such as login, add a product to cart, Place Order and SignOut.

@Sce1 
Scenario: User Launch browser and navigate to application
Given User launch the browser
Then Navigate to application

@Sce2 
Scenario Outline: Verify the user login the application with valid credentials.
Given User enter the valid username "<UserName>"
And User enter the valid password "<Password>"
And User click the signin button
Then User validate the username "<LoginVP>" displayed in the header 
And User close the browser
Examples:
|UserName|Password|LoginVP|
|Anbarasi|83YR4E|Hello Anbarasi!|
@Sce11
Scenario: Quit Browser
Given User Quit Browser

@Sce4
Scenario: User Launch browser and navigate to application
Given User launch the browser
Then Navigate to application

@Sce5
Scenario Outline: To verify whether the check-out date field accepts a later date than checkin date.
Given User enter the valid username "<UserName>"
When User enter the valid password "<Password>"
And User click the signin button
And User Select location as in test data "<Location>"
And User Select hotel as in test data "<Hotel>"
And User Select room type as in test data "<RoomType>"
And User Select no-of-rooms as in test data "<NoOfRooms>"
And User Enter checkin-date later than the checkout-date "<checkin-date>"
And User Enter Checkout-date before the checkin-date "<checkout-date>"
And User select AdultPerRoom option "<AdultperRoom>" 
And User Click on the search
Then User TestcaseTwo verify for the valid "<TC_ID>" error message "<TC-Verification>" 
And User captures ScreenShot
And User close the browser

Examples:

|TC_ID|UserName|Password|Location|Hotel|RoomType|NoOfRooms|checkin-date|checkout-date|AdultperRoom|TC-Verification|
|TC_102|Anbarasi|83YR4E| Sydney |Hotel Sunshine|Double|1|21/02/2019|19/02/2019|1|Check-In Date shall be before than Check-Out Date|

@Sce6
Scenario: Quit Browser
Given User Quit Browser

@Sce7
Scenario: User Launch browser and navigate to application
Given User launch the browser
Then Navigate to application

@Sce8
Scenario Outline: To check if error is reported if check-out date field is in the past
Given User enter the valid username "<UserName>" 
When User enter the valid password "<Password>"
And User click the signin button
And User Select location as in test data "<Location>"
And User Select hotel as in test data "<Hotel>"
And User Select room type as in test data "<RoomType>"
And User Select no-of-rooms as in test data "<NoOfRooms>"
And User Enter checkin-date later than the checkout-date "<checkin-date>"
And User Enter Checkout-date before the checkin-date "<checkout-date>"
And User select AdultPerRoom option "<AdultperRoom>" 
And User Click on the search
Then User TestCaseThree verify for the valid "<TC_ID>" error message "<TC-Verification>" 
And User captures ScreenShot
And User close the browser

Examples:

|TC_ID|UserName|Password|Location|Hotel|RoomType|NoOfRooms|checkin-date|checkout-date|AdultperRoom|TC-Verification|
|TC_103|Anbarasi|83YR4E| Sydney |Hotel Sunshine|Double|1|14/02/2019|16/02/2019|1|Check-In Date should be either Today or Later Date|

@Sce
Scenario: Quit Browser
Given User Quit Browser

@Sce9
Scenario: User Launch browser and navigate to application
Given User launch the browser
Then Navigate to application

@Sce10
Scenario Outline: To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel
Given User enter the valid username "<UserName>"
When User enter the valid password "<Password>"
And User click the signin button
And User Select location as in test data "<Location>"
And User Select hotel as in test data "<Hotel>"
And User Select room type as in test data "<RoomType>"
And User Select no-of-rooms as in test data "<NoOfRooms>"
And User Enter checkin-date later than the checkout-date "<checkin-date>"
And User Enter Checkout-date before the checkin-date "<checkout-date>"
And User select AdultPerRoom option "<AdultperRoom>" 
And User Click on the search
Then User TestCasefour verify for the valid "<TC_ID>" error message "<TC-Verification>" 
And User captures ScreenShot
And User close the browser

Examples:

|TC_ID|UserName|Password|Location|Hotel|RoomType|NoOfRooms|checkin-date|checkout-date|AdultperRoom|TC-Verification|
|TC_104|Anbarasi|83YR4E| Sydney |Hotel Sunshine|Double|1|24/02/2019|26/02/2019|1|Sydney|

@Sce11
Scenario: Quit Browser
Given User Quit Browser

@Sce12
Scenario: User Launch browser and navigate to application
Given User launch the browser
Then Navigate to application

@Sce13
Scenario Outline: To verify whether Check-in date and Check Out date are being displayed in Select Hotel page according to the dates selected.
Given User enter the valid username "<UserName>"
When User enter the valid password "<Password>"
And User click the signin button
And User Select location as in test data "<Location>"
And User Select hotel as in test data "<Hotel>"
And User Select room type as in test data "<RoomType>"
And User Select no-of-rooms as in test data "<NoOfRooms>"
And User Enter checkin-date later than the checkout-date "<checkin-date>"
And User Enter Checkout-date before the checkin-date "<checkout-date>"
And User select AdultPerRoom option "<AdultperRoom>" 
And User Click on the search
Then User TestCasefiveA verify for the valid "<TC_ID>" Check-In Date "<TC-Verification1>" 
Then User TestCasefiveB verify for the valid "<TC_ID>" Check-Out Date "<TC-Verification2>" 
And User captures ScreenShot
And User close the browser

Examples:

|TC_ID|UserName|Password|Location|Hotel|RoomType|NoOfRooms|checkin-date|checkout-date|AdultperRoom|TC-Verification1|TC-Verification2|
|TC_105|Anbarasi|83YR4E| Sydney |Hotel Sunshine|Double|1|24/02/2019|26/02/2019|1|24/02/2019|26/02/2019|

@Sce14
Scenario: Quit Browser
Given User Quit Browser

@Sce15
Scenario: User Launch browser and navigate to application
Given User launch the browser
Then Navigate to application

@Sce16
Scenario Outline: To verify whether no. of rooms entry in Select Hotel page is same as the Number of rooms selected in search hotel page

Given User enter the valid username "<UserName>"
When User enter the valid password "<Password>"
And User click the signin button
And User Select location as in test data "<Location>"
And User Select hotel as in test data "<Hotel>"
And User Select room type as in test data "<RoomType>"
And User Select no-of-rooms as in test data "<NoOfRooms>"
And User Enter checkin-date later than the checkout-date "<checkin-date>"
And User Enter Checkout-date before the checkin-date "<checkout-date>"
And User select AdultPerRoom option "<AdultperRoom>" 
And User Click on the search
Then User TestCasesix verify for the valid "<TC_ID>" NoOfRooms "<TC-Verification1>" 
And User captures ScreenShot
And User close the browser

Examples:

|TC_ID|UserName|Password|Location|Hotel|RoomType|NoOfRooms|checkin-date|checkout-date|AdultperRoom|TC-Verification1|
|TC_106|Anbarasi|83YR4E| Sydney |Hotel Sunshine|Double|3|24/02/2019|26/02/2019|1|3|

@Sce17
Scenario: Quit Browser
Given User Quit Browser

@Sce18
Scenario: User Launch browser and navigate to application
Given User launch the browser
Then Navigate to application

@Sce19
Scenario Outline: To verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page

Given User enter the valid username "<UserName>"
When User enter the valid password "<Password>"
And User click the signin button
And User Select location as in test data "<Location>"
And User Select hotel as in test data "<Hotel>"
And User Select room type as in test data "<RoomType>"
And User Select no-of-rooms as in test data "<NoOfRooms>"
And User Enter checkin-date later than the checkout-date "<checkin-date>"
And User Enter Checkout-date before the checkin-date "<checkout-date>"
And User select AdultPerRoom option "<AdultperRoom>" 
And User Click on the search
Then User TestCaseseven verify for the valid "<TC_ID>" RoomType "<TC-Verification1>" 
And User captures ScreenShot
And User close the browser

Examples:

|TC_ID|UserName|Password|Location|Hotel|RoomType|NoOfRooms|checkin-date|checkout-date|AdultperRoom|TC-Verification1|
|TC_107|Anbarasi|83YR4E| Sydney |Hotel Sunshine|Double|2|24/02/2019|26/02/2019|1|Double|

@Sce20
Scenario: Quit Browser
Given User Quit Browser

@Sce21
Scenario: User Launch browser and navigate to application
Given User launch the browser
Then Navigate to application

@Sce22
Scenario Outline: To verify whether the total price (excl.GST) is calculated as “price per night * no. of nights* no of rooms”.
Given User enter the valid username "<UserName>"
When User enter the valid password "<Password>"
And User click the signin button
And User Select location as in test data "<Location>"
And User Select hotel as in test data "<Hotel>"
And User Select room type as in test data "<RoomType>"
And User Select no-of-rooms as in test data "<NoOfRooms>"
And User Enter checkin-date later than the checkout-date "<checkin-date>"
And User Enter Checkout-date before the checkin-date "<checkout-date>"
And User select AdultPerRoom option "<AdultperRoom>" 
And User Click on the search
And User Click RadioBtn to select Hotel
And User Click on the continueButton
And User gets the Price perday to calculate to total price
Then User TestCaseEight verify for the correct "<TC_ID>" total price 
And User captures ScreenShot
And User close the browser


Examples:

|TC_ID|UserName|Password|Location|Hotel|RoomType|NoOfRooms|checkin-date|checkout-date|AdultperRoom|
|TC_108|Anbarasi|83YR4E| Sydney |Hotel Sunshine|Double|2|24/02/2019|26/02/2019|1|

@Sce23
Scenario: Quit Browser
Given User Quit Browser
@Sce24
Scenario: User Launch browser and navigate to application
Given User launch the browser
Then Navigate to application

@Sce25
Scenario Outline: To verify when pressed, logout button logs out from the application.
Given User enter the valid username "<UserName>"
When User enter the valid password "<Password>"
And User click the signin button
And User Select location as in test data "<Location>"
And User Select hotel as in test data "<Hotel>"
And User Select room type as in test data "<RoomType>"
And User Select no-of-rooms as in test data "<NoOfRooms>"
And User Enter checkin-date later than the checkout-date "<checkin-date>"
And User Enter Checkout-date before the checkin-date "<checkout-date>"
And User select AdultPerRoom option "<AdultperRoom>" 
And User Click on the search
And User Click RadioBtn to select Hotel
And User Click on the continueButton
And User Enters FirstName "<FirstName>"
And User Enters LastName "<LastName>"
And User Enters BillingAddress "<BillingAddress>"
And User Enters CreditCardNo "<CreditCardNo>"
And User Select CreditCardType "<CreditCardType>"
And User Select CcExpiryMonth "<CcExpiryMonth>"
And User Select CcExpiryYear "<CcExpiryYear>"
And User Enters CVVNo "<CVVNo>"
And User Click BookNowBtn
Then User TestCaseNine verify for the correct "<TC_ID>" Sucessfully completed with valid testdata. 
And User captures ScreenShot


Examples:

|TC_ID|UserName|Password|Location|Hotel|RoomType|NoOfRooms|checkin-date|checkout-date|AdultperRoom|FirstName|LastName|BillingAddress|CreditCardNo|CreditCardType|CcExpiryMonth|CcExpiryYear|CVVNo|
|TC_109|Anbarasi|83YR4E| Sydney |Hotel Sunshine|Double|1|24/02/2019|26/02/2019|1|Anbu|Inba|No10 Kamban Nagar Madhavaram Chennai TamilNadu IndiaNo10 Kamban Nagar Madhavaram.|1234123412341234|AMEX|3|2019|609|

@Sce26
Scenario: Quit Browser
Given User Quit Browser

@Sce27
Scenario: User Launch browser and navigate to application
Given User launch the browser
Then Navigate to application

@Sce28
Scenario Outline: To check correct total price is being calculated as “price per night*no of days*no of rooms in Book a hotel page
Given User enter the valid username "<UserName>"
When User enter the valid password "<Password>"
And User click the signin button
And User Select location as in test data "<Location>"
And User Select hotel as in test data "<Hotel>"
And User Select room type as in test data "<RoomType>"
And User Select no-of-rooms as in test data "<NoOfRooms>"
And User Enter checkin-date later than the checkout-date "<checkin-date>"
And User Enter Checkout-date before the checkin-date "<checkout-date>"
And User select AdultPerRoom option "<AdultperRoom>" 
And User Click on the search
And User Click RadioBtn to select Hotel
And User Click on the continueButton
And User Enters FirstName "<FirstName>"
And User Enters LastName "<LastName>"
And User Enters BillingAddress "<BillingAddress>"
And User Enters CreditCardNo "<CreditCardNo>"
And User Select CreditCardType "<CreditCardType>"
And User Select CcExpiryMonth "<CcExpiryMonth>"
And User Select CcExpiryYear "<CcExpiryYear>"
And User Enters CVVNo "<CVVNo>"
And User Click BookNowBtn
Then User TestCaseTen verify for the correct "<TC_ID>" total price 
And User captures ScreenShot
And User close the browser
#And User close the browser


Examples:

|TC_ID|UserName|Password|Location|Hotel|RoomType|NoOfRooms|checkin-date|checkout-date|AdultperRoom|FirstName|LastName|BillingAddress|CreditCardNo|CreditCardType|CcExpiryMonth|CcExpiryYear|CVVNo|
|TC_110|Anbarasi|83YR4E| Sydney |Hotel Sunshine|Double|1|24/02/2019|26/02/2019|1|Anbu|Inba|No10 Kamban Nagar Madhavaram Chennai TamilNadu IndiaNo10 Kamban Nagar Madhavaram.|1234123412341234|AMEX|3|2019|609|

@Sce29
Scenario: User Launch browser and navigate to application
Given User launch the browser
Then Navigate to application

@Sce30
Scenario Outline: To check Hotel name, Location, room type, Total Day, price per night are same in Booking confirmation page as they were selected in previous screen
Given User enter the valid username "<UserName>"
When User enter the valid password "<Password>"
And User click the signin button
And User Select location as in test data "<Location>"
And User Select hotel as in test data "<Hotel>"
And User Select room type as in test data "<RoomType>"
And User Select no-of-rooms as in test data "<NoOfRooms>"
And User Enter checkin-date later than the checkout-date "<checkin-date>"
And User Enter Checkout-date before the checkin-date "<checkout-date>"
And User select AdultPerRoom option "<AdultperRoom>" 
And User Click on the search
And User Click RadioBtn to select Hotel
And User Click on the continueButton
And User Enters FirstName "<FirstName>"
And User Enters LastName "<LastName>"
And User Enters BillingAddress "<BillingAddress>"
And User Enters CreditCardNo "<CreditCardNo>"
And User Select CreditCardType "<CreditCardType>"
And User Select CcExpiryMonth "<CcExpiryMonth>"
And User Select CcExpiryYear "<CcExpiryYear>"
And User Enters CVVNo "<CVVNo>"
And User Click BookNowBtn
Then User TestCaseEleven verify the data given and processed are same and correct "<TC_ID>" , "<Location>" , "<Hotel>" , "<RoomType>" 
And User captures ScreenShot
And User close the browser
#And User close the browser


Examples:

|TC_ID|UserName|Password|Location|Hotel|RoomType|NoOfRooms|checkin-date|checkout-date|AdultperRoom|FirstName|LastName|BillingAddress|CreditCardNo|CreditCardType|CcExpiryMonth|CcExpiryYear|CVVNo|
|TC_111|Anbarasi|83YR4E| Sydney |Hotel Sunshine|Double|1|24/02/2019|26/02/2019|1|Anbu|Inba|No10 Kamban Nagar Madhavaram Chennai TamilNadu IndiaNo10 Kamban Nagar Madhavaram.|1234123412341234|AMEX|3|2019|609|
