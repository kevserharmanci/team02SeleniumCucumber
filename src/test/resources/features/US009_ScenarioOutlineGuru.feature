@US012
Feature: US012 Class Work

  Scenario Outline: TC01_kullanici_sutun_basligi_ile_liste_alabilmeli
    Given Kullanici "guruUrl" sayfasina gider
    Then "<Basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |

  Scenario: Sayfayi Kapat
    And kullanici browser i kapatir