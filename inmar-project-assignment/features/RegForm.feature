Feature: Registration form feature

@run @ignore
Scenario Outline: <TC_No> Registration Form
Given launch reg form application
When enter account information
And enter personal information
And enter payment details
And confirm info
Then verify success message
Examples:
|TC_No|
|TC01|
|TC02|
|TC03|