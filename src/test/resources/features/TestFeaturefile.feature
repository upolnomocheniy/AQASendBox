@ui
Feature: Test Home PAhe The Gordon's Site
  As a Gordon's site user
  I want to go to the site
  So that it will help user's Gordon's


  @ppe
  Scenario: GRDNS-01 User can open the site Gordon's and see article with statistic russian troops
    Given User opens home page
    Then User can see header with втрати російських окупантів text for statistic per day


  @ppe @prod @smoke
  Scenario: GRDNS-02 User check content for menu and submenu on homepage
    Given User opens home page
    Then User check sub menu on the home page:
      | київ            |
      | війна в україні |
      | політика        |
      | гроші           |
      | світ            |
      | спорт           |
      | культура        |
      | техно           |
      | спосіб життя    |
    And User check menu on the home page:
      | новини                  |
      | публікації              |
      | спецпроєкти             |
      | інтерв'ю дмитра гордона |
      | токшоу                  |
      | ексклюзив g             |
      | бульвар шоубіз          |
      | live                    |


  Scenario: GRDNS-03 User check content for english language
    Given User opens home page
    Then User click En button for open English version
    Then User check title the page is: News / ГОРДОН
    Then User check menu on the home page:
      | ukraine–russia relations        |
      | war in donbas & eastern ukraine |
      | exclusive comments & analysis   |
      | news                            |