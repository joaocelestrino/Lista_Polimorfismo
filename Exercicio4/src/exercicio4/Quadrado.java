/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author Joao
 */
public class Quadrado extends Forma {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String getNome() {
        return "Quadrado";
    }

    @Override
    public double getArea() {
        area = lado * lado;
        return area;
    }

    @Override
    public double getPerimetro() {
        perimetro = 4 * lado;
        return perimetro;
    }
}