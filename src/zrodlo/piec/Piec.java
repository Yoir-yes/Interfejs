package zrodlo.piec;

public abstract class Piec implements Comparable<Piec> {
    private double moc;

    public double getMoc() {
        return moc;
    }

    public void setMoc(double moc) {
        this.moc = moc;
    }

    @Override
    public String toString() {
        return "Piec{" +
                "moc=" + moc +
                '}';
    }

    @Override
    public int compareTo(Piec o) {
        /*
        if(moc>o.getMoc()){
            return 1;
        }else if(moc == o.getMoc()){
            return 0;
        }else{
            return -1;
        }
        */

        return Double.compare(moc, o.getMoc());
    }
}
