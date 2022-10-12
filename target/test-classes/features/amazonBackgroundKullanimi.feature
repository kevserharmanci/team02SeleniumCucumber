@Background
Feature: Amazon Search

Background: ortak adimlar
  Given Kullanici amazon sayfasina gider

  Scenario: TC01 Amazon Nutella aratma


    Then kullanici searchbox a nutella yazar ve enter a basar
    And kullanici gelen sonuc textinin nutella aicerip icermedigini kontrol eder


  Scenario: TC02 Amazon Java aratma


    Then kullanici searchbox a java yazar ve enter a basar
    And kullanici gelen sonuc textinin java icerip icermedigini kontrol eder


  Scenario: TC03 Amazon Selenium aratma


    Then kullanici searchbox a Selenium yazar ve enter a basar
    And kullanici gelen sonuc textinin Selenium icerip icermedigini kontrol eder
    Then kullanici browser i kapatir