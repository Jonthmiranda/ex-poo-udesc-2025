package exercicio4oo.classes;

public class Livro {
    private String titulo, autor, genero;
    private boolean emprestado;

    //getters e setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public boolean getEmprestado() { return emprestado; }
    public void setEmprestado(boolean emprestado) { this.emprestado = emprestado; }

    public boolean emprestar(){
        emprestado = true;
        return emprestado;
    }

    public boolean devolver(){
        emprestado = false;
        return emprestado;
    }

    public void verificarDisponibilidade(){
        if(emprestado == true){
            String emp = "indisponivel";
            System.out.printf("O livro %s\ndo autor %s\ngenero %s\nEstá: %s\n\n", titulo, autor, genero, emp);
        }else{
            String emp = "disponivel";
            System.out.printf("O livro %s\ndo autor %s\ngenero %s\nEstá: %s\n\n", titulo, autor, genero, emp);
        }
    }
}