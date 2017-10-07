/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2new;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Luis Pérez
 */
public class Kata2new {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
         Map <Integer, Integer> mapa = new HashMap <>();
         int [] data = {1,2,3,4,1,2,3,5,1,2};
         
         for (int i = 0; data.length > i; i++) {
            if(!mapa.containsKey(data[i])){
                mapa.put(data[i], 1);
            } else {
                mapa.put(data[i], mapa.get(data[i]) +1);
             }
            
        }
             for (int value : mapa.keySet()) {
                 
             
             System.out.println( "El numero " + value + " se repite " +
                     mapa.get(value) + " veces");
             }
         
        
        // TODO code application logic here
    }
    
}
