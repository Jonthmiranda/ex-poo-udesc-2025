package exercicio5oo.testes;

import exercicio5oo.classes.ContaBancaria;

class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria Jonathan = new ContaBancaria();

        Jonathan.setNumeroConta("123455-9");
        Jonathan.setTitular("Jonathan Pires de Miranda");
        Jonathan.setSaldo(0);

        Jonathan.depositar();
        Jonathan.imprimirSaldo();
        Jonathan.sacar();
        Jonathan.imprimirSaldo();
    }
}
