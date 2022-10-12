Feature: US005 Blue Rent a Car Login
  Scenario: TC01 kullanici gecerli bilgilerle giris yapar
    Given Kullanici "blueRentalCarUrl" sayfasina gider
    Then Login yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Kullanici 2 saniye bekler
    And Login butonuna basar
    And Kullanici 2 saniye bekler
    Then sayfaya giris yapilamadigini kontrol eder
    And Kullanici 3 saniye bekler
    And kullanici browser i kapatir