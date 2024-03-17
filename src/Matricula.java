public class Matricula {
    private Aluno aluno;
    private Disciplina displina;
    private double nota;
    private int frequencia;
    private String periodo;

    public Matricula(Aluno aluno, Disciplina displina, double nota, int frequencia, String periodo) {
        this.aluno = aluno;
        this.displina = displina;
        this.nota = nota;
        this.frequencia = frequencia;
        this.periodo = periodo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisplina() {
        return displina;
    }

    public void setDisplina(Disciplina displina) {
        this.displina = displina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
