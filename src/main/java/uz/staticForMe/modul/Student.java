package uz.staticForMe.modul;

public class Student {
    public String name;
    public String family;
    public int num;
    String [] fan = {"matematika", "english", "fizika", "bialogiya", "ximiya"};
    public void fanArray () {
        System.out.print("{");
        for (String arrays : fan) {
            System.out.print(arrays + " ");
        }
        System.out.print("}");
    }
}
