package exercicio4oo.testes;

import exercicio4oo.classes.Retangulo;

class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo reto = new Retangulo();

        reto.setAltura(40);
        reto.setLargura (20);

        System.out.printf("altura: %f/n", reto.getAltura());
        System.out.printf("largura: %f/n", reto.getLargura());
    }
}
