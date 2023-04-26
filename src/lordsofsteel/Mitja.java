/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author rferrero
 */
public class Mitja extends Personatge {
    
    public Mitja(double forca, double constitucio, double velocitat,
                   double intelligencia, double sort) {

        super(forca,constitucio,velocitat,intelligencia,sort);
    }
    

    protected void calculaEstadistiquesSecundaries() {
        super.calculaEstadistiquesSecundaries();
        pe = velocitat+ sort + intelligencia + forca;
    }    

}
