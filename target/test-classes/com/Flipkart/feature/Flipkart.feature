@Scenario1
Feature: Mixer Booking in Flipkart Web Application
Scenario: user Login to Web application
Then user Launch the web application

@Scenario2
Scenario: user Searching and Selecting the Mixer
When user search for mixer in the search box
And user selects the mixer and navigates to Mixer page
Then user gets the Mixer name text

@Scenario3
Scenario: user Adding Mixer in Flipkart
When user search for Add to cart button
And user using javaScripts user moved to the Add to cart page
And user placed the order by selecting the Placeorder
Then user enters Email address in the Emailaddress field
