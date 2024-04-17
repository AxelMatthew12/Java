package CESATU;
import java.util.Scanner;

public class CesatuMain {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    

    System.out.println("================ WELCOME ===================");
    System.out.println("||            1. L O G I N                ||");
    System.out.println("||            2. L O G O U T              ||");
    System.out.println("============================================");
    System.out.println("Option : ");
    int option = sc.nextInt();

    if (option == 1) {
        System.out.println("Masukkan id anda : ");
        String id = sc.next();
        System.out.println("Masukkan Nama anda : ");
        String nama = sc.next();
        System.out.println("Password : ");
        int password = sc.nextInt();
        Login login = new Login(nama, id, password);
        if (password == 123) {
            login.Displaylogin();
            System.out.println("----------------------------------------------------");
            System.out.println("Masukkan menu anda : ");
            System.out.println("Nasi sambal / Nasi sambal cesatu / RiceBox Cesatu");
            String menu =  sc.next();

            System.out.println("Masukkan harga : ");
            int harga = sc.nextInt();

            sc.nextLine();

            System.out.println("Masukkan diskon : ");
            int diskon = sc.nextInt();
            
            sc.nextLine();

            System.out.println("-----------------------------------------------------");  
            Main main = new Main(menu, harga, diskon);
            
            main.tampil();
            System.out.println("-----------------------------------------------------");
        } else {
            System.out.println("Data atau Password anda salah ! ");

            sc.close();
        }
    } else {
        System.out.println("Anda keluar dari Program ! ");
    }
    
    sc.close();
   
}    
}
