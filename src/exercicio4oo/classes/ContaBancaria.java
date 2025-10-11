package exercicio4oo.classes;

import java.util.Scanner;

public class ContaBancaria {
    private String numeroConta, titular;
    private double saldo;

    //getters e setters
    public String getNumeroConta() { return numeroConta; }
    public void setNumeroConta(String numeroConta) { this.numeroConta = numeroConta; }

    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public double depositar(){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Quanto você quer depositar?\n");
        double deposito = scan.nextDouble();
        saldo = saldo + deposito;
        return saldo;
    }

    public double sacar(){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Quanto você quer sacar?\n");
        double saque = scan.nextDouble();
        saldo = saldo - saque;
        return saldo;
    }

    public void imprimirSaldo(){
        System.out.printf("Conta bancária número: %s\n" +
                "Titular: %s\n" +
                "Tem saldo de: %f\n", numeroConta, titular, saldo);
    }
}