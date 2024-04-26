package NYOBAUTS;
import java.util.Scanner;
public class MainRunning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah pemrosessan : ");
        int JumlahNasabah = sc.nextInt();
        MainRunning[] obj = new MainRunning[JumlahNasabah];

        for(int i =0; i < JumlahNasabah ; i++) {
            System.out.println("Nasabah ke - "+(i+1));
            System.out.println("Masukkan noRek:");
            String noRekening = sc.nextLine();
            sc.nextLine();
            
            System.out.println("Nama          :");
            String nama = sc.nextLine();
            System.out.println("Nama ibu      : ");
            String namaibu = sc.nextLine();
            System.out.println("No telp       : ");
            String phone = sc.nextLine();
            System.out.println("Email         :");
            String Email = sc.nextLine();

            Rekening rekening = new Rekening(noRekening, nama, namaibu, phone, Email);
            rekening.display();
           
            

            
            
        }  
        System.out.println("Data nasabar yang telah dimasukkan : ");
        for(int i = 0; i < JumlahNasabah; i++) {
            System.out.println("Nasabah ke-"+(i+1)+": "+ obj[i]);
        } 

    }
}
