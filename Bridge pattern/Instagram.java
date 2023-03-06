package BridgePattern;
/*
 * Instagram is class that extends video **/
public class Instagram extends Video{
	 public Instagram(VideoProcessor processor) {
	        super(processor);
	    }

	/**Processed as per given processor
     Now play*/
	    @Override
	    public void play(String videoFile) {
	        processor.process(videoFile); 
	    }
}
