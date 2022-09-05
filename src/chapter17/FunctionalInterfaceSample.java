package chapter17;

public class FunctionalInterfaceSample  {

    public static void main(String[] args) {
        Staff staff = (numberOfWorkingHours)-> overTime(numberOfWorkingHours);
        staff.work(10);
    }

    private static void overTime(int numberOfWorkingHours) {
        int doubleTime = numberOfWorkingHours * 2;
        System.out.println("I work  " + doubleTime + " hours a week");
    }
}
