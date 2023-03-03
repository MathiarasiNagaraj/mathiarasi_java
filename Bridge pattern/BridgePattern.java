package Pattern;

public class BridgePattern {
public static void main(String[] args) {
	Video youtube=new Youtube(new HDProcessor());
	youtube.play("Beliver.mp4");
	Video instagram=new Instagram(new UHD4KProcessor());
	instagram.play("Beliver.mp4");
	Video prime=new AmazonPrime(new UHD18KProcessor());
	prime.play("Beliver.mp4");
}
}
