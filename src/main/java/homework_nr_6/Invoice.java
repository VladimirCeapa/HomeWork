package homework_nr_6;

public class Invoice {
    private String deviceModel;
    private String productDescription;
    private int numberOfProductsPurchased;
    private double productPrice;

    public String getDeviceModel() {
        return deviceModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getNumberOfProductsPurchased() {
        return numberOfProductsPurchased;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setNumberOfProductsPurchased(int numberOfProductsPurchased) {
        ;
        if (numberOfProductsPurchased < 0) {
            this.numberOfProductsPurchased = 0;
        } else {
            this.numberOfProductsPurchased = numberOfProductsPurchased;
        }
    }

    public void setProductPrice(double productPrice) {

        if (productPrice < 0) {
            this.productPrice = 0.0;
        } else {
            this.productPrice = productPrice;
        }
    }

    public Invoice(String deviceModel, String productDescription, int numberOfProductsPurchased, double productPrice) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        this.numberOfProductsPurchased = numberOfProductsPurchased;
        this.productPrice = productPrice;
    }

    public double getAmount() {
        return (double) productPrice * numberOfProductsPurchased;
    }
}

