import java.util.Arrays;

public class Order {
    private String orderId;
    private String customerName;
    private double totalPrice;

    public Order(String orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }

    
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                if (orders[j].getTotalPrice() < orders[j + 1].getTotalPrice()) {
                    
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = (low - 1); 
        for (int j = low; j < high; j++) {
            
            if (orders[j].getTotalPrice() >= pivot) {
                i++;
                
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "Alice", 250.0),
            new Order("2", "Bob", 150.0),
            new Order("3", "Charlie", 300.0),
            new Order("4", "Diana", 100.0)
        };

        System.out.println("Original Orders:");
        System.out.println(Arrays.toString(orders));

        
        Order.bubbleSort(orders);
        System.out.println("\nOrders Sorted by Bubble Sort (Descending):");
        System.out.println(Arrays.toString(orders));

        
        orders = new Order[]{
            new Order("1", "Alice", 250.0),
            new Order("2", "Bob", 150.0),
            new Order("3", "Charlie", 300.0),
            new Order("4", "Diana", 100.0)
        };

        
        Order.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort (Descending):");
        System.out.println(Arrays.toString(orders));
    }
}