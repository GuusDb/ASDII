package domein;

public class Task extends ProjectItem {

//    private final double taskTimeRequired;

    public Task(String name, String description, double taskTimeRequired, double rate) {
        super(name, description, rate, taskTimeRequired);
//        this.taskTimeRequired = taskTimeRequired;
    }

//    public double getTaskTimeRequired() {
//        return taskTimeRequired;
//    }

//    @Override
//    public double getCostEstimate() {
//        double cost = getTaskTimeRequired() * getRate();
//        return cost;
//    }

}
