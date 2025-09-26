package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

class TesteAluno {
    public static void main(String[] args) {
        Aluno Jonathan = new Aluno();
        Jonathan.matricula = "CESMO-42";
        Jonathan.nome = "Jonathan Pires de Miranda";
        Jonathan.idade = 26;
        Jonathan.nota1 = 8;
        Jonathan.nota2 = 10;
        Jonathan.nota3 = 4;
        Jonathan.nota4 = 8;
        System.out.println("matricula: " + Jonathan.matricula);
        System.out.println("nome: " + Jonathan.nome);
        System.out.println("idade: " + Jonathan.idade);
        System.out.println("nota1: " + Jonathan.nota1);
        System.out.println("nota2: " + Jonathan.nota2);
        System.out.println("nota3: " + Jonathan.nota3);
        System.out.println("nota4: " + Jonathan.nota4);
    }
}
