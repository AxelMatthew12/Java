package NYOBAUTS;

public class Rekening {
    String noRekening;
    String nama;
    String namaibu;
    String phone;
    String Email;

   Rekening(String noRekening, String nama, String namaibu, String phone, String Email) {
    this.noRekening = noRekening;
    this.nama= nama;
    this.namaibu = namaibu;
    this.phone = phone;
    this.Email =Email;
   }
    void display() {
        System.out.println("------------------------");
        System.out.println("NO REKENING : "+noRekening);
        System.out.println("NAMA        : " + nama);
        System.out.println("EMAIL       : " + Email);
        System.out.println("PHONE       : " +phone);
        System.out.println("NAMAIBU     : "+namaibu);
    }

}   
