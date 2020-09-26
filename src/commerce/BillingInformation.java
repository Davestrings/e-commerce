package commerce;

public class BillingInformation {
    private Address deliveryAddress;
    private CreditCardInformation creditCardInformation;
    private String receiverName;
    private String receiverNumber;

    public BillingInformation(Address deliveryAddress, CreditCardInformation creditCardInformation, String receiverName, String receiverNumber) {
        this.deliveryAddress = deliveryAddress;
        this.creditCardInformation = creditCardInformation;
        this.receiverName = receiverName;
        this.receiverNumber = receiverNumber;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CreditCardInformation getCreditCardInformation() {
        return creditCardInformation;
    }

    public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverNumber() {
        return receiverNumber;
    }

    public void setReceiverNumber(String receiverNumber) {
        this.receiverNumber = receiverNumber;
    }

    @Override
    public String toString() {
        return "BillingInformation{" +
                "deliveryAddress=" + deliveryAddress +
                ", creditCardInformation=" + creditCardInformation +
                ", receiverName='" + receiverName + '\'' +
                ", receiverNumber='" + receiverNumber + '\'' +
                '}';
    }
}
