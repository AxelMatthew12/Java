package Java;
import java.util.Scanner;

public class CesatuMain {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    
    System.out.println("----------------------------------------------------");
    System.out.println("Masukkan menu anda : ");
    System.out.println("Nasi sambal / Nasi sambal cesatu / RiceBox Cesatu");
    String menu = sc.nextLine();
    System.out.println("Masukkan harga : ");
    int harga = sc.nextInt();
    System.out.println("Masukkan diskon : ");
    int diskon = sc.nextInt();
    System.out.println("-----------------------------------------------------");  
    Main main = new Main(menu, harga, diskon);
    
    main.tampil();
    System.out.println("-----------------------------------------------------");
}    
}
