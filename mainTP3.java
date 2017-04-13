
/**
 * El DFS recursivo para 10.000.000 de vertices excede la memoria.
 * 
 * @author Fernanda M. Gonzalez
 */
public class mainTP3 {

	public static void main(String[] args) {
		
		int cantVertices = 1000000;
		GrafoD g = new GrafoD(cantVertices);
		Recorridos r = new Recorridos(g);
		
		long time_start;
		long time_end;
		
		for (int v=0; v < cantVertices; v++){
			int d = (int) (Math.random()*cantVertices);
			g.insertarArista(v, d);
		}
		
		//System.out.println("El grafo tiene " + g.numVertices() + " vertices y " + g.numAristas() + " aristas.");
		
		//g.mostrar();
		
		time_start = System.nanoTime();
		r.DFSforest(g);
		time_end = System.nanoTime();
		System.out.println("\nEl recorrido DFS recursivo para " + cantVertices + " tardo " + (time_end - time_start)/1000000.0 + " milisegundos.\n");
		//r.mostrarMarcado();
		//r.mostrarPasado();
		System.out.println("hay ciclo?: " + r.hayCiclo());
		
		time_start = System.nanoTime();
		r.DFSiterativo(g, 0);
		time_end = System.nanoTime();
		System.out.println("\nEl recorrido DFS iterativo para " + cantVertices + " tardo " + (time_end - time_start)/1000000.0 + " milisegundos.\n");
		System.out.println("hay ciclo?: " + r.hayCiclo());

	}

}
