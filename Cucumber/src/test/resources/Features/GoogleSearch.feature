Feature: feature to test google search functionlity

Scenario: Validate Google search is working

Given Browser is open 
And user is on Google Search page
When user enters a text in search box
And hit enter 
Then user navigate to SearchResult
 
