Feature: Verify Thé du monde store and its commercial site

Background:
Given Launch the Browser
And Load the link
And Click Authentication Section Link

Scenario: TC001 VerifySuccessfullOrderPlacement
Given Enter User ID
And Enter Password
And Click Login button
Then Verify Successfull Login
Given Enter Old Order History
Then Verify Old Order History
Given verify current Order History
Then Verify Old Order History
Given Enter Product Catalog Section
And Verify Display by count (12,24,60) under all pages in Paging Mechanish
And Verify Place a Product in Cart button
And Verify Validate the Cart
And Verify Modifying the content in the cart
And Verify cart validation
And Use MOCK API for trusted third party payment gateway.
Then Verify Confirmation of order
And Verify Disconnect button

Scenario: TC002 VerifyLoginFailure
Given Enter User ID
And Enter Password
And Click Login button
Then Verify Login failure due to invalid User ID & Password

Scenario: TC003 NewTestUserAccountCreation
Given Click Account Creating button
And Enter New user Id
And Validate New User Id
And Enter New Password
And Validate New Password
And Enter Delivery Address
And Validate Delivery Address
And Enter Credit Card Registration
Then New Account Creation should be successful
And Verify Disconnect button

Scenario: TC004 VerifyUnSuccessfullOrderPlacementDueToBadAddress
Given Enter User ID
And Enter Password
And Click Login button
Then Verify Successfull Login
Given Enter Product Catalog Section
And Verify Display by count (12,24,60) under all pages in Paging Mechanish
And Verify Place a Product in Cart button
And Verify Validate the Cart
And Verify Modifying the content in the cart
And Verify cart validation
And Use MOCK API for trusted third party payment gateway.
Then Verify Order Cancellation due to Bad Delivery Address

Scenario: TC005 VerifySuccessfullOrderPlacementByValidAddress
Given Enter User ID
And Enter Password
And Click Login button
Then Verify Successfull Login
Given Enter Product Catalog Section
And Verify Display by count (12,24,60) under all pages in Paging Mechanish
And Verify Place a Product in Cart button
And Verify Validate the Cart
And Verify Modifying the content in the cart
And Verify cart validation
And Use MOCK API for trusted third party payment gateway.
Then Verify Order Confirmation
And Verify Disconnect button

Scenario: TC006 CloseBrowserOrderCancelVerification
Given Enter User ID
And Enter Password
And Click Login button
Then Verify Successfull Login
Given Enter Product Catalog Section
And Verify Display by count (12,24,60) under all pages in Paging Mechanish
And Verify Place a Product in Cart button
And Verify Validate the Cart
And Verify Modifying the content in the cart
And Verify cart validation
And Use MOCK API for trusted third party payment gateway.
And Click Close Browser
Then Verify Order not Placed

Scenario: TC007 CancelOrderClickingCancelButton
Given Enter User ID
And Enter Password
And Click Login button
Then Verify Successfull Login
Given Enter Product Catalog Section
And Verify Display by count (12,24,60) under all pages in Paging Mechanish
And Verify Place a Product in Cart button
And Verify Validate the Cart
And Verify Modifying the content in the cart
And Verify cart validation
And Use MOCK API for trusted third party payment gateway.
And Click Cancel Button
Then Verify Order not Placed