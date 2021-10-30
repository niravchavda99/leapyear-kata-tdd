package main;

public class Year {
    private int yy;

    public Year(int yy) {
        this.yy = yy;
    }

    public boolean isLeap() {
        if (yy % 100 == 0) return false;
        return yy % 4 == 0;
    }
}
