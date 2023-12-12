import java.util.Scanner;

public class Alan {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        int kenar1;
        int kenar2;
        int kenar3;

        System.out.println("1.Kenari Giriniz : ");
        kenar1 = scanner.nextInt();
        System.out.println("2.Kenari Giriniz : ");
        kenar2 = scanner.nextInt();
        System.out.println("3.Kenari Giriniz : ");
        kenar3 = scanner.nextInt();

        double u = ((kenar1 + kenar2 + kenar3) / 2);

        double Alan = (u * (u-kenar1)* (u-kenar2)* (u-kenar3));

        if(kenar1 + kenar2 >= kenar3 && kenar3 + kenar2 >= kenar1 && kenar1 + kenar3 >= kenar2 )
        {
            System.out.println("Ucgeninizin Alani : " + Math.sqrt(Alan));
        }else{
            System.out.println("Bu üçgen çizilemez");
        }
        
        
        
        
        scanner.close();
        

    }

}
