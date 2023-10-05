Feature: US001 Amazon Sayfasi Testi
  @gr1
  Scenario: TC01 Amazon Arama Kutusunda Iphone Aratilir
    Given kullanici amazon sayfasina gider
    Then kullanici arama kutusunda iphone aratir
    And sayfayi kapatir

    Scenario: TC02 Arama Kutusunda Samsung Aratilir
      Given kullanici amazon sayfasina gider
      And kullanici arama kutusunda samsung aratir
      And sayfayi kapatir