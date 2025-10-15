package exercicio5oo.classes;

public class Aluno {
    private String matricula;
    private String nome;
    private int idade;
    private int nota1, nota2, nota3, nota4;

    public Aluno(){

    }

    public Aluno(String matricula, String nome, int idade, int nota1, int nota2, int nota3, int nota4){
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    //getters e setters

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public int getNota1() { return nota1; }
    public void setNota1(int nota1) { this.nota1 = nota1; }

    public int getNota2() { return nota2; }
    public void setNota2(int nota2) { this.nota2 = nota2; }

    public int getNota3() { return nota3; }
    public void setNota3(int nota3) { this.nota3 = nota3; }

    public int getNota4() { return nota4; }
    public void setNota4(int nota4) { this.nota4 = nota4; }

    public double calcularMedia(){
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }

    public void imprimirDados(){
        double media = calcularMedia();

        if(media >= 7){
            System.out.printf("Matricula: %s\n" +
                    "Nome: %s\n" +
                    "Idade: %d\n" +
                    "Média de %.2f\n" +
                    "Aprovado", matricula, nome, idade, media);
        } else{
            System.out.printf("Matricula: %s\n" +
                    "Nome: %s\n" +
                    "Idade: %d\n" +
                    "Média de %.2f\n" +
                    "Reprovado", matricula, nome, idade, media);
        }

    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
                ", media=" + String.format("%.2f", calcularMedia()) +
                '}';
    }
}