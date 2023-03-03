package Pattern;
import java.util.HashMap;
import java.util.Map;


public class ChannelFactory {

    private static final Map<String, YoutubeVideoChannel> channels = new HashMap<>();

    public static YoutubeVideoChannel getChannelDetails(String Authorname, long subscribers, String channelName,String channelDescription) {
        if (channels.get(channelName) == null) {
            channels.put(channelName, new  YoutubeVideoChannel(Authorname,subscribers,channelName,channelDescription));
        }
        return channels.get(channelName);
    }

}