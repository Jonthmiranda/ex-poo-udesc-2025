package exercicio1oo.classes;

class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria Jonathan = new ContaBancaria();

        Jonathan.numeroConta = "123455-9";
        Jonathan.titular = "Jonathan Pires de Miranda";
        Jonathan.saldo = 1500;

        System.out.println("titular " + Jonathan.numeroConta);
        System.out.println("Numero da conta " + Jonathan.numeroConta);
        System.out.println("Saldo de " + Jonathan.saldo);
    }
}
