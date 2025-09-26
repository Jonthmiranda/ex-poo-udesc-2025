package exercicio3oo.testes;

import exercicio3oo.classes.Carro;

class TesteCarro {
    public static void main(String[] args) {
        Carro Celta = new Carro();

        Celta.setMarca("Chevrolet");
        Celta.setModelo("Celta");
        Celta.setAno(2012);
        Celta.setVelocidade(100);

        System.out.printf("marca: %s/n", Celta.getMarca);
        System.out.printf("modelo: %s/n", Celta.getModelo);
        System.out.printf("ano: %d/n", Celta.getAno);
        System.out.printf("velocidade: %f/n", Celta.getVelocidade);
    }
}
