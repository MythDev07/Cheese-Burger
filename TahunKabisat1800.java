package theProject;
import java.util.Scanner;

/**
 * By: aditiya Pratama Lubis
 */
public class TahunKabisat1800 {
    public static void main (String[] args) {
        
        //Tahun Kabisat Pseudocode
        Scanner input = new Scanner (System.in);
        System.out.println ("Input Tahun!");
        int num = input.nextInt();
        System.out.println ("Tahun " + num + " adalah");
        if (num % 100 == 0) {
            int num1 = num / 100;
            System.out.println (num1);
            if (num1 % 4 >= 1) {
                System.out.println ("Bukan Kabisat");
            }
            else {
                System.out.println ("kabisat");
            }
        }
        else if (num % 100 >= 1) {
            if (num % 4 == 0) {
                System.out.println ("Kabisat");
            }
            else {
                System.out.println ("Bukan Kabisat");
            }
        }
        else {
            System.out.println ("Wrong Input!");
        }
    }    
}
