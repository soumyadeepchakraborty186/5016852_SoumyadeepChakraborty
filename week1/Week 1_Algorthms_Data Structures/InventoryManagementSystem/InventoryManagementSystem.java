import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<Integer, Product> inventory;

    
    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }

    
    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found with ID: " + product.getProductId());
        }
    }

    
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            Product removedProduct = inventory.remove(productId);
            System.out.println("Product removed: " + removedProduct);
        } else {
            System.out.println("Product not found with ID: " + productId);
        }
    }

    
    public void displayProducts() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }

    
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        
        Product product1 = new Product(1, "Laptop", 10, 75000);
        Product product2 = new Product(2, "Smartphone", 20, 30000);
        ims.addProduct(product1);
        ims.addProduct(product2);

        
        ims.displayProducts();

        
        Product updatedProduct1 = new Product(1, "Laptop", 8, 74000);
        ims.updateProduct(updatedProduct1);

        
        ims.displayProducts();

        
        ims.deleteProduct(2);

        
        ims.displayProducts();
    }
}
