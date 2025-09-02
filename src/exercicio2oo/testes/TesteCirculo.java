package exercicio2oo.testes;

import exercicio2oo.classes.Circulo;

class TesteCirculo {
    public static void main(String[] args) {
        Circulo roda = new Circulo();

        roda.raio = 40;
        System.out.println("Raio do circulo é: " + roda.raio);
    }
}
