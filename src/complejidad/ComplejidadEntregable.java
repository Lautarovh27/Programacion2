package complejidad;

public class ComplejidadEntregable {
	
	private static boolean esta(int[] arr) {
		for(int i=0; i<arr.length; i++) {			// 1 + 2(n+1) + 2n
			for(int j=i+1; j<arr.length; j++) {		// n(n-1)*1/2
					if(arr[i]==arr[j])				// 3n(n-1)*1/2)
						return true;				// No suma al peor caso
			}
		}
		return false;								// 1
	}
		// f(n) = 
	
	
	public static int filaSinRepetidos(int[][]mat) {
		boolean sin; int cuantas = 0;					// 2
		for(int f = 0; f < mat.length; f++) {			// 1+(2n+1)+2n
			sin = false;								// n(1)
			for(int c = 0; c < mat[0].length; c++) {	// n(1+(2n+1)+2n
				sin = sin || !esta(mat[f]);				// n(n(3 + (7n**2+8n+4))
			}
			if (sin) {									// 1
				return cuantas++;						// 3
			}
		}
		return cuantas;									// 1
	}
		// f(n) = 
	public static void main(String[] args) {
		int[]arr = {1,2,4,3,2};
		System.out.println("Hay repetidos: " + esta(arr));
		System.out.println("Hay repetidos: " + esta1(arr));
		}
}
