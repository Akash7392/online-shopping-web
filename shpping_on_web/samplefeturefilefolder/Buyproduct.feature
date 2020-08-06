Feature: To test buy product functionaity end to end
Scenario Outline:buy product functionaity 
Given Navigate to website and click on sign in button
When Log in with valid credencials "<username>" and "<pw>" and click on sign in
Then Move the cursor over women menu and clicks on t shrits option
Then More button will be displayed then click on More button
Then Increase quantity to two and select size "size" and color and click on Add to cart
Then Click Proceed to checkout button
Then Complete the buy order process till payment
Then Make sure that Product is ordered

Examples:
        |username|pw|size|
        |ak.yesankar@outlook.com|ecomtest|L|