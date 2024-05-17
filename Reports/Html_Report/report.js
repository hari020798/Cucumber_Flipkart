$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Flipkart.feature");
formatter.feature({
  "line": 2,
  "name": "Mixer Booking in Flipkart Web Application",
  "description": "",
  "id": "mixer-booking-in-flipkart-web-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Scenario1"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "user Login to Web application",
  "description": "",
  "id": "mixer-booking-in-flipkart-web-application;user-login-to-web-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user Launch the web application",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefenition.user_Launch_the_web_application()"
});
formatter.result({
  "duration": 2487660000,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "user Searching and Selecting the Mixer",
  "description": "",
  "id": "mixer-booking-in-flipkart-web-application;user-searching-and-selecting-the-mixer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user search for mixer in the search box",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user selects the mixer and navigates to Mixer page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user gets the Mixer name text",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefenition.user_search_for_mixer_in_the_search_box()"
});
formatter.result({
  "duration": 2585034301,
  "status": "passed"
});
formatter.match({
  "location": "StepDefenition.user_selects_the_mixer_and_navigates_to_Mixer_page()"
});
formatter.result({
  "duration": 102072400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefenition.user_gets_the_Mixer_name_text()"
});
formatter.result({
  "duration": 403707200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "user Adding Mixer in Flipkart",
  "description": "",
  "id": "mixer-booking-in-flipkart-web-application;user-adding-mixer-in-flipkart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Scenario3"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user search for Add to cart button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user using javaScripts user moved to the Add to cart page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user placed the order by selecting the Placeorder",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enters Email address in the Emailaddress field",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefenition.user_search_for_Add_to_cart_button()"
});
formatter.result({
  "duration": 1741082000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefenition.user_using_javaScripts_user_moved_to_the_Add_to_cart_page()"
});
formatter.result({
  "duration": 191260500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefenition.user_placed_the_order_by_selecting_the_Placeorder()"
});
formatter.result({
  "duration": 190800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefenition.user_enters_Email_address_in_the_Emailaddress_field()"
});
formatter.result({
  "duration": 179800,
  "status": "passed"
});
});