
public class Punto {
	
	private Integer coord_x,coord_y;
	
	public Punto (Integer x, Integer y ) {
		this.coord_x=x;
		this.coord_y=y;
	}
	
	public static double distancia (Punto p1 , Punto p2) {
		double d=Math.sqrt(Math.pow(p2.coord_x-p1.coord_x, 2)+Math.pow(p2.coord_y-p1.coord_y, 2));
		return d;
	}

	public Integer getCoord_x() {
		return coord_x;
	}

	public void setCoord_x(Integer coord_x) {
		this.coord_x = coord_x;
	}

	public Integer getCoord_y() {
		return coord_y;
	}

	public void setCoord_y(Integer coord_y) {
		this.coord_y = coord_y;
	}

	@Override
	public String toString() {
		return " (" + coord_x + "," + coord_y + " )";
	}
	
	
	

}
