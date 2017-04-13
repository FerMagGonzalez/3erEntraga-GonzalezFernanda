import java.util.Stack;


/**
 * @author Fernanda M. Gonzalez
 */
public class Recorridos {
	
	private boolean visitado[];
	private boolean pasado[];
    private boolean hayCiclo;
    private Stack<Integer> pila;

	/**
	 * @param g
	 */
	public Recorridos(Grafo g) {
		visitado = new boolean[g.numVertices()];
		pasado = new boolean[g.numVertices()];
		pila = new Stack<Integer>();
	}
	
	/**
	 * 
	 * @param g
	 */
	public void DFSforest(Grafo g){
		for (int u=0; u<g.numVertices(); u++){
			visitado[u] = false;
		}
		for (int u=0; u<g.numVertices(); u++){
			if (!visitado[u]){
				DFS(g,u);
			}
		}
	}
	
	/**
	 * 
	 * @param g
	 * @param u
	 */
	private void DFS(Grafo g, int u) {
		visitado[u] = true;
		pasado[u] = true;
		for (Adyacente v : g.adyacentesDe(u)){
			if (visitado[v.getDestino()] == false){
				DFS(g,v.getDestino());
			}
			else if (pasado[v.getDestino()]){
				hayCiclo = true;
                return;
			}
		}
		pasado[u] = false;
	}
	
	/**
	 * Retorna el valor de la variable.
	 * @return hayCiclo
	 */
	public boolean hayCiclo() {
        return hayCiclo;
    }

	public void DFSiterativo(Grafo g, int s){
		for (int u=0; u<g.numVertices(); u++){
			visitado[u] = false;
		}
		pasado[s] = true;
		visitado[s]=true;
		pila.push(s);
		while (!pila.isEmpty()){
			s = pila.peek();
	        pila.pop();
	        if (!visitado[s])
	        {
	            visitado[s] = true;
	        }
	        for (Adyacente v : g.adyacentesDe(s)){
				if (!visitado[v.getDestino()]){
					pila.push(v.getDestino());
				}
				else if (pasado[v.getDestino()]){
					hayCiclo = true;
	                return;
				}
			}
		}
		pasado[s] = false;
	}
	
	/**
	public void mostrarMarcado(){
		for (int i=0; i<this.visitado.length; i++){
			System.out.println(i + " " + visitado[i]);
		}
	}
	
	public void mostrarPasado(){
		for (int i=0; i<this.pasado.length; i++){
			System.out.println(i + " " + pasado[i]);
		}
	}**/
	
}
