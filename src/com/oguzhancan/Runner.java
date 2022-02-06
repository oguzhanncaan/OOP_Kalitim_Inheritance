package com.oguzhancan;

import com.oguzhancan.entities.Hizmetli;
import com.oguzhancan.entities.Mudur;
import com.oguzhancan.entities.Muhendis;

public class Runner {
    public static void main(String[] args) {

        Hizmetli hizmetli = new Hizmetli();
        hizmetli.ad = "Ayşe";
        Mudur mudur = new Mudur();
        mudur.ad = "Ahmet";

        Muhendis muhendis = new Muhendis();
        muhendis.maasVer("Elektrik Mühendisi");

    }
}
