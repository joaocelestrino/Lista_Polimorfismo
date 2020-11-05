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
public class Retangulo extends Forma {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String getNome() {
        return "Retângulo";
    }

    @Override
    public double getArea() {
        area = base * altura;
        return area;
    }

    @Override
    public double getPerimetro() {
        perimetro = ((2 * base) + (2 * altura));
        return perimetro;
    }
}