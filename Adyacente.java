
/**
 * @author Fernanda M. Gonzalez
 *
 */
class Adyacente {

	private int destino;
	private double peso;
	
	/**
	 * 
	 * @param codAdy
	 */
	Adyacente(int codAdy){ 
		destino=codAdy; 
	}
	
	/**
	 * 
	 * @param codAdy
	 * @param p
	 */
	Adyacente(int codAdy, double p){ 
		destino=codAdy; 
		peso = p; 
	}
	
	/**
	 * @return the destino
	 */
	public int getDestino() {
		return destino;
	}


	/**
	 * @param destino the destino to set
	 */
	public void setDestino(int destino) {
		this.destino = destino;
	}


	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}


	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	/**
	 * 
	 */
	public String toString(){ 
		return destino + "("+ peso + ")"; 
	}

}
