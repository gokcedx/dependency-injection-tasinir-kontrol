# dependency-injection-tasinir-kontrol
Dependency Injection Örneği


<-----------------------DEPENDENCY INJECTION------------------------->


Dependency Injection Nedir?

Bağımlı olunan sınıfların başka sınıflar içine enjekte edilerek kullanılması.


1-Sınıflar arası bağımlılığı azaltır, bakımı kolaylaştırır.

2-Değiştirilmek istenen sınıflar daha kolay değiştirilebilir.

3-Unit testler daha kolay yazılır, böylece değişikliklerde sıkıntı olursa erken farkedilebilir.

4-Kod okunmasını kolaylaştırır.


<-------------------------------------------------------------------->



<-----------------------TAŞINIR KONTROL APP------------------------->


Bu uygulamada taşınır adı ve kodu girerek kayıt yapıyoruz.

Kayıttan önce ise böyle bir kod ile kayıt olup olmadığını kontrol ediyoruz.

(Maliye Bakanlığı Taşınır Kod Listesi: https://muhasebat.hmb.gov.tr/tasinir-kod-listesi)


Dependency Injection neden uygulandı?

Bu uygulamanın ilk yapımında taşınır kodunun sadece bir txt dosyasından kontrol edildiğini,
ancak daha sonra database, excel, xml gibi farklı yerlerden kontrol edilmesi gerektiğini düşünelim.


Bunu yapmanın yöntemleri:

1- Kontrol methodunu değiştirip içine yeni methodlar ekleme

(Dezavantajı: kodun okunabilirliğini azaltır ve eski durumunu bozmamak için çok detaylı testler gerektirir.)


2- Db, excel, xml kontrolü için ayrı sınıflar ekleme

(Dezavantajı: her yerde farklı sınıfların kullanılması ile sınıflar arası bağ artmış olur.)


3- Genel bir dosya interface'i oluşturup diğer sınıfları ondan oluşturmak

(Dezavantajı: diğerlerinden daha iyi bir yöntemdir ama yine de kontrol sınıfında seçileni kullanmak gerekeceği için değişiklik gerekir.)


4- Genel bir dosya interface'i oluşturup bunu kontrol sınıfının constructorında kullanmak

(Dependency Injection örneği: yeni kontrol yerleri eklendiğinde değişiklik gerektirmeyecektir, bir interface oluşturup onu enjekte etmiş oluruz.)


Klasörler:

a_ilk_hali - uygulamanın ilk halidir, tek yerden kontrol edilir.

b_farkli_method - farklı methodlarla kontrol örneğidir.

c_farkli_siniflar - farklı sınıflarla kontrol örneğidir.

d_interface_sinifi - interface oluşturup kullanma örneğidir.

e_dependency_injection - interface'i enjekte etme örneğidir.


<--------------------------------------------------------------->
