package box;

public class box_test {

	public static void main(String[] args) {
		
		Box box1 = new Box(20, 50, 30 );
		
		System.out.println("BOX");
		System.out.println("Height: " + box1.getHeight()
		+"\nWidth: " + box1.getWidth() + "\nDepth: " + box1.getDepht() );
		
		Box_Color box2 = new Box_Color(45, 50, 60, "Pink");
		
		System.out.println("\nBOX COLOR");
		
		System.out.println("Height: " + box2.getHeight()
		+"\nWidth: " + box2.getWidth() + "\nDepth: " + box2.getDepht() 
		+ "\nColor: " + box2.getColor());
		
		
		box2.setColor("Blue");
		
		System.out.println("\n Modified Box Color");
		
		System.out.println("Height: " + box2.getHeight()
		+"\nWidth: " + box2.getWidth() + "\nDepth: " + box2.getDepht() 
		+ "\nColor: " + box2.getColor());
		
		box1.volume();
		box2.volume();
			
		
		

	}

}
