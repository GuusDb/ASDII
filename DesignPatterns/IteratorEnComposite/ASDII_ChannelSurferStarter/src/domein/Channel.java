package domein;

import java.util.Date;

public class Channel {

    private final int numberChannel;

    public Channel(int number) {
        this.numberChannel = number;
    }

    public int getNumberChannel() {
        return numberChannel;
    }
    
     public Program getCurrentProgram()
    {
        return new Program(new Date(), this);
    }
}
