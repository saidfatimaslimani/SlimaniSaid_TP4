/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbitrage_final;
import static java.lang.Math.log;
import java.math.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Slimani
 */
import java.util.ArrayList;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob Garbarek (ID: 17980551) & Angelo Ryndon (ID: 18028033)
 */
public class ArbitrageFinder {
    public static void main(String[] args){
        
          System.out.println("*********** Recherche Opérationnelle Fiche TP n°4 ************");
          System.out.println("*************** Par SLIMANI FATIMA && SAID FATMA ************* ");
       System.out.println("********************* Le problème d’arbitrage *******************\n");
        System.out.println("***La matrice ci-dessus peut être représentée par un graphe où les devises correspondent \n aux sommets du graphe et où les taux de change correspond au poids des arcs qui vont\n  relier les sommets des graphes\n");
       
        String[] currencies = new String[]{"USD","EUR","GBM","CHF","CAD"};      
        double[][] exchangeRates = new double[][]{
            {1.0000, 0.7410, 0.6570, 1.0610, 1.005 },
            {1.3490, 1.0000, 0.8880, 1.4330, 1.3660 },
            {1.5210, 1.1260, 1.0000, 1.6140, 1.5380 },
            {0.9420, 0.6980, 0.6190, 1.0000, 0.9530 },
            {0.9950, 0.732, 0.6500, 1.6140, 1.0000 }
        };
        System.out.println("       \"USD\"   \"EUR\"   \"GBM\"    \"CHF\"   \"CAD\"");
         System.out.print("\"USD\"");
         for(int j=0;j<5;j++)  
             System.out.print("  "+exchangeRates[0][j]+"  ");
          System.out.println("");
          
         System.out.print("\"EUR\"");
         for(int j=0;j<5;j++)  
             System.out.print("  "+exchangeRates[1][j]+"  ");
          System.out.println("");
          
         System.out.print("\"GBM\"");
         for(int j=0;j<5;j++)  
             System.out.print("  "+exchangeRates[2][j]+"  ");
          System.out.println("");
          
         System.out.print("\"GHF\"");
         for(int j=0;j<5;j++)  
             System.out.print("  "+exchangeRates[3][j]+"  ");
          System.out.println("");
          
         System.out.print("\"CAD\"");
         for(int j=0;j<5;j++)  
             System.out.print("  "+exchangeRates[4][j]+"  ");
          System.out.println("");
          
        
      
        
        CurrencyGraph<String> graph = new CurrencyGraph<String>(currencies, exchangeRates);
        
        System.out.println("\n *** l’ensemble des Arcs entre les sommets ainsi que le poids de chacun d’entre eux:");
        System.out.println("                  *****(Graph)*****");
        System.out.println(graph);
        
     
        
        ArrayList<String> arbitragePaths = graph.getArbitrage();
        
        if(arbitragePaths != null){
            System.out.println("***les sommets qui forment les opportunités d’arbitrage sont : ");
            System.out.println("");
            for (String path : arbitragePaths) {
                System.out.println(path);
            }
        }else
            System.out.println("  ***!Aucun sommet forment les opportunités d’arbitrage.***");
        
      
       System.out.println(); System.out.println();  
    }
    
}

