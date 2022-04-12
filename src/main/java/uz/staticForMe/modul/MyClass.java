package uz.staticForMe.modul;

public class MyClass {
    public int firstAtribut;
    public int secondAtribut;

    public void aboutAtributes () {
        System.out.println("About atributes " + "\nfirst atribut: " + firstAtribut + "\n second atribut: " + secondAtribut);
    }
    public void sumAtributes () {
        System.out.println("sum atrubutes " + (firstAtribut+secondAtribut));
    }
    public void maxAtributes () {
        if (firstAtribut>secondAtribut) {
            System.out.println("max atribut: " + firstAtribut);
        } else {
            System.out.println("max atributes: " + secondAtribut);
        }
    }
    public void maxTernary () {
        System.out.println("max: " + (firstAtribut>=secondAtribut?firstAtribut:secondAtribut));
    }
    public void bibliotekaMax () {
        System.out.println("max: " + Math.max(firstAtribut, secondAtribut));
    }
    public void integerMax () {
        System.out.println("max: " + Integer.max(firstAtribut, secondAtribut));
    }

}
