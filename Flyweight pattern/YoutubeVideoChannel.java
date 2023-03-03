package Pattern;

public class YoutubeVideoChannel {
String Authorname;
long subscribers;
String channelName;
String channelDescription;
public YoutubeVideoChannel(String authorname, long subscribers, String channelName, String channelDescription) {
	System.out.println("video uploaded in"+authorname);
	this.Authorname = authorname;
	this.subscribers = subscribers;
	this.channelName = channelName;
	this.channelDescription = channelDescription;
}
}
