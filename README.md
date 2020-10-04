Gereksinimler:
--
* JDK 11 kurulu olmalı : http://jdk.java.net/java-se-ri/11 (OpenJDK) İşletim sistemininize uygun indirme bağlantısını kullanarak bilgisayarınıza JDK 11 kurunuz. Ayrıca terminalden jar dosyası çalıştırılmak istenirse ortam değişkeni (PATH) ayarlanmış olmalı.

* Derleme için Maven kurulu olmalıdır. 

    İndirme Bağlantısı: https://maven.apache.org/download.cgi
    
    https://maven.apache.org/install.html adresinden kurulum adımlarını inceleyebilirsiniz. 

    Maven ortam değişkenlerinde (PATH) kayıtlı olmalıdır. 
    Bkz: Path ayarlama

* MYSQL DB kurulu olmalı. Docker veya XAMPP benzeri programlarla süreci hızlandırabilirsiniz. 
    
    Mysql DB içinde library_application.sql import edilmelidir.  

    Mysql ayağa kaldırılmalıdır.(Aksi takdirde program çalışmayacaktır.)

* IDE ile derlenip çalıştırılacaksa (öneriyorum) pom.xml olduğu klasör gösterilerek IDE üzeridne "Open project" denerk dizin gösterilmelidir.     

---

* Kurulumlardan sonra:

    Terminal üzerinde: 

        git clone https://github.com/erensayar/LibraryApplication.git
    (Git Kurulu olmalıdır bu komut için)

    İlgili Klasöre giriniz ve maven ile derleme yapınız.

        cd LibraryApplication

    Maven İle Derleme yapınız.
    
        ./mvnw clean package
    
    Çalıştırılabilir Jar dosyasını çalıştırmak için terminalde şu komut girilmeli :

        java -jar target/LibraryApplication.jar
        
---
---        

Uygulama özellikleri:
--
* Yazar Tanımı yapılabilmeli ( Yazar Adı, Açıklama )
* Yayın Evi Tanımı yapılabilmeli ( Yayın Evi Adı, Açıklama )
* Kitap tanıtımı yapılabilmeli ( kitap adı, kitap alt adı, kitap seri
adı, yazar, yayın evi, isbn numarası, açıklama )
* Bir Yazar için n tane kitap tanımlanabilmeli
* Bir Yayın evi için n tane kitap tanımlanabilmeli
* Kitap adı, Seri adı, Yazar ya da ISBN ile arama yapılabilmeli
* Var olan bir kayıt üzerinde değişiklik yapılabilmeli
* Var olan kayıtlar incelebilmeli
* Var olan bir kayıt silinebilmeli
---
Kod standartlarına uygun yazılım geliştirilmiştir:

* OOP odaklı Katmanlı mimari kullanılmıştır. 

        Data erişim katmanı 
        Servis Katmanı
        Sunum Katmanı
Interface'ler kullanılmıştır.

---

Kullanılan Teknoloji & Yazılımlar
--
Spring Boot, ThymeLeaf, Spring Security, JPA-Hibernate, Maven, Html, Css, Js, Vue.js, Axios, Bootstrap, Mysql, Lombok(Plugin).

---

Eksikler
--
* Frontend'de gelen JSON verisi içinde başka obje bulunmaktadır bu obje içinden tek bir attribute(name) bastırılmalı. (Vue.js eksiği) (Çözüm: {{book.author[0].name}} kodu ancak olmadı,çözülmeli)

* User kullanıcısında problem çıkmaktadır(403). Bu problem düzeltilmeli. Admin kullanıcısı ile istenilenler yapılabilir. 

* Aktarılan JSON verisi optimize edilmeli.

---

NOTLAR
--
Bazı IDE'lerde lombok plugini problem çıkarmaktadır. Getter ve setter gibi metodlar görünmezse bu problem var demektir. İlgili IDE'ye lombok plugini yüklenmeli.




