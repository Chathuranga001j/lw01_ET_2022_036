package LW_03;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<BorrowableItems> borrowableItemsList;

    public Library() {
        borrowableItemsList = new ArrayList<>();
    }

    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    public boolean checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book b = (Book) item;
                if (b.getTitle().equalsIgnoreCase(title) && b.isAvailable()) {
                    b.setAvailable(false);
                    return true;
                }
            }
        }
        return false;
    }

    public void listAvailableItems() {
        System.out.println("Available items:");
        boolean any = false;
        for (BorrowableItems item : borrowableItemsList) {
            if (item.isAvailable()) {
                item.displayInfo();
                any = true;
            }
        }
        if (!any) {
            System.out.println("  None");
        }
    }

    public void displayLibraryInfo() {
        System.out.println("Library contains " + borrowableItemsList.size() + " items.");
        long availableCount = borrowableItemsList.stream().filter(BorrowableItems::isAvailable).count();
        System.out.println("Available items: " + availableCount);
    }
}
