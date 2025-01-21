package heranca;

public class HAluno extends HPessoa {
    private int matricula;
    private String curso;
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade");

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
