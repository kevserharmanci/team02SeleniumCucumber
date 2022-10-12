Feature:trenyol, morhipo seach
  @grp4
  Scenario: TC01 makas arama

    Given Google'a gidiniz
    Then  trendyol'u aratınız
    And   trendyol linkini bulup siteye gidiniz
    And   makas aratınız
    And   toplam ürün sayısını alınız
    Then  yeni sekmede morhipo'ya gidiniz
    And   makasi aratınız
    And   toplam ürün sayısın alınız
    Then  iki sitedeki topla makas sayısını karşılaştırınız
    And   Önce ürün sayısı fazla olan siteyi kapatınız
    Then  Sonra diğer sayfayıda kapatınız