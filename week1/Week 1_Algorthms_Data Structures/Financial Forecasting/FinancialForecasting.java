public class FinancialForecasting {
    public static double calculateFutureValue(double principal, double growthRate, int years) {
        
        if (years == 0) {
            return principal;
        }
        return calculateFutureValue(principal * (1 + growthRate), growthRate, years - 1);
    }
    public static void main(String[] args) {
        double principal = 1000.0; 
        double growthRate = 0.05; 
        int years = 10; 

        
        double futureValue = calculateFutureValue(principal, growthRate, years);
        System.out.printf("The future value after %d years is: %.2f%n", years, futureValue);
    }
}
