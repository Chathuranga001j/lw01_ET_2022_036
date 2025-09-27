package LW_03;

public class Q3 {
    public static void main(String[] args) {
        Owner o1 = new Owner("Amal Perera", "071-1234567");
        Bicycle b1 = new Bicycle(o1);

        System.out.println("Bicycle owner: " + b1.getOwner()); // uses Owner.toString()

        // change owner details
        b1.setOwnerName("Kasun Silva");
        b1.setPhoneNo("077-7654321");
        System.out.println("Updated bicycle owner: " + b1.getOwner());
    }
}
