
Feature: User Registration
@smoketest
Scenario: Verify User Registration functionality
 Given User open Registration account page
 When User enter below details 
 |firstname                |allu|
 |lastname                |arjun|
 |emailaddress    |alluarjun@gmail.com|
 |telophone                |9848032919|
 |password                |Allu@12345|
 
 And Select Privacy policy field
 And click on continue button
 Then account should get successfully generated