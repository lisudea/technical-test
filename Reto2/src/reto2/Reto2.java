/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reto2;

/**
 *
 * @author estudiantelis
 */
public class Reto2 {

    /**
     * @param args the command line arguments
     */

     static int[][] cowork;
     static int m,n;
    public static void main(String[] args) {
       m = 4;
       n=5;
       cowork = new int[m][n];
       
       cowork[0][0] = 1;
       cowork[0][1] = 1;
       cowork[0][2] = 0;
       cowork[0][3] = 0;
       cowork[0][4] = 0;
       cowork[1][0] = 1;
       cowork[1][1] = 1;
       cowork[1][2] = 0;
       cowork[1][3] = 0;
       cowork[1][4] = 0;
       cowork[2][0] = 0;
       cowork[2][1] = 0;
       cowork[2][2] = 1;
       cowork[2][3] = 0;
       cowork[2][4] = 0;
       cowork[3][0] = 0;
       cowork[3][1] = 0;
       cowork[3][2] = 0;
       cowork[3][3] = 1;
       cowork[3][4] = 1;

       int result = numOffices(cowork);

       System.out.println("El numero de oficinas es: " + result);
       System.out.println("Perdón por el Java jeje, picos.");

    }

static int numOffices(int[][] building){
        int officeAccount = 0;

        for (int i = 0; i < building.length; i++){
            for (int j = 0; j< building[0].length;){
                if(building[i][j] == 0 || building[i][j] == 2){
                    j++;
                } else {
                    officeAccount++;
                    boolean searchHorizontal = false;
                    boolean searchVertical = false;
                    searchOnes(i, j, searchHorizontal, searchVertical, building);
                    j++;
                }    
            }
          
        }
           return officeAccount;
}

static void searchOnes(int x, int y, boolean searchH, boolean searchV, int[][] building){
    if(searchV == false){
    int x2 = x+1;
        if (x2 < building.length && isOne(x2,y, building)){
            building[x2][y] = 2;
            searchOnes(x2,y,searchH, searchV, building);
        } else {
            searchV = true;
        }
    }
    
    if(searchH == false){
    int y2= y+1;
        if(y2 < building[0].length && isOne(x,y2,building)){
            building[x][y2] = 2;
            searchOnes(x,y2,searchH, searchV, building);
        } else {
            searchH = true;
        }
    }

}

static boolean isOne(int x, int y, int[][] building){
    if (building[x][y] == 1) return true;
    else return false;
}

}
