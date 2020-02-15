/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.ArrayList;

/**
 *
 * @author estudiantelis
 */
public class Reto2 {
public int noficionas=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
       
    }

    private static int numOffices(int[][] edificio) {
        ArrayList<ArrayList> aux = new ArrayList<ArrayList>();
        ArrayList<Integer> aux2;
        int bandIArriba;
        int bandIAbajo;
        int bandJDerecha;
        int bandJIzquierda;
        for (int i = 0; i < edificio.length; i++) {
            for (int j = 0; i < edificio[i].length; i++) {
                if(edificio[i][j]==1){
                    int x=i;
                    do{
                        x++;
                        bandIArriba=x;
                    }while (edificio[x][j]==0);
                    x=i;
                    do{
                        x--;
                        bandIAbajo=x;
                    }while (edificio[x][j]==0);
                    
                    aux2 = new ArrayList<Integer>();
                    aux2.add(i);
                    aux2.add(j);
                    aux.add(aux2);
                }
            }
        }
        return 0;       
    }
    
  
    
    
}
