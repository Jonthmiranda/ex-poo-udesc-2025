package exercicio4oo.testes;

import exercicio4oo.classes.Circulo;

class TesteCirculo {
    public static void main(String[] args) {
        Circulo roda = new Circulo();

        roda.setRaio(40);
        System.out.printf("O raio do circulo é: %.2f\n", roda.getRaio());
        System.out.printf("O diametro do circulo é: %.2f\n", roda.diametro());
        System.out.printf("O perimetro do circulo é: %.2f\n", roda.perimetro());
        System.out.printf("A area do circulo é: %.2f", roda.area());
    }
}
