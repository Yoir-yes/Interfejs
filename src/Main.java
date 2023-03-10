import zrodlo.Kominek;

import zrodlo.PompaCiepla;
import zrodlo.ZrodloComparator;
import zrodlo.Zroudlo;
import zrodlo.piec.Piec;
import zrodlo.piec.PiecElektryczny;
import zrodlo.piec.PiecGazowy;
import zrodlo.piec.PiecWeglowy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Zroudlo> zrodlo = new ArrayList<>();

        zrodlo.add(new Kominek());
        zrodlo.add(new PompaCiepla());
        zrodlo.add(new PiecElektryczny());
        zrodlo.add(new PiecWeglowy());

        for(Zroudlo z: zrodlo){
            z.grzej();
        }

        Piec[] piec = {new PiecElektryczny(), new PiecGazowy(), new PiecWeglowy()};
        piec[0].setMoc(10);
        piec[1].setMoc(26);
        piec[2].setMoc(25);

        Arrays.sort(piec);
        for(Piec p: piec){
            System.out.println(p.toString());
        }

        zrodlo.sort(new ZrodloComparator());
        System.out.println(zrodlo);
    }
}