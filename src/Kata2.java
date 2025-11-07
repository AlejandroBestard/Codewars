//Link: https://www.codewars.com/kata/57c7231c484cf9e6ac000090/train/java


public class Kata2 {
    public static int[] addingShifted(int[][] arrayOfArrays, int shift) {
        int distancia = arrayOfArrays[0].length + (arrayOfArrays.length -1) * shift;
        int[] resultado = new int[distancia];

        for (int i=0; i<arrayOfArrays.length; i++){ // recorre l'array
            for (int j = 0; j<arrayOfArrays[i].length; j++){ // recorre els elements
                int posicion = j + (i * shift); //aplicar despacament
                resultado[posicion] += arrayOfArrays[i][j]; //sumar posicions
            }
        }
        return resultado;
    }
}
