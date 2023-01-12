
public class Main {

	public static void main(String[] args) {
		Punto p1 = new Punto (1,1);
		Rectangulo r = new Rectangulo (p1,3,5);
		System.out.println(r);
		System.out.println(r.area());
		System.out.println("Se añade otra linea");
	}

}
