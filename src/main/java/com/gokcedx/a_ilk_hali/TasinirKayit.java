package com.gokcedx.a_ilk_hali;

/**
 * dependency-injection-tasinir-kontrol
 *
 * @author Gökçe Doğanay
 * @version 14.06.2020
 */
public class TasinirKayit {

    private TasinirKontrol tasinirKontrol;

    public TasinirKayit() {
        this.tasinirKontrol = new TasinirKontrol();
    }

    public void tasinirKaydet(Tasinir tasinir){
        if(tasinirKontrol.isKayitli(tasinir)){
            System.out.println("Taşınır kaydı yapılamadı, farklı bir taşınır kodu deneyiniz.");
        }else{
            System.out.println("Kayıt Başarılı.");
        }
    }
}
