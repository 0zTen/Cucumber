Feature: US003 Amazon testi
  #Feature file da kullanacağımız scenariolarda ortak adımlar var ise Feature: anahtar kelimesinden sonra
  #Background: anahtar kelimesiyle ortak adımları belirtebiliriz. Background yapısı @BeforeMethod mantığı ile çalışır

  #TASK: 3 tane scenario oluşturup Amazon sayfasında iphone, samsung ve nokia aratınız
  Background: Amazon Sayfasina Gidilir
    * kullanici amazon sayfasina gider

  Scenario: TC01 arama kutusunda iphone aratilir
    * kullanici arama kutusunda iphone aratir
    * sayfayi kapatir

  Scenario: TC02 arama kutusunda samsung aratilir
    * kullanici arama kutusunda samsung aratir
    * sayfayi kapatir

  #Daha önce oluşturduğumuz steplerin methodlarını tekrar kullanmak istersek, anahtar kelimeler yerine yıldız koyulabilir

