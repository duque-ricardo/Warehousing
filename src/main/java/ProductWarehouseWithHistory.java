public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        history.add(initialBalance);

    }

    public String history() {
        return history.toString();
    }

    public void printAnalysis() {
        StringBuilder str = new StringBuilder();
        str.append("Product: " + super.getName() + "\n");
        str.append("History: " + history);
        str.append("Largest amount of product: " + history.maxValue());
        str.append("Smallest amount of product: " + history.minValue());
        str.append("Average: " + history.average());
        System.out.println(str.toString());
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        amount = super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        return amount;
    }
}
