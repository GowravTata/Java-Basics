package OOPS;

public class School {
    public static void main(String[] args) {

        Student obj = new Student();
        obj.rollNo=8;
        obj.sName="Bob";
        obj.marks=67;
        obj.sAge=14;

        double percent = obj.getPercent();
        System.out.println(percent);

        Teacher obj1 = new Teacher();
        obj1.tName="Chand";
        obj1.eId=17;
        obj1.tAge=38;
        obj1.salary = 380000;

        int asal = obj1.annualSalary();
        System.out.println(asal);

    }
    
}
