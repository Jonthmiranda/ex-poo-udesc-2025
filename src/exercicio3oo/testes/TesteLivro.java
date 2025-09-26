package exercicio3oo.testes;

import exercicio2oo.classes.Livro;

class TesteLivro {
    public static void main(String[] args) {
        Livro George = new Livro();

        George.titulo = "A Revolução dos Bichos";
        George.autor = "George Orwell";
        George.genero = "Ficção";
        George.emprestado = true;

        System.out.println(George.titulo);
        System.out.println(George.autor);
        System.out.println(George.genero);
        System.out.println(George.emprestado);
    }
}
