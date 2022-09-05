package chapter17;
@FunctionalInterface
public interface Staff {
    void work(int numberOfWorkingHours);

    static void assist() {
        System.out.println(" :( ");
    }

}
