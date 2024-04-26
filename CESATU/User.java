package CESATU;


public class User {
    String nama;
    String alamat;
    String noTelp;
    String idCustomer;
    
    User(String nama, String alamat, String noTelp) {
        this.nama= nama;
        this.nama= alamat;
        this.noTelp= noTelp;

    }
    void CheckMember(){
        System.out.println("Nama anda :"+ nama);
        System.out.println("Alamat    :"+ alamat);
        System.out.println("No telp   :"+ noTelp);
    }
    

}
