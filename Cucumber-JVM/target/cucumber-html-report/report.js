$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Google.feature");
formatter.feature({
  "id": "google-search-and-gmail-user-sign-in",
  "description": "",
  "name": "Google Search and Gmail user sign-in",
  "keyword": "Feature",
  "line": 2
});
formatter.before({
  "duration": 2944650073,
  "status": "passed"
});
formatter.scenario({
  "id": "google-search-and-gmail-user-sign-in;text-search-through-google-search",
  "tags": [
    {
      "name": "@Smoke",
      "line": 3
    }
  ],
  "description": "",
  "name": "Text Search through Google Search",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I am in google home page",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I search text in google search box",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "I should able to see the searched result",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "GoogleStepDefination.i_am_in_google_home_page()"
});
formatter.result({
  "duration": 2613267932,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDefination.i_search_text_in_google_search_box()"
});
formatter.result({
  "duration": 90393591,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDefination.i_should_able_to_see_the_searched_result()"
});
formatter.result({
  "duration": 70165129,
  "status": "passed"
});
formatter.after({
  "duration": 2354581258,
  "status": "passed"
});
formatter.before({
  "duration": 2452183810,
  "status": "passed"
});
formatter.scenario({
  "id": "google-search-and-gmail-user-sign-in;gmail-sign-in-using-correct-userdetails",
  "tags": [
    {
      "name": "@Smoke",
      "line": 9
    }
  ],
  "description": "",
  "name": "Gmail sign in using correct userdetails",
  "keyword": "Scenario",
  "line": 10,
  "type": "scenario"
});
formatter.step({
  "name": "I am in google home page",
  "keyword": "Given ",
  "line": 11
});
formatter.step({
  "name": "I click on Gmail link",
  "keyword": "When ",
  "line": 12
});
formatter.step({
  "name": "I have enter correct username and password in sign-in page",
  "keyword": "And ",
  "line": 13
});
formatter.step({
  "name": "I should be able to logged-in successfully",
  "keyword": "Then ",
  "line": 14
});
formatter.match({
  "location": "GoogleStepDefination.i_am_in_google_home_page()"
});
formatter.result({
  "duration": 2947295953,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDefination.i_click_on_Gmail_link()"
});
formatter.result({
  "duration": 11169514717,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDefination.i_have_enter_correct_username_and_password_in_sign_in_page()"
});
formatter.result({
  "duration": 11057465108,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDefination.i_should_be_able_to_logged_in_successfully()"
});
formatter.result({
  "duration": 35093,
  "status": "passed"
});
formatter.after({
  "duration": 2355570814,
  "status": "passed"
});
formatter.before({
  "duration": 1642956605,
  "status": "passed"
});
formatter.scenario({
  "id": "google-search-and-gmail-user-sign-in;gmail-sign-in-using-incorrect-userdetails",
  "tags": [
    {
      "name": "@Smoke",
      "line": 15
    }
  ],
  "description": "",
  "name": "Gmail sign in using Incorrect userdetails",
  "keyword": "Scenario",
  "line": 16,
  "type": "scenario"
});
formatter.step({
  "name": "I am in google home page",
  "keyword": "Given ",
  "line": 17
});
formatter.step({
  "name": "I click on Gmail link",
  "keyword": "When ",
  "line": 18
});
formatter.step({
  "name": "I have enter incorrect username and password",
  "keyword": "And ",
  "line": 19
});
formatter.step({
  "name": "I should be able to see error message and not logged-in",
  "keyword": "Then ",
  "line": 20
});
formatter.match({
  "location": "GoogleStepDefination.i_am_in_google_home_page()"
});
formatter.result({
  "duration": 3020942572,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDefination.i_click_on_Gmail_link()"
});
formatter.result({
  "duration": 10964309102,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDefination.i_have_enter_incorrect_username_and_password()"
});
formatter.result({
  "duration": 10960105888,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDefination.i_should_be_able_to_see_error_message_and_not_logged_in()"
});
formatter.result({
  "duration": 104734045,
  "status": "failed",
  "error_message": "java.lang.AssertionError: expected [The email and password you entered don\u0027t] but found [The email and password you entered don\u0027t match.]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:494)\r\n\tat org.testng.Assert.assertEquals(Assert.java:123)\r\n\tat org.testng.Assert.assertEquals(Assert.java:176)\r\n\tat org.testng.Assert.assertEquals(Assert.java:186)\r\n\tat stepsDefinations.GoogleStepDefination.i_should_be_able_to_see_error_message_and_not_logged_in(GoogleStepDefination.java:115)\r\n\tat ✽.Then I should be able to see error message and not logged-in(features/Google.feature:20)\r\n"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2598778830,
  "status": "passed"
});
});