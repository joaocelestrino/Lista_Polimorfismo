/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;
import static java.lang.Math.sqrt;
/**
 *
 * @author Joao
 */
public class Triangulo extends Forma {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String getNome() {
        return "Triangulo";
    }

    @Override
    public double getArea() {
        area = ((lado * lado) * (sqrt(3)) / 4);
        return area;
    }

    @Override
    public double getPerimetro() {
        perimetro = 3 * lado;
        return perimetro;
    }

}