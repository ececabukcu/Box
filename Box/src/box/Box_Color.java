package box;

public class Box_Color extends Box{

	private String Color;

	public Box_Color(int height, int width, int depht, String color) {
		super(height, width, depht);
		Color = color;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	
	public void volume() {
		
		super.volume();
	}
	
}
