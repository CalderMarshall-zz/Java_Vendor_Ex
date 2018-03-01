public class Vendor {
    String name;
    Product[] products;

//    Constructor
    public Vendor(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }
//    Getter
    public String getName() {
        return name;
    }


    public Product[] getProducts() {
        return products;
    }


}


