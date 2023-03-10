package zrodlo;

import zrodlo.piec.Piec;

public class Kominek extends Piec implements Zroudlo {
    public void grzej() {
        System.out.println("Grzeje drewnem");
    }
}
