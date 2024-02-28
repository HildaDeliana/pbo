// Class Mobil (parent class)
class Mobil {
    protected String jenisBahanBakar;

    public Mobil(String jenisBahanBakar) {
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void info() {
        System.out.println("Jenis bahan bakar: " + jenisBahanBakar);
    }
}

// Class MobilDiesel (subclass)
class MobilDiesel extends Mobil {
    public MobilDiesel() {
        super("Diesel");
    }
}

// Class MobilBensin (subclass)
class MobilBensin extends Mobil {
    public MobilBensin() {
        super("Bensin");
    }
}

// Class Main
public class Main {
    public static void main(String[] args) {
        MobilDiesel mobilDiesel = new MobilDiesel();
        MobilBensin mobilBensin = new MobilBensin();

        System.out.println("Informasi Mobil Diesel:");
        mobilDiesel.info();

        System.out.println("\nInformasi Mobil Bensin:");
        mobilBensin.info();
    }
}
