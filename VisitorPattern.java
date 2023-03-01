package Pattern;

import java.util.Scanner;

public class VisitorPattern {
public static void main(String[] args)throws RoadException {
		
		Driver man=new Driver();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter  situation...:");
		String situation=scan.next();
		
		man.driving(situation);
	}
}
class Driver{
	public void driving(String situation) throws RoadException{
		if(situation.equals("highspeed")) {
			throw new RoadHighSpeedException("High speed driving ,high speed  deadend");
		}
		else if(situation.equals("nohelmet")) {
			throw new RoadNoHelmetException("head injury");
		}
		else if(situation.equals("triples")) {
			throw new RoadTriplesException("triples ");
		}
		
		
	}
}
abstract class Handler{
	public  abstract void handle(RoadHighSpeedException re);
	public  abstract void handle(RoadNoHelmetException rh);
	public  abstract void handle( RoadTriplesException rt);
}

class HandlerImpl extends Handler{
	@Override
	public void handle(RoadHighSpeedException re) {
		System.out.println("drive in correct speed");
	}
	@Override
	public void handle(RoadNoHelmetException rh) {
		System.out.println("wear helmet");
	}
	@Override
	public void handle(RoadTriplesException rt) {
		System.out.println("Go in doubles");
	}
}
abstract class RoadException extends Exception{
	public abstract void visit();
}


class RoadHighSpeedException extends RoadException{
	String msg;
	public RoadHighSpeedException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return msg;
	}	
	@Override
	public void visit() {
		Handler dbh=new HandlerImpl();
		dbh.handle(this);
	}
}
class RoadNoHelmetException extends RoadException{
	String msg;
	public RoadNoHelmetException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return msg;
	}	
	@Override
	public void visit() {
		Handler dbh=new HandlerImpl();
		dbh.handle(this);
	}
}
class RoadTriplesException  extends RoadException{
	String msg;
	public RoadTriplesException (String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return msg;
	}	
	@Override
	public void visit() {
		Handler dbh=new HandlerImpl();
		dbh.handle(this);
	}
}





