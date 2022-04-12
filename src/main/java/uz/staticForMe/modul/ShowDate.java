package uz.staticForMe.modul;

public class ShowDate {
    public int day;
    public int month;
    public int year;
    public void enterDate () {
        System.out.println((day<10?"0" + day:day) + "." + (month<10?"0" + month:month) + "." + (year<100?"20" + year:year));
    }
}
