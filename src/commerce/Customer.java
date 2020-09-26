package commerce;

public class Customer extends User {
    private BillingInformation billingInformation;
    private Cart cart;

    public Customer(String name, String phone, Address homeAddress, String emailAddress, String password, Cart cart, BillingInformation billing) {
        super(name, phone, homeAddress, emailAddress, password);
        billingInformation = billing;
        this.cart = cart;
    }

    @Override
    public void viewAvailableItems() {

    }
}
