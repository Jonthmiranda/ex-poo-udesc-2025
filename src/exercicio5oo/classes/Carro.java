package exercicio5oo.classes;

public class Carro {
    private String modelo, marca;
    private int ano;
    private double velocidade;

    public Carro(){

    }

    public Carro(String modelo, String marca, int ano, double velocidade){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    //getters e setters

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public double getVelocidade() { return velocidade; }
    public void setVelocidade(double velocidade) { this.velocidade = velocidade; }

    public double acelerar(){
        velocidade = velocidade + 10;
        return velocidade;
    }

    public double freiar(){
        velocidade = velocidade - 10;
        if(velocidade < 0) {
            velocidade = 0;
        }
        return velocidade;
    }

    public void velocidadeAtual(){
        System.out.printf("O carro modelo %s da %s ano %d está a %.2f km/h\n", modelo, marca, ano, velocidade);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", velocidadeAtual=" + velocidade + '}';
    }
}