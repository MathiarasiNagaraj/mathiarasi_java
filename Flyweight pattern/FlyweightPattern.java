package FlyWeightPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlyweightPattern {
	/**
	 * playlist is used to store the corresponding object details based on
	 * common thing
	 ***/
	static List<YoutubeVideos> playlist = new ArrayList<>();

	public static void main(String[] args) {
        /***
         * Properties :
         * videolink :link of video
         * authorname,channel name,channel description is common thing if channel is same for vidoe links**/
		String videolink, Authorname, channelName, channelDescription;
		long subscribers;
		/*
		 * Scanner class used to get the video details
		 *  **/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter video details");
		int count = 0;
		/*
		 * Looping 3 times to get 3 videos 
		 * 2 from same channel
		 * and 1 from different channel
		 * video from channel the channel details object will be created only once
		 * 
        ***/
		while (count < 3) {
			System.out.println("Enter videolink path:");
			videolink = sc.nextLine();
			System.out.println("Enter Author name :");
			Authorname = sc.nextLine();
			System.out.println("Enter channelName :");
			channelName = sc.nextLine();
			System.out.println("Enter channel description :");
			channelDescription = sc.nextLine();
			System.out.println("Enter channel subscribers count :");
			subscribers = sc.nextLong();
			addVideo(videolink, Authorname, subscribers, channelName, channelDescription);

			count++;
		}
		sc.close();

	}
   /*
    * addVideo is method where properties oof video is passed and it will store video link and channel details as reference in playlist
    * */
	static void addVideo(String videolink, String Authorname, long subscribers, String channelName,
			String channelDescription) {
		YoutubeVideoChannel channeltype = ChannelFactory.getChannelDetails(Authorname, 0, channelName,
				channelDescription);
		playlist.add(new YoutubeVideos(videolink, channeltype));
	}

}
