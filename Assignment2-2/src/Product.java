public class Product {
    double price;
    public double getPrice() {
        return price;
    }
    public double getPrice(int quantity) {
        return price*quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }


//    public double getMyDouble() {
//        return price;
//    }
//    public void setMyDouble(double value) {
//        price = value;
//    }


}
