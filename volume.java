import java.util.Scanner;

public class volume {
	public static void main(String args[]) {
System.out.println("Shape (rectangularprism / cube / sphere)");
Scanner input = new Scanner(System.in);
String shape = input.next();

if (shape.equals("rectangularprism")) {
	System.out.println("length = ");
	 Double l = input.nextDouble();
	 System.out.println("height = ");
	 Double w = input.nextDouble();
	 System.out.println("width = ");
	 Double h = input.nextDouble();
	 Double volume = l * w * h;
	 System.out.println("Volume = " + volume);
} if (shape.equals("cube")) {
	System.out.println("side = ");
	Double s = input.nextDouble();
	Double volume = Math.pow(s, 3);
	System.out.println("Volume = " + volume);
} if (shape.equals("sphere")) {
	System.out.println("diameter = ");
	Double d = input.nextDouble();
	Double volume = (Math.PI * Math.pow(d, 3))/6;
	System.out.println("Volume = " + volume);
}
}
}
