
/**
 * @author Fernanda M. Gonzalez
 *
 */

import java.util.ArrayList;

public abstract class Grafo {

	public Grafo() { 
		
	}
	
	public abstract int numVertices();
	public abstract int numAristas();
	public abstract boolean existeArista(int i, int j);
	public abstract void insertarArista(int i, int j);
	public abstract void insertarArista(int i, int j, double p);
	public abstract ArrayList<Adyacente> adyacentesDe(int i);
	public abstract double pesoArista(int i, int j);
	
	/**@Override
	public String toString(){
		String res = "" ;
		for (int i = 1 ; i <= numVertices() ; i++) {
			res += "Vértice: " + i;
			ArrayList<Adyacente> l = adyacentesDe(i);
			res += (l.isEmpty()) ? " sin Adyacentes " : " con Adyacentes: ";
			for (l.inicio(); !l.esFin() ; l.siguiente()) res += l.recuperar() + " ";
				res += "\n";
		} 
		return res;
	}**/
	
	
	
}
