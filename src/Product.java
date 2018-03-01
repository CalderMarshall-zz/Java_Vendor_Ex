public class Product {
    String name;

    String description;

    double price;

//    int num_in_Store;


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
//        this.num_in_Store = num_in_Store;
    }

//    public int getNum_in_Store() {
//        return num_in_Store;
//    }
}
