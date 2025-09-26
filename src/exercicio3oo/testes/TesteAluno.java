package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

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

        System.out.printf("matricula: %s", Jonathan.getMatricula());
        System.out.printf("nome: %s", Jonathan.getNome());
        System.out.printf("idade: %d", Jonathan.getIdade());
        System.out.printf("nota1: %d", Jonathan.getNota1());
        System.out.printf("nota2: %d", Jonathan.getNota2());
        System.out.printf("nota3: %d", Jonathan.getNota3());
        System.out.printf("nota4: %d", Jonathan.getNota4());
    }
}
