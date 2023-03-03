package Pattern;

public interface VideoProcessor {
    void process(String videoFile);
}
class HDProcessor implements VideoProcessor{
	@Override
	public void process(String videoFile) {
		System.out.println(videoFile+" is playing in HD");
		
	}
}
class UHD4KProcessor implements VideoProcessor{
	@Override
	public void process(String videoFile) {
		System.out.println(videoFile+" is playing in Ultra HD 4K");
		
	}
}
class UHD18KProcessor implements VideoProcessor{
	@Override
	public void process(String videoFile) {
		System.out.println(videoFile+" is playing in Ultra HD 18K");
		
	}
}