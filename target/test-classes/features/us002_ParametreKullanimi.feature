
  Feature: US002 Parametre Kullanimi
    Background: Ortak adimlar
      Given Kullanici amazon sayfasina gider

    Scenario: TC01 Kullanici amazonda parametre ile arama yapar
      Then Kulanici "iphone" icin arama yapar
      And Kullanici 3 saniye bekler
      And Sonuclarin "iphone" icerdigini test eder

    Scenario: TC02 Kullanici amazonda parametre ile arama yapar
      Then Kulanici "sql" icin arama yapar
      And Kullanici 5 saniye bekler
      And Sonuclarin "sql" icerdigini test eder

    Scenario: TC03 Kullanici amazonda parametre ile arama yapar
      Then Kulanici "selenium" icin arama yapar
      And Kullanici 4 saniye bekler
      And Sonuclarin "selenium" icerdigini test eder
      And kullanici browser i kapatir

