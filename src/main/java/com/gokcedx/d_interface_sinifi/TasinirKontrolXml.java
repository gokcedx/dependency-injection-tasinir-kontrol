package com.gokcedx.d_interface_sinifi;

/**
 * dependency-injection-tasinir-kontrol
 *
 * @author Gökçe Doğanay
 * @version 14.06.2020
 */
public class TasinirKontrolXml implements Kontrol{

    @Override
    public boolean isKayitli(Tasinir tasinir) {
        if(tasinir.getTasinirKodu().contains("255.03")){
            System.out.println("Bu taşınır kodu ile xml kaydı var.");
            return true;
        }
        System.out.println("Bu taşınır kodu ile xml kaydı yok.");
        return false;
    }
}
