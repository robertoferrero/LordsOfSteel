/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author rferrero
 */
public class Arma {
    
    protected String tipus;
    protected int wpow;
    protected int wvel;
        
    public Arma(String tipus,int wpow,int wvel) {
        this.tipus = tipus;
        this.wpow  = wpow;
        this.wvel  = wvel;
    }
}
