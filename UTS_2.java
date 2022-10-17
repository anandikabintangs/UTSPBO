import java.util.Scanner;
public class UTS_2 {

    public static void tentukan(double bmi) {
        if (bmi > 22.9) {
            System.out.println("(Overweight");

        } else if (bmi < 18.5) {
            System.out.println("(Underweight)");
        } else System.out.println("IDEAL");
    }
        public static void main (String[] args) {
            Scanner masuk = new Scanner(System.in);
            float berat, tinggi, meter,bmi;
            System.out.println("MENENTUKAN BERAT BADAN IDEAL MELALUI FORMULA BMI");
            System.out.println("............................................");
            System.out.print ("Masukan Berat: ");
            berat = masuk.nextFloat();
            System.out.print ("Masukan Tinggi: ");
            tinggi = masuk.nextFloat();
            meter=tinggi/100;
            bmi=(berat/(meter*meter));

            System.out.println("............................................");
            System.out.print("BMI : "+bmi+" ");
            tentukan(bmi);
        }
    }