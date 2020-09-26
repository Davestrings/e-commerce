package commerce;

public abstract class User {
 private String name;
 private String phone;
 private Address homeAddress;
 private String emailAddress;
 private String password;

    public User(String name, String phone, Address homeAddress, String emailAddress, String password) {
        this.name = name;
        this.phone = phone;
        this.homeAddress = homeAddress;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public abstract void viewAvailableItems();

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", homeAddress=" + homeAddress +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
