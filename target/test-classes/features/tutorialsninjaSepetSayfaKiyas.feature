Feature: Tutorialsninja Phone&PDAs
  Scenario: Sepet ile sayfa kiyasi
    Given Kullanici tutorialsninja sayfasina gider
    And Phones & PDAs'a tıklayınız
    And Telefonların markalarını alınız
    And Tüm öğeleri sepete ekleyiniz
    And Sepete tıklayınız
    And Sepetteki isimleri alınız
    Then Sepetteki ve sayfadaki ürünlerin doğru olduğunu karşılaştırınız