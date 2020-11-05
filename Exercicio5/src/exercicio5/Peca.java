/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author Joao
 */
public class Peca {
    private String nome;
    private int x,y; //Indica a posição da peça no tabuleiro
    private boolean capturada; //Indica se a peça foi capturada ou não

    public Peca(int x, int y, boolean capturada) {
        this.x = x;
        this.y = y;
        this.capturada = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isCapturada() {
        return capturada;
    }

    public void setCapturada(boolean capturada) {
        this.capturada = capturada;
    }



}