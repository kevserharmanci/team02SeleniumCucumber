@gp5
Feature: US003 Url Kullanimi
  Scenario: TC01 Url Kullanimi
    Given Kullanici "fcbkUrl" sayfasina gider
    Then Kullanici 3 saniye bekler
    When Url'nin "facebook" icerdigini test eder

  Scenario: TC01 Url Kullanimi
    Given Kullanici "blueRentalCarUrl" sayfasina gider
    Then Kullanici 3 saniye bekler
    When Url'nin "blue" icerdigini test eder

  Scenario: TC01 Url Kullanimi
    Given Kullanici "https://www.google.com" sayfasina giderr
    Then Kullanici 3 saniye bekler
    When Url'nin "google" icerdigini test eder