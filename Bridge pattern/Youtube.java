package BridgePattern;

/*
 * Youtube is one kind of video**/
public class Youtube extends Video{
	 public Youtube(VideoProcessor processor) {
	        super(processor);
	    }
	/**Processed as per given processor
     /Now play*/
	    @Override
	    public void play(String videoFile) {
	        processor.process(videoFile); 
	    }
}
