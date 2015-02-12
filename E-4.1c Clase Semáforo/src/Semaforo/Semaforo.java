/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforo;

import java.awt.Color;

/**
 *
 * @author Manuel Cañamaque
 */
public class Semaforo {
    private Color color=Color.GREEN;    
    private boolean parpadeando=false;

    public Semaforo() {
        
    }

    private void setColor(Color color) {
        this.color = color;
        
    }

    private void setParpadeando(boolean parpadeando) {
        this.parpadeando = parpadeando;
    }

    public Color getColor() {
        return color;
    }
   

    public boolean isParpadeando() {
        return parpadeando;
    }
    
    public void subir() {
        this.getColor();
        if(color==Color.GREEN){
           setColor(Color.ORANGE);
           setParpadeando(true);
           
        }else{
            if(color==Color.ORANGE){
                setColor(Color.RED);
                setParpadeando(false);
            }
        }
    }
    public void bajar() {
        this.getColor();
        if(color==Color.RED){
             setColor(Color.ORANGE);
             setParpadeando(true);
        }else{
            if(color==Color.ORANGE){
            setColor(Color.GREEN);
            setParpadeando(false);
            }
        }       
    }

    
    
    
    
    
}
