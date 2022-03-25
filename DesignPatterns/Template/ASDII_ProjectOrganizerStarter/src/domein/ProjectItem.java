package domein;



public abstract class ProjectItem {

    private final String name;
    private final String description;
    private final double rate;
    private final double time;
    private final static double VAT = 0.21;

    public ProjectItem(String newName, String newDescription, double newRate, double time) {
        name = newName;
        description = newDescription;
        rate = newRate;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getRate() {
        return rate;
    }

    public /*abstract*/ double getCostEstimate() { //templatemethode
        double cost = getTime() * getRate() + getMaterialsCost();
        if(vatInclusief()) { //gebruik hook
            cost = cost * (1 + VAT);
        }
        return cost;
        
    }
    
    protected boolean vatInclusief() { //hook
		return false;
	}

	public final double getTime() { //concrete operation -- normaal protected, nu niet omdat getter 
        return time;
    }
    
    public double getMaterialsCost() { //hook -- normaal protected, nu niet omdat getter 
        return 0;
    }

    @Override
    public String toString() {
        return getName();
    }

}
