package domein;

import java.util.*;
import java.util.stream.Collectors;

public class ChannelIteratorImpl implements ChannelIterator {
	private Iterator<Channel> it;
	
	public ChannelIteratorImpl(List<Channel> channelList, ChannelType type) {
		if(type!=ChannelType.ALL) {
		channelList = channelList.stream().filter(elem->elem.getTYPE()==type).collect(Collectors.toList());
		}
		
		it = channelList.iterator();
	}


	public boolean hasNext() {
		return it.hasNext();
	}

	public Channel next() {
		return it.next();
	}

}
