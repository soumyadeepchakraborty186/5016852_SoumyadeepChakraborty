import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Headphones", "Accessories")
        };
        Product linearResult = SearchAlgorithms.linearSearch(products, 2);
        System.out.println("Linear Search Result: " + linearResult);
        Arrays.sort(products, (p1, p2) -> Integer.compare(p1.getProductId(), p2.getProductId()));
        Product binaryResult = SearchAlgorithms.binarySearch(products, 3);
        System.out.println("Binary Search Result: " + binaryResult);
    }
}
