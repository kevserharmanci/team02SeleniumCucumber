Feature: US1011ClassWork
  Scenario: Herocap sitesi buton tarama

    And Kullanici "TheInternetHerOkuUrl" sayfasina gider
    And Add Element butona basin
    And Delete butonu gorunur oluncaya kadar bekleyin
    And Delete butonunun gorunur oldugunu test edin
    And Delete butonuna basarak butonu silin
    And Kullanici 2 saniye bekler
    And Delete butonunun gorunmedigini test edin