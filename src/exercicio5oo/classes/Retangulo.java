package exercicio5oo.classes;

public class Retangulo {
   private double largura, altura;

    public Retangulo(){

    }

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    //getters e setters

    public double getLargura() { return largura; }
    public void setLargura(double largura) { this.largura = largura; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double calcularArea(){
        double area = largura * altura;
        return area;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "altura='" + altura + '\'' +
                ", largura='" + largura + '\'' +
                ", area=" + calcularArea() + '\'' +
                '}';
    }
}