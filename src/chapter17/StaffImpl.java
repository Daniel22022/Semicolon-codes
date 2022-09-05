package chapter17;

public class StaffImpl implements Staff {


    @Override
    public void work(int numberOfWorkingHours) {
        System.out.println("I am working for " + numberOfWorkingHours + " hours");
    }
}
