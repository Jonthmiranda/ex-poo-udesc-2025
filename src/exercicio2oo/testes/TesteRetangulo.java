package exercicio2oo.testes;

import exercicio2oo.classes.Retangulo;

class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo reto = new Retangulo();
        reto.altura = 40;
        reto.largura = 20;
        System.out.println("altura: " + reto.altura);
        System.out.println("largura: " + reto.largura);
    }
}
