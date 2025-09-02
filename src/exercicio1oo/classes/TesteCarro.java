package exercicio1oo.classes;

class TesteCarro {
    public static void main(String[] args) {
        Carro Celta = new Carro();

        Celta.marca = "Chevrolet";
        Celta.modelo = "Celta";
        Celta.ano = 2012;
        Celta.velocidade = 100;

        System.out.println(Celta.marca);
        System.out.println(Celta.modelo);
        System.out.println(Celta.ano);
        System.out.println(Celta.velocidade);
    }
}
