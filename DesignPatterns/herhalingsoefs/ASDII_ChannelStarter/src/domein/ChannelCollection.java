package domein;

public interface ChannelCollection {

    public void addChannel(Channel c);

    public void removeChannel(Channel c);

	ChannelIterator createIterator(ChannelType type);

}
