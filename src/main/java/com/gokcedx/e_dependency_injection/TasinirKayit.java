package com.gokcedx.e_dependency_injection;

/**
 * dependency-injection-tasinir-kontrol
 *
 * @author Gökçe Doğanay
 * @version 14.06.2020
 */
public class TasinirKayit {

    private Kontrol tasinirKontrol;

    public TasinirKayit(Kontrol tasinirKontrol) {
        this.tasinirKontrol = tasinirKontrol;
    }

    public void tasinirKaydet(Tasinir tasinir){
        if(tasinirKontrol.isKayitli(tasinir)){
            System.out.println("Taşınır kaydı yapılamadı, farklı bir taşınır kodu deneyiniz.");
        }else{
            System.out.println("Kayıt Başarılı.");
        }
    }
}
