package exercicio3oo.testes;

import exercicio2oo.classes.Livro;

class TesteLivro {
    public static void main(String[] args) {
        Livro George = new Livro();

        George.setTitulo("A Revolução dos Bichos");
        George.setAutor("George Orwell");
        George.setGenero("Ficção");
        George.setEmprestado(true);

        System.out.printf("titulo: %d/n", George.getTitulo);
        System.out.printf("autor: %d/n", George.getAutor);
        System.out.printf("genero: %d/n", George.getGenero);
        System.out.printf("emprestado: %d/n", George.getEmprestado);
    }
}
