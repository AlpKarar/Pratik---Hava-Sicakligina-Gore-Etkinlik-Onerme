/* 
   Ödev
   Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        int temp;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Temperature: ");
        temp = input.nextInt();
        
        if (temp < 5) {
            System.out.print("Ski");
        } else if (5 <= temp && temp <= 25) {
            if (temp == 15) {
                System.out.print("Both cinema and picnic");
            } else if (temp < 15) {
                if (temp < 10) {
                    System.out.print("Cinema");
                } else {
                    System.out.print("Both cinema and picnic");
                }
            } else {
                System.out.print("Picnic");
            }
        } else {
            System.out.print("Swimming");
        }
    }
}
