package CESATU;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CesatuMain {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("| Masukkan nama anda :             ||");
        String nama= login.nextLine();
        System.out.println("| Masukkan ID anda   :             ||");
        String id = login.nextLine();
        System.out.println("| Masukkan Password  :             ||");
        int password = login.nextInt();
        System.out.println("====================================");
       
        Admin admin = new Admin(nama, id, password);
        admin.ChecksStatus();

        Countdown countdown = new CesatuMain().new Countdown();
        countdown.startCountdown(5);
    }

    class Countdown {
        public void startCountdown(int seconds) {
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                int i = seconds;
                public void run() {
                    System.out.print(i-- + " ");
                    if (i < 0) {
                        timer.cancel();
                        closeProgram();
                    }
                }
            }, 0, 1000);
        }
    }

    private static void closeProgram() {
        System.out.println("\nProgram ditutup.");
        System.exit(0);
    }
}
