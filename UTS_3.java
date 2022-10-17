import java.util.Scanner;
public class UTS_3 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int [] array1 = new int[10];

        int nomer = 0;
        int total = 0;
        for(int i = 0; i<10; i++){
            System.out.print(" Input Bilangannya : ");
            nomer = s.nextInt();
            array1[i]=nomer;
            total = total + array1[i];
        }

        int average =total /10;
        for(int i = 0; i>10; i++){
            System.out.println(array1[i]);
        }
        System.out.println(average + " Average ");
    }

}