$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/desktopspage.feature");
formatter.feature({
  "line": 2,
  "name": "Desktops",
  "description": "",
  "id": "desktops",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CompleteTest"
    }
  ]
});
formatter.before({
  "duration": 193243378000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Retail Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on Show all desktop page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestStepDef.user_is_on_Retail_Website()"
});
formatter.result({
  "duration": 16711112000,
  "status": "passed"
});
formatter.match({
  "location": "DesktopPageStepDef.user_click_on_Desktops_tab()"
});
formatter.result({
  "duration": 133897800,
  "status": "passed"
});
formatter.match({
  "location": "DesktopPageStepDef.user_click_on_Show_all_desktop_page()"
});
formatter.result({
  "duration": 2636908400,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 22,
      "value": "#\"Success: you have added HP LP 3065 to your cart!\""
    },
    {
      "line": 24,
      "value": "#scenario 3"
    }
  ],
  "line": 26,
  "name": "User add canon EOS \"5D\" from desktops tab to the cart",
  "description": "",
  "id": "desktops;user-add-canon-eos-\"5d\"-from-desktops-tab-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@AddCanonEOS5D"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "User click ADD TO CART option on \"Canon EOS 5D\" item",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User select color from dropdown \"Red\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User click add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User should see a message \"Success: You have added Canon EOS 5D to your shopping cart!\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "DesktopPageStepDef.user_click_add_to_Cart_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 688751400,
  "status": "passed"
});
});