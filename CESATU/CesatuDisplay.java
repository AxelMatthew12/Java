package CESATU;
import java.util.Scanner;
import java.time.LocalTime;

public class CesatuDisplay {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        Scanner login = new Scanner(System.in);
        System.out.println("Time : "+ localTime);
        System.out.println("-------------------------------------");
        System.out.println("| Masukkan nama anda :             ||");
        String nama= login.nextLine();
        System.out.println("| Masukkan ID anda   :             ||");
        String id = login.nextLine();
        System.out.println("| Masukkan Password  :             ||");
        int password = login.nextInt();
        System.out.println("=====================================");
       
        Admin admin = new Admin(nama, id, password);
        admin.ChecksStatus();
        System.out.println("\n============================");
        DisplayConcept display = new DisplayConcept();

        display.Display();
        System.out.println("Option : ");
        int option2= login.nextInt();
        switch (option2) {
            case 1:
                System.out.println("Under Construction ! ");
                break;
            case 2:
            System.out.println("Under Construction ! ");
                break;

            default:
                break;
        }
    }
    
    
}
