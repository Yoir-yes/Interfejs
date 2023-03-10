package zrodlo.piec;

import zrodlo.Zroudlo;

public class PiecElektryczny extends Piec implements Zroudlo {
    @Override
    public void grzej() {
        System.out.println("Grzeje prondem");
    }
}
