/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author Joao
 */
public class Cavalo extends Peca {
    
    public Cavalo(int x, int y, boolean capturada) {
        super(x, y, capturada);
        
    }
    
    @Override
    public String getNome(){
        return "Cavalo";
    }
    
    @Override 
     public void setY(int y) {
        this.y = y;
    }
     
     @Override
     public void setX(int x) {
         this.x = x;
     }
     
}