class MemberGym {
    private String nama;
    private int umur;
    private double beratBadan;

    public MemberGym() {
        this("", 0, 0);
    }

    public MemberGym(String nama, int umur) {
        this(nama, umur, 0);
    }

    public MemberGym(String nama, int umur, double beratBadan) {
        this.nama = nama;
        this.umur = umur;
        this.beratBadan = beratBadan;
    }

    public void info() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
        System.out.println("Berat Badan: " + this.beratBadan);
    }
}

class MemberGymPro extends MemberGym {
    private String program;

    public MemberGymPro(String nama, int umur, double beratBadan, String program) {
        super(nama, umur, beratBadan);
        this.program = program;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Program: " + this.program);
    }
}

public class Gym {
    public static void main(String[] args) {
        MemberGymPro member = new MemberGymPro("Hendry", 19, 68, "Program Shape");
        member.info();
    }
}
