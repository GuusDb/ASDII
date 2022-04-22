package domein;

class HasQuarterState extends GumballMachineState {

    public HasQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public String ejectQuarter() {
        gumballMachine.toState( new NoQuarterState(gumballMachine));
        return "Quarter returned";
    }

    @Override
    public String turnCrank() {
        gumballMachine.toState(new SoldState(gumballMachine));
        return "You turned...";
    }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }
}
