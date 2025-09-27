package LW_03;

public abstract class BorrowableItems {
    public abstract void displayInfo();
    private boolean available = true;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
