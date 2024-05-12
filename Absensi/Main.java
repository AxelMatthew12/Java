package Absensi;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    
    public static void Menuborder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("========= Welcome =========");
        System.out.println("|| 1. Absensi            ||");
        System.out.println("|| 2. Logout             ||");
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime date = LocalDateTime.now();
        System.out.println("Start :  ");
        System.out.println("Time now : "+date);
        String option = sc.nextLine();
        if (option.equals("Yes") || option.equals("yes")) {
            Menuborder();
        } else {
            System.out.println("Error 404 !!!");
        }
    }
}
