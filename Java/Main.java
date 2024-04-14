package Java;

public class Main {
    String menu;
    int harga;
    int diskon;
    

 Main(String m, int h, int dc ) {
    menu = m;
    harga = h;
    diskon = dc; 
    }

void tampil () {
    System.out.println("\tMenu        "+": "+ menu);
    System.out.println("\tHarga menu  "+": "+ harga);
    System.out.println("\tDiskon      "+": "+ diskon);
   
    double totaldibayar = harga - diskon;
    System.out.println("\tTotal Harga "+": "+totaldibayar);
    
}

}
