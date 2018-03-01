
public class Main {

    public static void main (String[] args ){

        Product[] guys_fruits = new Product[5];
        Product[] girls_veg = new Product[5];
        Product[] dudesBeers = new Product[5];
        guys_fruits[0] = new Product("apple", "crisp", 3.5);
        guys_fruits[1] = new Product("banana", "red", 3.1);
        guys_fruits[2] = new Product("orange", "green", 2.2);
        guys_fruits[3] = new Product("starfruit", "juicy", 2.5);
        guys_fruits[4] = new Product("kiwi", "soggy", .5);
        girls_veg[0] = new Product("nappa cabbage","green", 3);
        girls_veg[1] = new Product("squash","yellow", 2.2);
        girls_veg[2] = new Product("roma tomato","red", 1.8);
        girls_veg[3] = new Product("broccoli","green", 3);
        girls_veg[4] = new Product("i got chives on it","green", 5);

        dudesBeers[0] = new Product("corona", "mexican", 3);
        dudesBeers[1] = new Product("duvel", "euro", 4);
        dudesBeers[2] = new Product("yeingling", "usa", 4);
        dudesBeers[3] = new Product("white zombie", "ashville", 4);
        dudesBeers[4] = new Product("abandon all hope", "14% Atl Porter", 5);

        Vendor guy = new Vendor("guy", guys_fruits);
        Vendor girl = new Vendor("girl", girls_veg);
        Vendor beerDude = new Vendor("BeerDude", dudesBeers);

        System.out.println("Here go some fruit\n");
        for(Product poop : guys_fruits){
            System.out.println(poop.name + " " + "$" + poop.price);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Here go some veg\n");
        for(Product poop : girls_veg){
            System.out.println(poop.name + " " + "$" + poop.price);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Here go some beer\n");
        for(Product poop : dudesBeers){
            System.out.println(poop.name + " " + "$" + poop.price);
        }

//        Scanner reader = new Scanner(System.in);
//        System.out.println("type guys_fruits: ");
    }
}
