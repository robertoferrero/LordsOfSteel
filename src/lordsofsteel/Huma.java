/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author rferrero
 */
public class Huma extends Personatge {
    
    public Huma(int forca, int constitucio, int velocitat,
                int intelligencia, int sort, Arma arma) {

        super(forca,constitucio,velocitat,intelligencia,sort,arma);
        
    }

    @Override
    protected void calculaEstadistiquesSecundaries() {
        super.calculaEstadistiquesSecundaries();
        ps = constitucio + forca + intelligencia;
    }
            
}
