package zrodlo.piec;

import zrodlo.Zroudlo;

public class PiecWeglowy extends Piec implements Zroudlo {
    @Override
    public void grzej() {
        System.out.println("Grzeje drewnem");
    }
}
