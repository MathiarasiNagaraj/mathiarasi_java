package BridgePattern;

public class AmazonPrime extends Video{
	/*
	 * Amazon prime is class that extends video **/
	 public AmazonPrime(VideoProcessor processor) {
	        super(processor);
	    }
	 /**Processed as per given processor
	  * 
     Now play*/
	    @Override
	    public void play(String videoFile) {
	        processor.process(videoFile); 
	       
	    }
}
