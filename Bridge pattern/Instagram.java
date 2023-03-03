package Pattern;

public class Instagram extends Video{
	 public Instagram(VideoProcessor processor) {
	        super(processor);
	    }

	    @Override
	    public void play(String videoFile) {
	        processor.process(videoFile); //Processed as per given processor
	        //Now play
	    }
}