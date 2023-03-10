package BridgePattern;
/*
 * creating A videoprocessor interface seperated form video 
 * and implementing its own variety**/
public interface VideoProcessor {
    void process(String videoFile);
}

/*
 * HDProcessor is one type of processor
 * **/
class HDProcessor implements VideoProcessor{
	@Override
	public void process(String videoFile) {
		System.out.println(videoFile+" is playing in HD");
		
	}
}
/*
 * UHD4KProcessor is one type of processor
 * **/
class UHD4KProcessor implements VideoProcessor{
	@Override
	public void process(String videoFile) {
		System.out.println(videoFile+" is playing in Ultra HD 4K");
		
	}
}
/*
 * UHD18KProcessor is one type of processor
 * **/
class UHD18KProcessor implements VideoProcessor{
	@Override
	public void process(String videoFile) {
		System.out.println(videoFile+" is playing in Ultra HD 18K");
		
	}
}
