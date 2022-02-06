package com.oguzhancan.entities;

import java.sql.SQLOutput;

public class Personel {
    public String ad;
    public String soyad;
    public String adres;
    public String tcKimlik;
    public String telefon;
    public String departman;
    public int ayinElemaniKatSayisi;
    public void maasVer(String unvan){
        System.out.println(unvan +" Personele maaş ödemesi yapıldı.");
    }
}
