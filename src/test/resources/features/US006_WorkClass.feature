Feature: BlueRentaCar Search

  Scenario Outline: TC11 kullanici gecersiz bilgilerle giris yapar
    Given Kullanici "<blueRentalCarUrl>" sayfasina gider
    Then Login yazisina tiklar
    And Kullanici 3 saniye bekler
    And gecersiz "<kullaniciAdi>" girer
    And gecersiz "<password>" girilir
    And Kullanici 2 saniye bekler
    And Login butonuna basar
    And Kullanici 2 saniye bekler
    Then sayfaya giris yapilamadigini kontrol eder
    Examples:
      | blueRentalCarUrl | kullaniciAdi | password |
      | blueRentalCarUrl | Manager5@gmail.com | Manager5! |
      | blueRentalCarUrl | Manager6@gmail.com | Manager6! |
      | blueRentalCarUrl | Manager7@gmail.com | Manager7! |
      | blueRentalCarUrl | Manager8@gmail.com | Manager8! |
      | blueRentalCarUrl | Manager9@gmail.com | Manager9! |

  Scenario: Sayfayi Kapat
  And kullanici browser i kapatir












  # Kullanici adi  Manager5@gmail.com  Manager6@gmail.com  Manager7@gmail.com  Manager8@gmail.com  Manager9@gmail.com
  # Password  Manager5!  Manager6!  Manager7!  Manager8!  Manager9!