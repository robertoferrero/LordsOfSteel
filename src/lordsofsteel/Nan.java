/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author rferrero
 */
public class Nan extends Personatge {
    
    public Nan(String nom,int forca, int constitucio, int velocitat,
               int intelligencia, int sort, Arma arma) {

        super(nom,forca,constitucio,velocitat,intelligencia,sort,arma);
    }

    @Override
    protected void calculaEstadistiquesSecundaries() {
        super.calculaEstadistiquesSecundaries();
        pd = (forca + arma.getWpow() + constitucio)/4;
    }    
        

}
