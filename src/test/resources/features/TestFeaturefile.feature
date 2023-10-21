@ui
Feature: Test Home PAhe The Gordon's Site
  As a Gordon's site user
  I want to go to the site
  So that it will help user's Gordon's


  @ppe
  Scenario: GRDNS-01 User can open the site Gordon's and see article with statistic russian troops
    Given User opens home page
    Then User can see header with 'втрати російських окупантів' text for statistic per day


  @ppe @prod @smoke
  Scenario: GRDNS-02 User check content for menu and submenu on homepage
    Given User opens home page
    Then User click to the sub-menu button
    Then User check sub menu on the home page:
      | всі новини        |
      | війна в україні   |
      | світ              |
      | політика          |
      | гроші             |
      | спорт             |
      | надзвичайні події |
      | культура          |
      | техно             |
      | спосіб життя      |
      | цікаве            |
    And User check menu on the home page:
      | новини             |
      | публікації         |
      | в гостях у гордона |
      | блоги              |
      | ексклюзив          |
      | спецпроєкти        |
      | бульвар            |
      | live               |
      | фото               |
      | відео              |
      | youtube-шоу        |


  Scenario: GRDNS-03 User check content for english language
    Given User opens home page
    Then User click to the change language button
    Then User click En button for open English version
    Then User check title the page is: 'Ukraine Crisis - Latest news, Expert comments & Analysis from Ukraine - Gordonua.com / ГОРДОН'
    Then User check menu on the home page:
      | news                          |
      | exclusive comments & analysis |