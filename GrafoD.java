
/**
 * @author Fernanda M. Gonzalez
 */

import java.util.ArrayList;

public class GrafoD extends Grafo{

	protected int numV, numA;
	protected ArrayList<Adyacente> elArray[];
	
	@SuppressWarnings("unchecked")
	public GrafoD(int numVertices){
		numV = numVertices; 
		numA=0;
		elArray = new ArrayList[numVertices+1];
		for (int i=0; i<=numV; i++){
			elArray[i]= new ArrayList<Adyacente>();
		}
	}
	
	/**
	 * 
	 */
	public int numVertices() { 
		return numV;
	}
	
	/**
	 * 
	 */
	public int numAristas() { 
		return numA; 
	}
	
	/**
	 * 
	 */
	public boolean existeArista(int i, int j) {
		ArrayList<Adyacente> l = elArray[i];
		for (Adyacente ady : l){
			if (ady.getDestino() == j) { 
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 */
	public void insertarArista(int i, int j) {
		insertarArista(i,j,1);
	}
	
	/**
	 * 
	 */
	public void insertarArista(int i, int j, double p) {
		if ( !existeArista(i,j) ) {
			//elArray[i].add(0, new Adyacente(j,p));
			elArray[i].add(new Adyacente(j,p)) ;
			numA++; 
		}
	}
	
	/**
	 * 
	 */
	public ArrayList<Adyacente> adyacentesDe(int i) {
		return elArray[i];
	}
	
	/**
	 * 
	 */
	public double pesoArista(int i, int j) {
		ArrayList<Adyacente> l = elArray[i];
		for (Adyacente ady : l){
			if (ady.getDestino() == j) {
				return l.get(j).getPeso();
			}
		}
		return 0.0;
	}

	public void mostrar(){
		ArrayList<Adyacente> aux[] = this.elArray;
		for (int i=0; i<this.numVertices(); i++){
			
			ArrayList<Adyacente> ady = this.adyacentesDe(i);
			if (!aux[i].isEmpty()){
				System.out.println("El vertice " + i + " tiene como adyacentes a: ");
				for (Adyacente a : ady){
					System.out.println(a.getDestino());
				}
			}
			else{
				System.out.println("El vertice " + i + " no tiene adyacentes\n");
			}
				
		}
	}
	
}  /* Fin de la clase GrafoD */
