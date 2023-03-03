package Pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlyweightPattern {
	static List<YoutubeVideos> playlist = new ArrayList<>();

	public static void main(String[] args) {

		String videolink, Authorname, channelName, channelDescription;
		long  subscribers;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter video details");
		int count=0;
		while(count<3)
		{
			System.out.println("Enter videolink path:");
			videolink=sc.nextLine();
			System.out.println("Enter Author name :");
			Authorname=sc.nextLine();
			System.out.println("Enter channelName :");
			channelName=sc.nextLine();
			System.out.println("Enter channel description :");
			channelDescription=sc.nextLine();
			System.out.println("Enter channel subscribers count :");
			subscribers=sc.nextLong();
			addVideo(videolink,Authorname,subscribers,channelName,channelDescription);
			
			count++;
		}
		

	}

	static void addVideo(String videolink, String Authorname, long subscribers, String channelName,
			String channelDescription) {
		YoutubeVideoChannel channeltype = ChannelFactory.getChannelDetails(Authorname, 0, channelName,
				channelDescription);
		playlist.add(new YoutubeVideos(videolink, channeltype));
	}

	
}
