Feature: ScenarioOutline Kullanimi

  Scenario Outline: Farkli Url'de Urun Arama

    Given Kullanici "<istenenUrl>" sayfasina gider
    And Kulanici "<arananKelime>" icin arama yapar
    Then Sonuclarin "<beklenenIfade>" icerdigini test eder
    Examples:
      | istenenUrl | arananKelime | beklenenIfade |
      | amazonUrl  | nutella      | nutella       |
      | amazonUrl  | kalem        | kalem         |
      | amazonUrl  | bicak        | bicak         |
    Scenario: Sayfayi Kapat
      And kullanici browser i kapatir


