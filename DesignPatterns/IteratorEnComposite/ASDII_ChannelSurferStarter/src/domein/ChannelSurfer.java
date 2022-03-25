package domein;

public class ChannelSurfer implements Iterator {

	private int currentChannel;
	private int max;

	public Channel nextChannel() {
		currentChannel= (currentChannel+1)%max;
		return new Channel(currentChannel);
	}

	public Channel prevChannel() {
		currentChannel= (currentChannel-1+max)%max;
		return new Channel(currentChannel);
	}

	public ChannelSurfer(int max) {
		this.max = max;
	}
}
