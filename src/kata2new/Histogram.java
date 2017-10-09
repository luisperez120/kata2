/*
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


public class Histogram {
    
    private static final int [] data = {1,2,3,4,1,2,3,5,1,2};

    public Histogram() {
    }

    public int[] getData() {
        return data;
    }
    
    
    public static Map getHistogram(){
        Map <Integer, Integer> mapa = new HashMap <>();
         for (int i : data) {
            
            if(!mapa.containsKey(data[i])){
                mapa.put(data[i], 1);
            } else {
                mapa.put(data[i], mapa.get(data[i]) +1);
             }
        }
         return mapa;
    }
    
}
