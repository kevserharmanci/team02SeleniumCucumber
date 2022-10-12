
@All
Feature: Amazon Search


@gp1
  Scenario: TC01 Amazon Nutella aratma

    Given Kullanici amazon sayfasina gider
    Then kullanici searchbox a nutella yazar ve enter a basar
    And kullanici gelen sonuc textinin nutella aicerip icermedigini kontrol eder

@gp2
  Scenario: TC02 Amazon Java aratma

    Given Kullanici amazon sayfasina gider
    Then kullanici searchbox a java yazar ve enter a basar
    And kullanici gelen sonuc textinin java icerip icermedigini kontrol eder

@gp1
  Scenario: TC03 Amazon Selenium aratma

    Given Kullanici amazon sayfasina gider
    Then kullanici searchbox a Selenium yazar ve enter a basar
    And kullanici gelen sonuc textinin Selenium icerip icermedigini kontrol eder

@gp3
  Scenario: TC04 sayfayi kapatma
    Then kullanici browser i kapatir