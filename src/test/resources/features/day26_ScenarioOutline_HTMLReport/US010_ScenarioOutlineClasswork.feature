#https://editor.datatables.net adresine gidiniz
# Sayfadaki tabloda new butonuna basalım
# Çıkan pencerede verilen bilgileri girelim
# Create butonuna basalım
# Search bölümüne girdiğimiz firstname bilgisini girelim
# Başarılı bir şekilde giriş yapıldığını doğrulayalım
# Sayfayı kapatalım

Feature: US010 DataTables Testi

  Scenario Outline: TC01 DataTables Veri Girisi
    Given kullanici parametreli method ile propertiesden "dataTablesUrl" sayfasina gider
    * kullanici 1 saniye bekler
    Then kullanici sayfadaki tabloda new butonuna basalım
    * kullanici 1 saniye bekler
    Then kullanici verilen bilgileri girer "<name>","<lastname>","<position>","<office>","<ext>","<date>","<salary>"
    And create buttonuna basar
    * kullanici 1 saniye bekler
    Then kullanici search bolumune "<name>" bilgisini girer
    And kullanici "<name>" ile basarili bir kayit yapildigini dogrular
    * kullanici 1 saniye bekler
    * sayfayi kapatir


    Examples:
      | name   | lastname | position    | office  | ext  | date       | salary  |
      | john   | smith    | tester      | NYC     | 2134 | 2023-02-25 | 80000   |
      | sam    | walton   | businessman | LA      | 5262 | 2021-02-21 | 2000000 |
      | nancy  | brown    | developer   | Dallas  | 2346 | 2021-02-26 | 850000  |
      | george | bush     | politician  | Dallas  | 9931 | 2021-02-24 | 9850000 |
      | barry  | allen    | unknown     | Central | 2103 | 2021-02-23 | 1000000 |