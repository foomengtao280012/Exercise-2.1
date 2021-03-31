
public class Main {

	public static void main(String[] args) {
		Pen MyPen = new Pen();
		Pen AbuPen = new Pen();
		
		MyPen.colour = "Black";
		MyPen.size = "0.5mm";
		MyPen.type = "Gel pen";
		
		AbuPen.colour = "Blue";
		AbuPen.size = "0.7mm";
		AbuPen.type = "Ballpoint pen";
		
		System.out.println("My Pen" + "\nColour: " + MyPen.colour + "\nSize: " + MyPen.size + "\nType: " + MyPen.type);
		
		System.out.println("Abu Pen" + "\nColour: " + AbuPen.colour + "\nSize: " + AbuPen.size + "\nType: " + AbuPen.type);	

	}

}
