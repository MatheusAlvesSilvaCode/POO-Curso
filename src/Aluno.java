public class Aluno extends ProjetoPessoas {
    private int mat;
    private String curso;


    public void CancelarMatricula() {
        System.out.println("Matricula Cancelada");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
