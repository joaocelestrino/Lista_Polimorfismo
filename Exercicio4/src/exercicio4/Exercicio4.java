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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Quadrado q = new Quadrado();
        System.out.println(q.getNome());
        q.setLado(2.2);
        System.out.println("Lado: " + q.getLado());
        System.out.println("Área: " + q.getArea());
        System.out.println("Perímetro " + q.getPerimetro());

        System.out.println("---------------");

        Retangulo r = new Retangulo();
        System.out.println(r.getNome());
        r.setAltura(1.4);
        r.setBase(4);
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Base: " + r.getBase());
        System.out.println("Área: " + r.getArea());
        System.out.println("Perímetro " + r.getPerimetro());
        System.out.println("---------------");

        Triangulo t = new Triangulo();
        System.out.println(t.getNome());
        t.setLado(5);
        System.out.println("Lado: " + t.getLado());
        System.out.println("Área: " + t.getArea());
        System.out.println("Perímetro: " + t.getPerimetro());
        System.out.println("---------------");

        Circulo c = new Circulo();
        System.out.println(c.getNome());
        c.setRaio(6);
        System.out.println("Raio: " + c.getRaio());
        System.out.println("Área: " + c.getArea());
        System.out.println("Perímetro: " + c.getPerimetro());
        System.out.println("---------------");
        System.out.println("FIM DO PROGRAMA");

    }

}