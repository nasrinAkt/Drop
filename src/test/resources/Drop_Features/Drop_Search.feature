Feature: This is a feature for searching item

@tag1
Scenario: Verify user can add item in cart page
Given Open <"URL"> dr
Then type toys on search field
Then click search
Then click on specific item
