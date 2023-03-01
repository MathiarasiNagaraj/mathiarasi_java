package Pattern;

public class BuilderPattern {
public static void main(String[] args) {
	Home home= new Home.HomeBuilder().setTiles("white tiles").setDoordesign("teak door").getHome();
System.out.println(home);
}
}
class Home{
	
	String tiles="default tiles",roof=" default roof",walldesign="default wall",doordesign="default door ",windowdesign="default window";
	Home(HomeBuilder home)
	{
		this.tiles=home.tiles;
		this.walldesign=home.walldesign;
		this.roof=home.roof;
		this.doordesign=home.doordesign;
		this.windowdesign=home.windowdesign;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Your sweet Home with "+tiles+" design ,"+walldesign+" design,"+roof+"\n design ,"+doordesign+" design , "+windowdesign+" designs is all yours now!!!";
	}
	static class HomeBuilder{
		
		String tiles="default tiles",roof=" default roof",walldesign="default wall",doordesign="default door ",windowdesign="default window";
		

		public HomeBuilder setTiles(String tiles) {
			this.tiles = tiles;
			return this;
		}

		

		public HomeBuilder setRoof(String roof) {
			this.roof = roof;
			return this;
		}

		
		public HomeBuilder setWalldesign(String walldesign) {
			this.walldesign = walldesign;
			return this;
		}

		

		public HomeBuilder setDoordesign(String doordesign) {
			this.doordesign = doordesign;
			return this;
		}

		

		public HomeBuilder setWindowdesign(String windowdesign) {
			this.windowdesign = windowdesign;
			return this;
		}
		
		
		public Home getHome()
		{
			return new Home(this);
		}
	}
}