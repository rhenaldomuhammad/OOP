package com.pboreg;


abstract class HitungLuas{
    protected double s1;
    protected double s2;
    public HitungLuas() {
        this.s1 = 0;
        this.s2 = 0;
    }
    public void setSisi(double s1){
        this.s1 = s1;
    }
    public void setSisi(double s1, double s2){
        this.s1 = s1;
        this.s2 = s2;
    }
    public double getS1(){
        return s1;
    }

    public double getS2() {
        return s2;
    }
}
class Segitiga2 extends HitungLuas{
    public double getLuas(){
        double luas = 0.5 * this.s1 * this.s2;
        return luas;
    }
}
class Lingkaran2 extends HitungLuas{
    public double getLuas(){
        double r = this.s1/2;
        double luas = 3.14 * r * r;
        return luas;
    }
}

public class RunLuas {
    public static void main(String[] args) {
        Segitiga2 oSeg = new Segitiga2();
        oSeg.setSisi(5,2);
        System.out.println("Luas Segitiga = 0.5 x " +
                oSeg.getS1() + " x " +
                oSeg.getS2() + " = " + oSeg.getLuas());

        Lingkaran2 oLing = new Lingkaran2();
        oLing.setSisi(10);
        System.out.println("Luas Lingkaran = " + oLing.getLuas());
    }

}
