package domein;

public class Television {

    //TODO attributes
	private Iterator surfer;

    public Television(int maxChannel) {
        surfer = new ChannelSurfer(maxChannel);
    }

    public Program getNextProgram() {
        //TODO
        return surfer.nextChannel().getCurrentProgram();
    }

    public Program getPrevProgram() {
        //TODO
        return surfer.prevChannel().getCurrentProgram();
    }



}
