/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lordsofsteel;

import java.util.ArrayList;

/**
 *
 * @author rferrero
 */
public class LordsOfSteel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Personatge normal: pd = (8+5)/4 = 3
        // Nan: pd = (8+6+5)/4 = 4
        // Nan: ps = (8+6) = 14
        //System.out.println("Punts de dany de n1: " + n1.getPd());
        //System.out.println("Punts de salut de n1: " + n1.getPs());
        
        //Arma arma = new Arma("Daga");
        Nan n1 = new Nan(8,6, 13,16,16,new Arma("Daga"));        
        Huma h1 = new Huma(13,16,6,10,6,new Arma("Espasa"));
        Mitja mi1 = new Mitja(9,7,7,15,16,new Arma("Martell"));
        Maia ma1 = new Maia(7,9, 12,15,17,new Arma("Daga"));
        
        /*Personatge[] personatges = new Personatge[4];
        personatges[0] = n1;
        personatges[1] = h1;*/
        ArrayList<Personatge> personatges = new ArrayList<Personatge>();
        personatges.add(n1);
        personatges.add(h1);
        personatges.add(mi1);
        personatges.add(ma1);
        
    }
    
}
