/**
 * version 2 online
 * @author matte
 *  programma per calcolare l'area e il perimetro di un quadrato dato 1 lato
 *
 */
public class Quadrato {
	
	private int lato;
	/**
	 * 
	 * @param lato
	 */
	public Quadrato(int l) {
		lato=l;
		
	}
	/**
	 * 
	 * @return area
	 */
	public int area() {
		
		return (lato*lato);
	}
	/**
	 * 
	 * @return perimetro
	 */
	public float Perimetro() {
		return (float)lato*4;
	}
	
	public static void main(String[] args) {
		Quadrato q1;
		q1=new Quadrato(4);
		System.out.println("Area Quadrato"+q1.area());
		System.out.println("Perimetro Quadrato = "+q1.Perimetro());

	}
	

}
