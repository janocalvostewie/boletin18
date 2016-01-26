
package boletin18_1;
/**
 *
 * @author Jano
 */
public class Boletin18_1 {
    public static void main(String[] args) {
        
        //Creación del array
        int [] numeros;
        numeros=new int[6];
        
        //Rellenamos el array con números aleatorios
        for (int i = 0; i < numeros.length; i++){
            numeros[i]=(int)(Math.random()*50+1);
            System.out.println(numeros[i]);
        }
        //Imprimimos el array al revés
        for(int x= numeros.length-1; x>=0; x--){
            System.out.println(numeros[x]);
        }
        
        
    }
    
}
