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
  "duration": 14952802502,
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
  "duration": 3191268252,
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
  "duration": 1806911477,
  "status": "passed"
});
formatter.match({
  "location": "Buyproduct.move_the_cursor_over_women_menu_and_clicks_on_t_shrits_option()"
});
formatter.result({
  "duration": 2808939426,
  "status": "passed"
});
formatter.match({
  "location": "Buyproduct.more_button_will_be_displayed_then_click_on_More_button()"
});
formatter.result({
  "duration": 2462694217,
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
  "duration": 629846580,
  "status": "passed"
});
formatter.match({
  "location": "Buyproduct.click_Proceed_to_checkout_button()"
});
formatter.result({
  "duration": 2793564025,
  "status": "passed"
});
formatter.match({
  "location": "Buyproduct.complete_the_buy_order_process_till_payment()"
});
formatter.result({
  "duration": 12459952758,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[@name\u003d\u0027processAddress\u0027]\"}\n  (Session info: chrome\u003d84.0.4147.135)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-NGFOF13\u0027, ip: \u0027192.168.0.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.135, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\Akash\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:61792}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 73e9717a486d7a3c0cbffe19115344fc\n*** Element info: {Using\u003dxpath, value\u003d//button[@name\u003d\u0027processAddress\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinitionbuyproduct.Buyproduct.complete_the_buy_order_process_till_payment(Buyproduct.java:85)\r\n\tat ✽.Then Complete the buy order process till payment(C:/Users/Akash/git/online-shopping-web/shpping_on_web/samplefeturefilefolder/Buyproduct.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Buyproduct.make_sure_that_Product_is_ordered()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 845842961,
  "status": "passed"
});
});