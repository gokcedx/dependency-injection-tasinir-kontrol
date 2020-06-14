package com.gokcedx.b_farkli_method;

/**
 * dependency-injection-tasinir-kontrol
 *
 * @author Gökçe Doğanay
 * @version 14.06.2020
 */
public class TasinirKontrol {

    //Txt için:
    public boolean isKayitli(Tasinir tasinir){
        if(tasinir.getTasinirKodu().contains("255.03")){
            System.out.println("Bu taşınır kodu ile kayıt var.");
            return true;
        }
        System.out.println("Bu taşınır kodu ile kayıt yok.");
        return false;
    }

    //Db için:
    public boolean isKayitliDatabase(Tasinir tasinir){
        if(tasinir.getTasinirKodu().contains("255.03")){
            System.out.println("Bu taşınır kodu ile database kaydı var.");
            return true;
        }
        System.out.println("Bu taşınır kodu ile database kaydı yok.");
        return false;
    }

    //Excel için:
    public boolean isKayitliExcel(Tasinir tasinir){
        if(tasinir.getTasinirKodu().contains("255.03")){
            System.out.println("Bu taşınır kodu ile excel kaydı var.");
            return true;
        }
        System.out.println("Bu taşınır kodu ile excel kaydı yok.");
        return false;
    }

    //Xml için:
    public boolean isKayitliXml(Tasinir tasinir){
        if(tasinir.getTasinirKodu().contains("255.03")){
            System.out.println("Bu taşınır kodu ile xml kaydı var.");
            return true;
        }
        System.out.println("Bu taşınır kodu ile xml kaydı yok.");
        return false;
    }
}
