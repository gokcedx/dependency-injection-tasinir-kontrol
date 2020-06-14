package com.gokcedx.c_farkli_sinif;

/**
 * dependency-injection-tasinir-kontrol
 *
 * @author Gökçe Doğanay
 * @version 14.06.2020
 */
public class TasinirKayit {

    private TasinirKontrol tasinirKontrol;
//    private TasinirKontrolDatabase tasinirKontrol;
//    private TasinirKontrolExcel tasinirKontrol;
//    private TasinirKontrolXml tasinirKontrol;

    public TasinirKayit() {
        this.tasinirKontrol = new TasinirKontrol();
//        this.tasinirKontrol = new TasinirKontrolDatabase();
//        this.tasinirKontrol = new TasinirKontrolExcel();
//        this.tasinirKontrol = new TasinirKontrolXml();
    }

    public void tasinirKaydet(Tasinir tasinir){
        if(tasinirKontrol.isKayitli(tasinir)){
            System.out.println("Taşınır kaydı yapılamadı, farklı bir taşınır kodu deneyiniz.");
        }else{
            System.out.println("Kayıt Başarılı.");
        }
    }
}
