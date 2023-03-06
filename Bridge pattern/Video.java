package BridgePattern;

/*
 * Video class Processor as property
 * and play method
 * **/
public abstract class Video {
	/*
	 * Reference of VideoProcessor is acting as bridge between video and videoProcessor
	 * **/
 VideoProcessor processor;
 /*
  * constructor to set the processor of the video **/
 public Video(VideoProcessor processor)
 {
	 this.processor=processor;
 }
 /*
  * play to play the file**/
 public abstract void play(String videoFile);
}
