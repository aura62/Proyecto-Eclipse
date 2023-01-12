
public class Rectangulo {
	private Punto v1,v2,v3,v4; //agrego un comentario para que tenga algun cambio con el primer commit
	
	public Rectangulo (Punto p, Integer b, Integer a){
		this.v1=p;
		this.v2= new Punto (v1.getCoord_x()+b, v1.getCoord_y());
		this.v3= new Punto (v2.getCoord_x(), v2.getCoord_y()+a);
		this.v4= new Punto (v1.getCoord_x(), v3.getCoord_y());
	
	}
	
	public String toString () {
		return v1.toString()+" "+v2.toString()+" "+v3.toString()+" "+v4.toString();
	}
	
	public Integer area() {
		return (int)(Punto.distancia(v2, v1)*(Punto.distancia(v4, v1)));
	}

}
