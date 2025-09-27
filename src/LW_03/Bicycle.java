package LW_03;

public class Bicycle {
    // Data Member
    private Owner owner;

    // Constructor: initializes owner to Unknown
    public Bicycle() {
        this.owner = new Owner("Unknown", "Unknown");
    }

    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    // Returns owner object
    public Owner getOwner() {
        return owner;
    }

    // Assigns owner
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    // Convenience: get owner's name
    public String getOwnerName() {
        return owner.getOwnerName();
    }

    // Convenience: set owner's name
    public void setOwnerName(String name) {
        owner.setOwnerName(name);
    }

    public String getPhoneNo() {
        return owner.getPhoneNo();
    }

    public void setPhoneNo(String num) {
        owner.setPhoneNo(num);
    }
}
