package zrodlo;

import java.util.Comparator;

public class ZrodloComparator implements Comparator<Zroudlo>{
    @Override
    public int compare(Zroudlo o1, Zroudlo o2) {
        String s1 = o1.getClass().getName();
        String s2 = o2.getClass().getName();
        return s1.compareTo(s2);
    }
}
