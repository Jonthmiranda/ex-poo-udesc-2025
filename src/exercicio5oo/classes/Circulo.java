package exercicio5oo.classes;

public class Circulo {
    private double raio;

    public Circulo(){

    }

    public Circulo(double raio){
        this.raio = raio;
    }

    //getters e setters

    public double getRaio() { return raio; }
    public void setRaio(double raio) { this.raio = raio; }

    public double diametro(){
        double diametro = 2 * raio;
        return diametro;
    }

    public double perimetro(){
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }

    public double area(){
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio='" + raio + '\'' +
                ", diametro='" + diametro() + '\'' +
                ", perimetro=" + perimetro() + '\'' +
                '}';
    }
}