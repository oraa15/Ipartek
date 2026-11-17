void main() {
	int tamanyo = 3;

	String[] arr = new String[tamanyo];

	arr[0] = "UNO";
	arr[1] = "DOS";
	arr[2] = "TRES";
//	arr[3] = "CUATRO";

	IO.println(Arrays.toString(arr));

	for (int i = 0; i < arr.length; i++) {
		IO.println(arr[i]);
	}

	for (String dato : arr) {
		IO.println(dato);
	}

	char[][] tablero = new char[8][8];

	tablero[0][0] = 't';
	tablero[0][1] = 'c';
	tablero[1][0] = 'p';
	tablero[7][7] = 'T';

	for (int fila = 0; fila < tablero.length; fila++) {
		for (int columna = 0; columna < tablero[fila].length; columna++) {
			char pieza = tablero[fila][columna];

			IO.print(pieza == '\0' ? '.' : pieza);
			IO.print(' ');
		}

		IO.println();
	}

	for (char[] fila : tablero) {
		for (char pieza : fila) {
			IO.print(pieza == '\0' ? '.' : pieza);
			IO.print(' ');
		}

		IO.println();
	}
}