package acumuladores;

public class Practica0 {
	public static void main(String[] args) {
		int[]lista = {1,5,7,89,4};
		int[]lista1 = {11,55,17,89,};
		int[]lista2 = {10,55,170,10,5};
		int[]lista3 = {1,5};
		int[][]mat = {
				{9,3,6},
				{2,18,14},
				{4,1,15}
		};
//		System.out.println(mayor10(lista));
//		System.out.println(mayor10(lista1));
//		System.out.println(multiplo5AlgunoMayor100(lista2));
		System.out.println(pertenecenTodos(lista3,lista));
		mostrarPorFilas(mat);
		System.out.println();
		mostrarPorColumnas(mat);
		System.out.println(sumarElementos(mat));
	}
	
	static boolean mayor10(int[] lista) {
		boolean todosMayorA10 = true;
		for(int i = 0; i < lista.length; i++) {
			todosMayorA10 &= lista[i] > 10; 
		}
		return todosMayorA10;
	}
	
	static boolean multiplo5AlgunoMayor100(int[] lista) {
		boolean multiplo5 = true;
		boolean algunoMayor100 = false;
		for(int i = 0; i< lista.length;i++) {
			multiplo5  = multiplo5 && (lista[i] %5 == 0);
			algunoMayor100 = algunoMayor100 || (lista[i] > 100);
		}
		return multiplo5 && algunoMayor100;
	}
	
	public static boolean pertenecenTodos(int[] elems, int[] arreglo) {
		boolean pertenecen = true;
		for(int i = 0; i<elems.length;i++) {
			boolean existe = false;
			for(int j = 0; j < arreglo.length; j++) {
				existe = existe || elems[i] == arreglo[j];
			}
			pertenecen = pertenecen && existe;	
		}
		return pertenecen;
	}
	
	public static void mostrarPorFilas(int[][]mat) {
		
		for(int f = 0; f < mat.length;f++) {
			for(int c = 0; c < mat[0].length; c++) {
				System.out.print(mat[f][c] + " ");
			}
			System.out.println();
		}
	}
	
	public static void mostrarPorColumnas(int[][]mat) {
		for(int c = 0; c < mat[0].length; c++) {
			for(int f = 0; f < mat.length; f++) {
				System.out.print(mat[f][c] + " ");
			}
			System.out.println();
		}
	}
	
	public static int sumarElementos(int[][]mat) {
		int suma = 0;
		for(int f = 0; f < mat.length; f++) {
			for(int c = 0; c < mat[0].length; c++) {
				suma = suma + mat[f][c];
			}
		}
		return suma;
	}
	
	public static boolean parImpar(int[]arr) {
		boolean todosSonParImpar = true;
		for(int i = 0; i < arr.length; i++) {
			todosSonParImpar = todosSonParImpar && (i%2 != arr[i]%2); 
		}
		return todosSonParImpar;
	}
	
//	public static int[] sumarFilas(int[][]mat) {
//		int[]nuevo;
//		
//	}

}
