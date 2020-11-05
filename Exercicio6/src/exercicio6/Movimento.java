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
public class Movimento {

    public int fromX, fromY, toX, toY; //posições iniciais "from" e finais "to" após a jogada ser executada.

    public Movimento(int fromX, int fromY, int toX, int toY) {
        this.fromX = fromX;
        this.fromY = fromY;
        this.toX = toX;
        this.toY = toY;
    }
}