package domein;

import java.util.Date;

public class Program {

    private final Channel channel;
    private final Date date;

    public Program(Date date, Channel channel) {
        this.date= date;
        this.channel = channel;
    }

    public int getNrChannel() {
        return channel.getNumberChannel();
    }
}
