package exercicio4oo.testes;

import exercicio4oo.classes.Livro;

class TesteLivro {
    public static void main(String[] args) {
        Livro George = new Livro();

        George.setTitulo("A Revolução dos Bichos");
        George.setAutor("George Orwell");
        George.setGenero("Ficção");
        George.setEmprestado(true);

        System.out.printf("titulo: %s/n", George.getTitulo());
        System.out.printf("autor: %s/n", George.getAutor());
        System.out.printf("genero: %s/n", George.getGenero());
        System.out.printf("emprestado: %b/n", George.getEmprestado());
    }
}
