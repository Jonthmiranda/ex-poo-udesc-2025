package exercicio3oo.testes;

import exercicio3oo.classes.ContaBancaria;

class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria Jonathan = new ContaBancaria();

        Jonathan.setNumeroConta("123455-9");
        Jonathan.setTitular("Jonathan Pires de Miranda");
        Jonathan.setSaldo(1500);

        System.out.printf("titular: %s/n", Jonathan.getTitular());
        System.out.printf("Numero da conta: %s/n", Jonathan.getNumeroConta());
        System.out.printf("Saldo de %f/n", Jonathan.getSaldo());
    }
}
