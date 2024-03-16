abstract class Kue {
    String nama;
    double harga;

    Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    abstract public double hitungHarga();

    public String toString() {
        return "Nama Kue\t\t: " + nama + "\nHarga Kue\t\t: " + harga;
    }
}

class KuePesanan extends Kue {
    double berat;

    KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return this.harga * this.berat;
    }
}

class KueJadi extends Kue {
    double jumlah;

    KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return this.harga * this.jumlah * 2;
    }
}

public class KueKu {
    public static void main(String[] args) {
        Kue kuePesanan1 = new KuePesanan("Putu", 5000, 2);
        Kue kueJadi1 = new KueJadi("Bolu", 4000, 10);

        System.out.println(kuePesanan1.toString());
        System.out.println(kueJadi1.toString());

        System.out.println("Harga Kue Pesanan\t: Rp. " + kuePesanan1.hitungHarga());
        System.out.println("Harga Kue Jadi\t: Rp. " + kueJadi1.hitungHarga());
    }
}
