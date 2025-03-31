package acumuladores;

public class AcumuladoresEjerciciosExtra {

	public static void main(String[] args) {
		int[][] mat = {
				{2,3,4,5,7},
				{5,7,7,7,9},
				{2,3,9,9,2}
		};
		
		System.out.println("matriz con X");
		imprimirCambiandoPares(mat);
		System.out.println("");
		System.out.println("");
		System.out.println(cadaFilaContieneAlgunPar(mat));
	}
	
	/**
	 * Imprimir una matriz cambiando los numeros
	 * pares por X. 
	 * Recorrer por filas.
	 */
	public static void imprimirCambiandoPares(int[][] mat) {
		if(estaVacia(mat)) {
		}
		else {
			
		}
		throw new RuntimeException("Implementame!!!");
	}
	
	private static boolean estaVacia(int[][] mat) {
		if(mat == null || mat.length == 0) {
		return false;
		} else {
			return true;
				
		}
				
	}

	/**
	 * Verificar que [cada (fila contiene al 
	 * menos algun elemento par)].
	 * 
	 */
	public static boolean cadaFilaContieneAlgunPar(int[][] mat) {
		throw new RuntimeException("Implementame!!!");
	}

    /**
     * Verificar si cada fila contiene al menos un elemento par,
     * utilizando un método auxiliares.
     */
	public static boolean cadaFilaContieneAlgunParModular(int[][] mat) {
		throw new RuntimeException("Implementame!!!");
	}

}
