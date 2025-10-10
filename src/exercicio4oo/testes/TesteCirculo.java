package exercicio4oo.testes;

import exercicio4oo.classes.Circulo;

class TesteCirculo {
    public static void main(String[] args) {
        Circulo roda = new Circulo();

        roda.setRaio(40);
        System.out.printf("Raio do circulo é: %f/n", roda.getRaio());
    }
}
