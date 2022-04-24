import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double max = 0;
        for (Double cosa: this.history) {
            if (cosa > max) {
                max = cosa;
            }
        }

        return max;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double min = this.history.get(0);
        for (Double cosa: this.history) {
            if (cosa < min) {
                min = cosa;
            }
        }

        return min;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Double cosa : history) {
            sum += cosa;
        }

        return sum / history.size();
    }


    public String toString() {
        return this.history.toString();
    }


}
