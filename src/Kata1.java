import java.util.Arrays;
// Link: https://www.codewars.com/kata/541af676b589989aed0009e7
/*
   si monto == 0: tornar 1
   si monto < 0: tornar 0
   si monedas está vacío: tornar 0
   primera = monedas[0]
   resto = monedas sin la primera
   sinPrimera = contarCambio(monto, resto)
   conPrimera = contarCambio(monto - primera, monedas)
   tornar sinPrimera + conPrimera
        */
public class Kata1 {
    public static int countChange(final int money, final int[] coins) {
       /* NOT OPTIMIZED

       int n= coins.length;
        if (money== 0) return 1;
        if (money < 0) return 0;
        if (n==0) return 0;
        int primero = coins[0];
        int [] resto = Arrays.copyOfRange(coins,1,n);

        int senselaprimera = countChange(money,resto);
        int amblaprimera = countChange(money-primero,coins);
        return senselaprimera + amblaprimera;*/

        int [] formes = new int [money + 1];
        formes [0] = 1;
        for (int i=0; i < coins.length; i++) { //Recorre les monedes per index
            int moneda = coins[i];

            for (int quantitat = moneda; quantitat <= money; quantitat++) {
               formes[quantitat]=formes[quantitat] + formes[quantitat-moneda];
            }
        }
        return formes[money];
    }
}
