package exercicio4oo.testes;

import exercicio4oo.classes.Livro;

class TesteLivro {
    public static void main(String[] args) {
        Livro George = new Livro();

        George.setTitulo("A Revolução dos Bichos");
        George.setAutor("George Orwell");
        George.setGenero("Ficção");
        George.setEmprestado(false);

        George.verificarDisponibilidade();
        George.emprestar();
        George.verificarDisponibilidade();
        George.devolver();
        George.verificarDisponibilidade();
    }
}
