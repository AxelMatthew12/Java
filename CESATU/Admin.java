package CESATU;

// import java.util.Scanner;

public class Admin {
    String nama;
    String id;
    int password;
      Admin(String nama, String id, int password) {
         this.nama = nama;
         this.id = id;
         this.password = password;
      }
      void ChecksStatus(){
         String id1= "001";
         String id2="002";
         String id3="003";
         System.out.println("======================");
            System.out.println("Nama anda   : " + nama);
            System.out.println("ID anda     : "+ id);
            System.out.println("====================");
         if (id.equals(id1)) {
            System.out.println("Status ID : Berhasil");
            System.out.println("Role      : Admin1");
            System.out.println("=====================");
            // BoardMenu();
         }else if (id.equals(id2)) {
            System.out.println("Status ID : Berhasil");
            System.out.println("Role      : Admin2");
            System.out.println("=======================");
            // BoardMenu();
         }else if (id.equals(id3)) {
            System.out.println("Status ID : Berhasil");
            System.out.println("Role      : Admin3");
            System.out.println("======================");
            // BoardMenu();
         }else {
           System.out.println("Status ID : Tidak Valid !"); 
            System.out.println("Role     : tidak di temukkan");
            System.out.println("==========================");
            // BoardMenu();
         }
         
      }
      //  void BoardMenu(){
      //    Scanner sc = new Scanner(System.in);
      //    System.out.println("===============================");
      //    System.out.println("||        C E S A T U        ||");
      //    System.out.println("||---------------------------||");
      //    System.out.println("||      1. MENU SHOW         ||");
      //    System.out.println("||      2. CHECKOUT          ||");
      //    System.out.println("||      3. RIWAYAT           ||");
      //    System.out.println("===============================");
      //    System.out.println("|| PILIHAN :                 ||");
      //    int option = sc.nextInt();
      //    switch (option) {
      //       case 1:
      //          System.out.println("Under construction ! // Comming Soon !");
      //          break;
      //          case 2:
      //          System.out.println("Under construction ! // Comming Soon !");
      //          break;
      //          case 3:
      //          System.out.println("Under construction ! // Comming Soon !");
      //          break;
      //    }
        
      // }
      
   }
    

