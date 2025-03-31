package acumuladores;

public class Acumuladores {

	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int numExisteFilaDeMultiplos) {
		if ( estaVacia(mat) || numExisteFilaDeMultiplos <= 0 ) {
			return false;
		}
		boolean algunaFilaTodosMultiplos = false;
		for(int f = 0; f < mat.length; f++) {
			boolean todosMultiplo = true;
			for(int c = 0; c < mat[0].length; c++) {
				todosMultiplo = todosMultiplo && multiplo(mat[f][c], numExisteFilaDeMultiplos);
			}
			algunaFilaTodosMultiplos = algunaFilaTodosMultiplos || todosMultiplo;  
		}
		return algunaFilaTodosMultiplos ;
	}

	private boolean multiplo(int i, int numExisteFilaDeMultiplos) {
		if ( i % numExisteFilaDeMultiplos == 0)
			return true;
		return false;
	}
	
	private boolean estaVacia(int[][] mat) {
		if(mat == null || mat.length == 0)
			return true;
		return false;
	}


	public boolean hayInterseccionPorFila(int[][] mat, int[][] mat2) {
		if(estaVacia(mat) || estaVacia(mat2) || mat.length != mat2.length) {
			return false;
		}
		boolean todasFilasInterseccionan = true;
		for(int f = 0; f < mat.length; f++) {
			boolean algunNumeroIgual = false;
			for(int c = 0; c < mat[0].length; c++) {
				for(int c2 = 0; c2 < mat2[0].length; c2++) {
					algunNumeroIgual = algunNumeroIgual || mat[f][c] == mat2[f][c2];
				}
			}
			todasFilasInterseccionan = todasFilasInterseccionan && algunNumeroIgual ;
		}
		return todasFilasInterseccionan;
	}

	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int columnaSumaMenosQueAlgunaFila) {
		if(estaVacia(mat) || columnaSumaMenosQueAlgunaFila < 0 ||columnaSumaMenosQueAlgunaFila >= mat[0].length)
			return false;
		int sumaTotalCol = 0;
		boolean algunaFilaMayor = false;
		for(int f = 0; f < mat.length; f++) {
				sumaTotalCol = sumaTotalCol + mat[f][columnaSumaMenosQueAlgunaFila];
			}
		
		for(int f = 0; f < mat.length; f++) {
			int sumaTotalFila = 0;
			for(int c = 0; c < mat[0].length; c++) {
				sumaTotalFila = sumaTotalFila + mat[f][c];
			}
			algunaFilaMayor = algunaFilaMayor || sumaTotalFila > sumaTotalCol;
		}
		return algunaFilaMayor;
	}

	
	public boolean hayInterseccionPorColumna(int[][] mat1, int[][]mat2) {
		if(estaVacia(mat1) || estaVacia(mat2) || mat1[0].length != mat2[0].length) {
			return false;
		}
		boolean todasColumnasInterseccionan = true;
		for(int c = 0; c < mat1[0].length; c ++) {
			boolean algunElementoIgual = false;
			for(int f = 0; f < mat1.length; f++) {
				for(int f2 = 0; f2 < mat2.length; f2++) {
					algunElementoIgual = algunElementoIgual || mat1[f][c] == mat2[f2][c];
				}
			}
			todasColumnasInterseccionan = todasColumnasInterseccionan && algunElementoIgual;
		}
		return todasColumnasInterseccionan;
	}
}
