package LW_03;

public class Q5 {
    public static void main(String[] args) {
        // create books
        Book b1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
        Book b2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721", true);
        Book b3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);

        // create library and add items
        Library lib = new Library();
        lib.addLibraryItem(b1);
        lib.addLibraryItem(b2);
        lib.addLibraryItem(b3);

        // display library info and list available items
        lib.displayLibraryInfo();
        lib.listAvailableItems();

        // check out "Island of a Thousand Mirrors"
        System.out.println("\nChecking out 'Island of a Thousand Mirrors'...");
        boolean success = lib.checkoutItem("Island of a Thousand Mirrors");
        System.out.println("Checkout successful? " + success);

        // list available items again
        System.out.println();
        lib.displayLibraryInfo();
        lib.listAvailableItems();
    }
}
