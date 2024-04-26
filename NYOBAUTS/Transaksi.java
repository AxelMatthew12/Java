package NYOBAUTS;

public class Transaksi {
    double saldo;
    double saldoawal;
    double saldoakhir;
    String tanggalTransaksi;
    String type;

    Transaksi(double a, double b, double c, String d, String  e) {
        this.saldo =a;
        this.saldoawal =b;
        this.saldoakhir =c;
        this.tanggalTransaksi =d;
        this.type = e;
        saldo = saldoawal-saldoakhir;
    }
    void Rekeningshow() {
        System.out.println("Saldo awal  : "+saldoawal);
        System.out.println("Type        : "+type);
        System.out.println("==============");
        System.out.println("saldo akhir : "+saldoakhir);
        System.out.println("Saldo       : "+saldo);
        System.out.println("===============================");
    }
}
