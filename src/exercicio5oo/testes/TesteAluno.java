package exercicio5oo.testes;

import exercicio4oo.classes.Aluno;

class TesteAluno {
    public static void main(String[] args) {
        Aluno Jonathan = new Aluno();

        Jonathan.setMatricula("CESMO-42");
        Jonathan.setNome("Jonathan Pires de Miranda");
        Jonathan.setIdade(26);
        Jonathan.setNota1(8);
        Jonathan.setNota2(10);
        Jonathan.setNota3(4);
        Jonathan.setNota4(8);
        Jonathan.imprimirDados();
    }
}
