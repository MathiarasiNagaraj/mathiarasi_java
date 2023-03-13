package Pattern;

class ClassRoom{
	int RoomSize;
	private ClassRoom()
	{
		
	}
	private static ClassRoom room=null;
	synchronized public static ClassRoom allocateClassRoom()
	{
		if(room==null)
			return new ClassRoom();
		else
			return room;
	}
	private ClassRoom getInstance() {
		return new ClassRoom();
	}
}
public class SingletonPattern {
public static void main(String[] args) {
	ClassRoom r1=ClassRoom.allocateClassRoom();
	r1.RoomSize=30;
	ClassRoom r2=ClassRoom.allocateClassRoom();
	System.out.println(r1.RoomSize);
	System.out.println(r1.hashCode()+"\n"+r2.hashCode());
}
}
