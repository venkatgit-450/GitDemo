Feature: Application Login;

Scenario: positive test validating ligin
Given Open Browser
And Navigate to "http://qaclickacademy.com" site
And Click on login link in hpome page to land on Secure sign in page
When uesr enters "test99@gmail.com" and "123456" and logged in
Then verify that user is successfully logged in



Scenario: positive test validating ligin
Given Open Browser
And Navigate to "http://qaclickacademy.com" site
And Click on login link in hpome page to land on Secure sign in page
When uesr enters "test999@gmail.com" and "1234567" and logged in
Then verify that user is successfully logged in
