package uz.staticForMe;

import uz.staticForMe.modul.*;

public class EnterDate {
    public static void main(String[] args) {
        pointXY();
        trianPerArea();
        atrubutes();
        thisDate();
        fanArrays();
        newPaswor();
        newchanPas();
    }

    public static void pointXY () {
        Point point = new Point();
        point.setX(45);
        point.setY(56);
        point.printXY();
    }
    public static void trianPerArea () {
        Triangle triangle = new Triangle();
        triangle.setKatet1(12);
        triangle.setKatet2(9);
        triangle.gipotinuza();
        triangle.perimetr();
        triangle.area();
    }
    public static void atrubutes () {
        MyClass myClass = new MyClass();
        myClass.firstAtribut=25;
        myClass.secondAtribut=45;
        myClass.aboutAtributes();
        myClass.sumAtributes();
        myClass.maxAtributes();
        myClass.maxTernary();
        myClass.bibliotekaMax();
        myClass.integerMax();
    }
    public static void thisDate () {
        ShowDate showDate = new ShowDate();
        showDate.day=3;
        showDate.month=2;
        showDate.year=22;
        showDate.enterDate();
    }
    public static void fanArrays () {
        Student student = new Student();
        student.fanArray();
    }
    public static void newPaswor(){
        Users users = new Users();
        users.email = "adham@mail.ru";
        users.userName="adham";
        users.password ="1987";
        users.user_info();
    }
    public static void newchanPas () {
        NewUsers newUsers=new NewUsers();
        newUsers.changePassword();
    }
}