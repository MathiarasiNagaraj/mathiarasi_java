package FlyWeightPattern;
/*
 * youtube is class
 * used to store video link and store channel details**/
public class YoutubeVideos {
	
	YoutubeVideoChannel channel;
	String videolink;
	public YoutubeVideos( String videolink,YoutubeVideoChannel channel) {
		this.channel=channel;
		this.videolink = videolink;
	}
	

}
