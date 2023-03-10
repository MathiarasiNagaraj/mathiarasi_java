package FlyWeightPattern;
/*
 * 
 * Youtubechannel is seperate class that has corresponding details togethere if channel name is same**/
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
