package commerce;

public class Admin extends User {
    public Admin(String name, String phone, Address homeAddress, String emailAddress, String password) {
        super(name, phone, homeAddress, emailAddress, password);
    }

    @Override
    public void viewAvailableItems() {

    }
}
