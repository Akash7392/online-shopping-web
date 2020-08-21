$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Akash/git/online-shopping-web/shpping_on_web/samplefeturefilefolder/Buyproduct.feature");
formatter.feature({
  "line": 1,
  "name": "To test buy product functionaity end to end",
  "description": "",
  "id": "to-test-buy-product-functionaity-end-to-end",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "buy product functionaity",
  "description": "",
  "id": "to-test-buy-product-functionaity-end-to-end;buy-product-functionaity",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Navigate to website and click on sign in button",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Log in with valid credencials \"\u003cusername\u003e\" and \"\u003cpw\u003e\" and click on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Move the cursor over women menu and clicks on t shrits option",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "More button will be displayed then click on More button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Increase quantity to two and select size \"size\" and color and click on Add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click Proceed to checkout button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Complete the buy order process till payment",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Make sure that Product is ordered",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "to-test-buy-product-functionaity-end-to-end;buy-product-functionaity;",
  "rows": [
    {
      "cells": [
        "username",
        "pw",
        "size"
      ],
      "line": 13,
      "id": "to-test-buy-product-functionaity-end-to-end;buy-product-functionaity;;1"
    },
    {
      "cells": [
        "ak.yesankar@outlook.com",
        "ecomtest",
        "L"
      ],
      "line": 14,
      "id": "to-test-buy-product-functionaity-end-to-end;buy-product-functionaity;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 18055452173,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "buy product functionaity",
  "description": "",
  "id": "to-test-buy-product-functionaity-end-to-end;buy-product-functionaity;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Navigate to website and click on sign in button",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Log in with valid credencials \"ak.yesankar@outlook.com\" and \"ecomtest\" and click on sign in",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Move the cursor over women menu and clicks on t shrits option",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "More button will be displayed then click on More button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Increase quantity to two and select size \"size\" and color and click on Add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click Proceed to checkout button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Complete the buy order process till payment",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Make sure that Product is ordered",
  "keyword": "Then "
});
formatter.match({
  "location": "Buyproduct.navigate_to_website_and_click_on_sign_in_button()"
});
formatter.result({
  "duration": 3076753597,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ak.yesankar@outlook.com",
      "offset": 31
    },
    {
      "val": "ecomtest",
      "offset": 61
    }
  ],
  "location": "Buyproduct.log_in_with_valid_credencials_and_and_click_on_sign_in(String,String)"
});
formatter.result({
  "duration": 2916759540,
  "status": "passed"
});
formatter.match({
  "location": "Buyproduct.move_the_cursor_over_women_menu_and_clicks_on_t_shrits_option()"
});
formatter.result({
  "duration": 3722027680,
  "status": "passed"
});
formatter.match({
  "location": "Buyproduct.more_button_will_be_displayed_then_click_on_More_button()"
});
formatter.result({
  "duration": 2657104552,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "size",
      "offset": 42
    }
  ],
  "location": "Buyproduct.increase_quantity_to_two_and_select_size_and_color_and_click_on_Add_to_cart(String)"
});
formatter.result({
  "duration": 577510800,
  "status": "passed"
});
formatter.match({
  "location": "Buyproduct.click_Proceed_to_checkout_button()"
});
formatter.result({
  "duration": 2918052903,
  "status": "passed"
});
formatter.match({
  "location": "Buyproduct.complete_the_buy_order_process_till_payment()"
});
formatter.result({
  "duration": 9759739292,
  "status": "passed"
});
formatter.match({
  "location": "Buyproduct.make_sure_that_Product_is_ordered()"
});
formatter.result({
  "duration": 181976,
  "status": "passed"
});
formatter.after({
  "duration": 1491042072,
  "status": "passed"
});
});