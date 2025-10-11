package exercicio4oo.testes;

import exercicio4oo.classes.Carro;

class TesteCarro {
    public static void main(String[] args) {
        Carro Celta = new Carro();

        Celta.setMarca("Chevrolet");
        Celta.setModelo("Celta");
        Celta.setAno(2012);
        Celta.setVelocidade(0);

        Celta.acelerar();
        Celta.acelerar();
        Celta.velocidadeAtual();
        Celta.freiar();
        Celta.velocidadeAtual();
        Celta.freiar();
        Celta.velocidadeAtual();
    }
}
