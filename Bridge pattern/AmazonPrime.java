package Pattern;

public class AmazonPrime extends Video{
	 public AmazonPrime(VideoProcessor processor) {
	        super(processor);
	    }

	    @Override
	    public void play(String videoFile) {
	        processor.process(videoFile); //Processed as per given processor
	        //Now play
	    }
}
