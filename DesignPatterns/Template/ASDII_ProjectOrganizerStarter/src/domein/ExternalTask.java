package domein;

public class ExternalTask extends Task {

//    private final static double VAT = 0.21;

    public ExternalTask(String name, String description, double taskTimeRequired, double rate) {
        super(name, description, taskTimeRequired, rate);
    }

//    @Override
//    public double getCostEstimate() {
//        double cost = super.getCostEstimate();
//        return cost * (1 + VAT);
//    }
    @Override
    protected boolean vatInclusief() { //hook
		return true;
	}

}
