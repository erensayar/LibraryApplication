-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 30 Eyl 2020, 14:13:40
-- Sunucu sürümü: 10.4.13-MariaDB
-- PHP Sürümü: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `library_application`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `author`
--

CREATE TABLE `author` (
  `id` int(11) NOT NULL,
  `explanation` varchar(500) COLLATE utf8_turkish_ci DEFAULT NULL,
  `name` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `surname` varchar(20) COLLATE utf8_turkish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `author`
--

INSERT INTO `author` (`id`, `explanation`, `name`, `surname`) VALUES
(1, 'Lorem ipsum dolorLorem ipsum dolorLorem ipsum dolorLorem ipsum dolorLorem ipsum dolorLorem ipsum dolorLorem ipsum dolor', 'Fyodor', 'Dostoyevski'),
(2, 'Lorem ipsum dolorLorem ipsum dolorLorem ipsum dolorLorem ipsum dolorLorem ipsum dolorLorem ipsum dolorLorem ipsum dolorLorem ipsum dolor', 'Lev', 'Tolstoy'),
(3, 'Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor ', 'Henri', 'Cloud'),
(4, 'Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor Lorem ipsum dolor ', 'John', 'Townsend'),
(5, 'Yuval Noah Harari, İsrailli tarihçi ve yazar. Dünyada çok satanlar listesindeki Hayvanlardan Tanrılara Sapiens, \"Homo Deus - Yarının Kısa Bir tarihi\" ve “21. Yüzyıl için 21 ders” kitaplarının yazarıdır.', 'Yuval Noah', 'Harari'),
(6, 'Joanne Kathleen \"Jo\" Rowling veya bilinen adıyla J. K. Rowling, Harry Potter adlı fantastik roman serisinin İngiliz yazarı. Kathleen, kendisine verilen bir ad olmamasına rağmen, büyükannesinin onuruna bu adı almıştır.', 'Joanne Kathleen', 'Rowling');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `author_book`
--

CREATE TABLE `author_book` (
  `author_id` int(11) NOT NULL,
  `book_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `author_book`
--

INSERT INTO `author_book` (`author_id`, `book_id`) VALUES
(5, 4),
(1, 5),
(2, 3),
(3, 1),
(4, 1),
(6, 6),
(6, 7);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `book`
--

CREATE TABLE `book` (
  `id` int(11) NOT NULL,
  `explanation` varchar(500) COLLATE utf8_turkish_ci DEFAULT NULL,
  `isbn_no` varchar(13) COLLATE utf8_turkish_ci DEFAULT NULL,
  `name` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `serial_name` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `sub_name` varchar(150) COLLATE utf8_turkish_ci DEFAULT NULL,
  `publisher_id` int(11) DEFAULT NULL,
  `book_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `book`
--

INSERT INTO `book` (`id`, `explanation`, `isbn_no`, `name`, `serial_name`, `sub_name`, `publisher_id`, `book_id`) VALUES
(1, 'Lorem ipsum dolor. Lorem ipsum dolor. Lorem ipsum dolor. Lorem ipsum dolor. Lorem ipsum dolor. Lorem ipsum dolor. Lorem ipsum dolor. Lorem ipsum dolor. Lorem ipsum dolor. Lorem ipsum dolor. Lorem ipsum dolor. ', '9781480554276', 'Sınırlar', NULL, 'Hayatınızı kontrol etmek için ne zaman evet, ne zaman hayır demelisiniz?', 3, NULL),
(3, 'Savaş ve Barış, Rus yazar Lev Tolstoy tarafından yazılmış ve ilk kez 1869 yılında yayınlanmış roman. Roman dünya edebiyatının en önemli başarılarından ve önemli eserlerinden biri olarak değerlendirilir', '9789758688388', 'Savaş Ve Barış', NULL, 'Çeviri: dalkdaı ajahsd', 1, NULL),
(4, 'Hayvanlardan Tanrılara Sapiens Yuval Harari\'nin 2011\'de yayımladığı,2014\'te İngilizce\'ye 2015\'te Türkçeye çevrilen kitabı.Harari kitabında Jared Diamond\'ın Tüfek, Mikrop ve Çelik kitabına, zor sorulara bilimsel cevap vermenin mümkün olduğunu gösterdiği için en büyük ilham kaynağı olarak atıfta bulundu.', '7368765430983', 'Sapiens', NULL, 'Hayvanlardan Tanrılara - İnsan Türünün Kısa Bir Kitabı', 4, NULL),
(5, 'Suç ve Ceza, Rus yazar Fyodor Dostoyevski tarafından yazılan romandır. İlk olarak 1866 yılı boyunca edebiyat dergisi Rus Habercisi\'nde on iki ayda yayımlandı. Daha sonra tek cilt olarak yayımlandı. Dostoyevski\'nin beş yıl süren Sibirya sürgününün dönüşü yazdığı tam uzunluktaki ikinci romanıdır.', '6368584567352', 'Suç Ve Ceza', NULL, 'Fyodor Dostoyevski tarafından yazılan roman.', 2, NULL),
(6, 'Harry Potter, İngiliz yazar J.K. Rowling tarafından yedi kitap halinde yazılan fantastik roman serisi ve bu kitaplardan uyarlanan film serisi. Dünya çapında elde ettiği başarı ve yakaladığı satış rakamlarıyla çığır açmayı başarmış ve edebiyat tarihine geçmiştir.', '9781524721251', 'Harry Potter Ve Felsefe Taşı', 'Harry Potter', 'Felsefe Taşı', 5, NULL),
(7, 'Harry Potter ve Sırlar Odası', '9781408855669', 'Harry Potter ve Sırlar Odası', 'Harry Potter', 'Sırlar Odası', 5, NULL);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `book_author`
--

CREATE TABLE `book_author` (
  `book_id` int(11) NOT NULL,
  `author_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `book_author`
--

INSERT INTO `book_author` (`book_id`, `author_id`) VALUES
(3, 2),
(1, 3),
(1, 4),
(3, 2),
(5, 1),
(6, 6),
(7, 6);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `publisher`
--

CREATE TABLE `publisher` (
  `id` int(11) NOT NULL,
  `explanation` varchar(500) COLLATE utf8_turkish_ci DEFAULT NULL,
  `name` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `publisher`
--

INSERT INTO `publisher` (`id`, `explanation`, `name`) VALUES
(1, 'Can Yayın Evi', 'Can'),
(2, 'Türkiye İş Bankası Kültür Yayınları', 'Türkiye İş Bankası Kültür Yayınları'),
(3, 'Koridor Yayıncılık', 'Koridar Yayıncılık'),
(4, 'Kolektif Kitap Yayın Evi', 'Kolektif Kitap'),
(5, 'Yapı Kredi Yayınları', 'YKY');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `publisher_book`
--

CREATE TABLE `publisher_book` (
  `publisher_id` int(11) NOT NULL,
  `book_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `publisher_book`
--

INSERT INTO `publisher_book` (`publisher_id`, `book_id`) VALUES
(2, 3),
(2, 5),
(3, 1),
(4, 4),
(5, 6),
(5, 7);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `author`
--
ALTER TABLE `author`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `author_book`
--
ALTER TABLE `author_book`
  ADD KEY `FKn8665s8lv781v4eojs8jo3jao` (`book_id`),
  ADD KEY `FKg7j6ud9d32ll232o9mgo90s57` (`author_id`);

--
-- Tablo için indeksler `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKgtvt7p649s4x80y6f4842pnfq` (`publisher_id`),
  ADD KEY `FKlld9w7ajvv9qva8rcxj3nft6` (`book_id`);

--
-- Tablo için indeksler `book_author`
--
ALTER TABLE `book_author`
  ADD KEY `FKbjqhp85wjv8vpr0beygh6jsgo` (`author_id`),
  ADD KEY `FKhwgu59n9o80xv75plf9ggj7xn` (`book_id`);

--
-- Tablo için indeksler `publisher`
--
ALTER TABLE `publisher`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `publisher_book`
--
ALTER TABLE `publisher_book`
  ADD UNIQUE KEY `UK_9lulq18oro7sv3prju3tox5c3` (`book_id`),
  ADD KEY `FK6buft2dj1d6ig7hekbx7c0ysp` (`publisher_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `author`
--
ALTER TABLE `author`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Tablo için AUTO_INCREMENT değeri `book`
--
ALTER TABLE `book`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Tablo için AUTO_INCREMENT değeri `publisher`
--
ALTER TABLE `publisher`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `author_book`
--
ALTER TABLE `author_book`
  ADD CONSTRAINT `FKg7j6ud9d32ll232o9mgo90s57` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`),
  ADD CONSTRAINT `FKn8665s8lv781v4eojs8jo3jao` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`);

--
-- Tablo kısıtlamaları `book`
--
ALTER TABLE `book`
  ADD CONSTRAINT `FKgtvt7p649s4x80y6f4842pnfq` FOREIGN KEY (`publisher_id`) REFERENCES `publisher` (`id`),
  ADD CONSTRAINT `FKlld9w7ajvv9qva8rcxj3nft6` FOREIGN KEY (`book_id`) REFERENCES `publisher` (`id`);

--
-- Tablo kısıtlamaları `book_author`
--
ALTER TABLE `book_author`
  ADD CONSTRAINT `FKbjqhp85wjv8vpr0beygh6jsgo` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`),
  ADD CONSTRAINT `FKhwgu59n9o80xv75plf9ggj7xn` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`);

--
-- Tablo kısıtlamaları `publisher_book`
--
ALTER TABLE `publisher_book`
  ADD CONSTRAINT `FK6buft2dj1d6ig7hekbx7c0ysp` FOREIGN KEY (`publisher_id`) REFERENCES `publisher` (`id`),
  ADD CONSTRAINT `FKnro4ab7u1j42osd4sehbkptrr` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
