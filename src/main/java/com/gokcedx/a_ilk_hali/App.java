package com.gokcedx.a_ilk_hali;

/**
 * dependency-injection-tasinir-kontrol
 *
 * @author Gökçe Doğanay
 * @version 14.06.2020
 */
public class App 
{
    public static void main( String[] args )
    {
        TasinirKayit tasinirKayit = new TasinirKayit();
        Tasinir tasinir = new Tasinir();
        tasinir.setId(1L);
        tasinir.setTasinirAdi("Yeni Demirbaş");
        tasinir.setTasinirKodu("255.05.03.01");
        tasinirKayit.tasinirKaydet(tasinir);
    }
}
