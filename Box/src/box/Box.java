package box;

public class Box {
	//field
	private int height;
	private int width;
	private int depht;
	
	//constr
	public Box(int height, int width, int depht) {
		super();
		this.height = height;
		this.width = width;
		this.depht = depht;
	}
	 
	  //method
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepht() {
		return depht;
	}

	public void setDepht(int depht) {
		this.depht = depht;
	}

   public void volume(){
	   
	   System.out.println("Volume is " +(width * height * depht));
	   
   }
	
	
}
