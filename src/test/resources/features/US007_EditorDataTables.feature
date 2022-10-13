Feature: Editor Work

  Scenario Outline: Editor DataTables Information Entering

    When Kullanici "editorDataTablesUrl" sayfasina gider
    And Kullanici 1 saniye bekler
    Then new butonuna basar
    And Kullanici 1 saniye bekler
    And tum bilgileri girer  "<First name>","<Last name>","<Position>","<Office>","<Extension>","<Start date>","<Salary>"
    And Kullanici 1 saniye bekler
    And Create tusuna basar
    And Kullanici 1 saniye bekler
    When kullanici ilk "<First name>" ile arama yapar
    And Kullanici 1 saniye bekler
    Then isim bolumunde "<First name>" oldugunu dogrular
    And Kullanici 1 saniye bekler
    Examples:
      | First name | Last name | Position | Office | Extension | Start date | Salary |
      | Ali        | Can       | QA       | Libya  | Senior | 2022-10-13 | 117000 |
      | Ahmet      | Can       | QA       | Irak   | Senior | 2022-10-13 | 117000 |
      | Can        | Can       | QA       | TC     | Senior | 2022-10-13 | 117000 |
      | Kolo       | Can       | QA       | Fas    | Senior | 2022-10-13 | 117000 |
      | Domo      | Can       | QA       | Tunus  | Senior | 2022-10-13 | 117000 |

    Scenario: Sayfayi Kapat
      And kullanici browser i kapatir