import java.lang.Math;
public class UTS_4 {
    private double r;
    private final double PHI = 3.14;

    //method
    public UTS_4(){
        this.r = 0;
    }
    public UTS_4(double jari){
        this.r = jari;
    }
    public void setR(double jari) {
        this.r = jari;
    }
    public double getR() {
        return this.r;
    }
    public double l() {
        return this.PHI * Math.pow(this.r,2);
    }
    public double k(){
        return 2 * this.PHI * this.r;
    }
    public static void main(String[] args){
        UTS_4 link1 = new UTS_4();
        link1.setR(10);
        System.out.println("L Lingkaran 1 = " + link1.l());

        UTS_4 link2 = new UTS_4(100);
        System.out.println("L Lingkaran 2 = " + link2.l());
    }
}
