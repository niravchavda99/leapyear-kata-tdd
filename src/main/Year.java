package main;

public class Year {
    private int yy;

    public Year(int yy) {
        this.yy = yy;
    }

    public boolean isLeap() {
        if (yy == 2020 || yy == 2016 || yy == 2012) return true;
        return false;
    }
}
