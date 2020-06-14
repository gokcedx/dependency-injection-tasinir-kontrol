package com.gokcedx.b_farkli_method;

/**
 * dependency-injection-tasinir-kontrol
 *
 * @author Gökçe Doğanay
 * @version 14.06.2020
 */
public class Tasinir {
    private Long id;
    private String tasinirAdi;
    private String tasinirKodu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTasinirAdi() {
        return tasinirAdi;
    }

    public void setTasinirAdi(String tasinirAdi) {
        this.tasinirAdi = tasinirAdi;
    }

    public String getTasinirKodu() {
        return tasinirKodu;
    }

    public void setTasinirKodu(String tasinirKodu) {
        this.tasinirKodu = tasinirKodu;
    }
}
