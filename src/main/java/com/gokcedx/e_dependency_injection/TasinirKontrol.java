package com.gokcedx.e_dependency_injection;

/**
 * dependency-injection-tasinir-kontrol
 *
 * @author Gökçe Doğanay
 * @version 14.06.2020
 */
public class TasinirKontrol implements Kontrol {

    @Override
    public boolean isKayitli(Tasinir tasinir) {
        if(tasinir.getTasinirKodu().contains("255.03")){
            System.out.println("Bu taşınır kodu ile kayıt var.");
            return true;
        }
        System.out.println("Bu taşınır kodu ile kayıt yok.");
        return false;
    }
}
