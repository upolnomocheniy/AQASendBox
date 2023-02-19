@ui
Feature: Test Home PAhe The Gordon's Site
  As a Gordon's site user
  I want to go to the site
  So that it will help user's Gordon's

  @otherFolderAndFile
Scenario: GRDNS-03 User check content for english language
Given User opens home page
Then User click En button for open English version
Then User check title the page is: News / ГОРДОН
Then User check menu on the home page:
| ukraine–russia relations        |
| war in donbas & eastern ukraine |
| exclusive comments & analysis   |
| news                            |