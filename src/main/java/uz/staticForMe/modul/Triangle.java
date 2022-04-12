package uz.staticForMe.modul;

public class Triangle {
    private double katet1;
    private double katet2;

    public double getKatet1() {
        return katet1;
    }

    public double getKatet2() {
        return katet2;
    }

    public void setKatet2(double katet2) {
        this.katet2 = katet2;
    }

    public void setKatet1(double katet1) {
        this.katet1 = katet1;
    }
    public double gipotinuza () {
        return Math.sqrt(katet1*katet1+katet2*katet2);
    }
    public void perimetr () {
        System.out.println("Perimetr: " + (katet1 + katet2 + gipotinuza()));
    }
    public void area () {
        System.out.println("Area: " + ((katet1 * katet2) / 2));
    }
}
