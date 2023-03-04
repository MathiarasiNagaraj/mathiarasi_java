package Pattern;

import java.util.Scanner;

public class VisitorPattern {
	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		System.out.println("Road accident situations:");
		System.out.println("1.Highspeed\n2.Nohelmet\n3.Triples");
		System.out.println("Please enter  situation...:");
		String situation = scan.next();
		situation = "Pattern." + situation;
		RoadIncidents incident = (RoadIncidents) Class.forName(situation).getConstructor().newInstance();

	}
}

abstract class RoadIncidents {

}

class Highspeed extends RoadIncidents {
	public Highspeed() {
		try {
			throw new RoadHighSpeedException("High speed driving ,high speed  deadend");
		} catch (RoadHighSpeedException re) {
			re.visit();
		}

	}
}

class Nohelmet extends RoadIncidents {
	public Nohelmet() {
		try {
			throw new RoadNoHelmetException("head injury");
		} catch (RoadNoHelmetException re) {
			re.visit();
		}
	}
}

class Triples extends RoadIncidents {
	public Triples() {
		try {
			throw new RoadTriplesException("triples ");
		} catch (RoadTriplesException re) {
			re.visit();
		}
	}
}

abstract class Handler {
	public abstract void handle(RoadHighSpeedException re);

	public abstract void handle(RoadNoHelmetException rh);

	public abstract void handle(RoadTriplesException rt);
}

class HandlerImpl extends Handler {
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

abstract class RoadException extends Exception {
	public abstract void visit();
}

class RoadHighSpeedException extends RoadException {
	String msg;

	public RoadHighSpeedException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

	@Override
	public void visit() {
		Handler dbh = new HandlerImpl();
		dbh.handle(this);
	}
}

class RoadNoHelmetException extends RoadException {
	String msg;

	public RoadNoHelmetException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

	@Override
	public void visit() {
		Handler dbh = new HandlerImpl();
		dbh.handle(this);
	}
}

class RoadTriplesException extends RoadException {
	String msg;

	public RoadTriplesException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

	@Override
	public void visit() {
		Handler dbh = new HandlerImpl();
		dbh.handle(this);
	}
}
