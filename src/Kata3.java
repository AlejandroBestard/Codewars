//Link: https://www.codewars.com/kata/57e2dd0bec7d247e5600013a/train/java

/*
1. Empezar indice 0, si el numero es < 3 = new array
2. Si num > 3, agrupar 2 siguientes nums en subarray????
 */
public class Kata3 {
    public static int[] sortByValueAndIndex(int[] array) {
        int[] productos = new int[array.length];
        for (int i = 0; i < array.length; i++){
            productos[i]=array[i] * (i+1);
        }
        for (int i=0; i<array.length -1; i++){
            for (int j=0; j<array.length -1 -i; j++){
                if (productos[j] > productos[j+1]){
                    
                }

            }
        }




    }
}
