public class Simulation {
    public static void main(String[] args) {
        Address test = new Address("1313 Mockingbird Lane, Springfield, MO 65123");
        System.out.println(test);
        System.out.println(test.getStreet());
        Address test2 = new Address(test);
        System.out.println(test2);
        System.out.println(test2.getStreet());
        Address test3 = new Address("1313 Mockingbird Lane Apt 6A, Springfield, MO 65123");
        System.out.println("-------------------------");
        System.out.println(test.compare(test2));
        System.out.println(test.compare(test3));
        System.out.println(test2.compare(test3));
    }
}
