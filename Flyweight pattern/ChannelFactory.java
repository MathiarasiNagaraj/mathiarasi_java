package FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

/*
 * channel Factory is class used to check if a channel details is already present in channel or else
 * if no channel details is there for channelname
 * then it will create one**/
public class ChannelFactory {
	/*
	 * using hashmap for storing channel details with channel name as key
	 **/

	private static final Map<String, YoutubeVideoChannel> channels = new HashMap<>();
/*
 * method to geting channel details and storing channel details after storing it in hashmap it will return the channel
 * **/
	public static YoutubeVideoChannel getChannelDetails(String Authorname, long subscribers, String channelName,
			String channelDescription) {
		if (channels.get(channelName) == null) {
			channels.put(channelName,
					new YoutubeVideoChannel(Authorname, subscribers, channelName, channelDescription));
		}
		return channels.get(channelName);
	}

}
