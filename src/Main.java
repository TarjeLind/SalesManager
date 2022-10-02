public class Main {
    public static void main(String[] args) {
        int[] sales={20, 60, 800, 100, 4000, 600, 6};
        SalesManager salesManager= new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
