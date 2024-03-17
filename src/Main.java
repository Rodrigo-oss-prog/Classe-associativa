public class Main {
    public static void main(String[] args) {

        System.out.println("Associação de classes");

        Aluno a1 = new Aluno("José", "SC3012867");
        Aluno a2 = new Aluno("Maria", "SC3012869");
        Aluno a3 = new Aluno("Manuela", "SC3012888");

        Disciplina d1 = new Disciplina("POOS3", "Programação Orientada a Objetos", 80);
        Disciplina d2 = new Disciplina("DOOS4", "Desenvolvimento Orientado a Objetos", 80);
        Disciplina d3 = new Disciplina("PWS3", "Programação WEB 3", 80);

        Matricula m1 = new Matricula(a1, d1,10, 100, "2024.1");
        Matricula m2 = new Matricula(a2, d2, 8, 80, "2024.1");
        Matricula m3 = new Matricula(a3, d2, 9, 80, "2024.1");
        Matricula m4 = new Matricula(a2, d1, 8, 80, "2024.1");
        Matricula m5 = new Matricula(a3, d3, 9, 80, "2024.1");

        a1.setMatriculas(new Matricula[]{m1});
        a2.setMatriculas(new Matricula[]{m2,m3});
        a3.setMatriculas(new Matricula[]{m4,m5});

        d1.setMatriculas(new Matricula[]{m1,m2});
        d2.setMatriculas(new Matricula[]{m3,m4});
        d3.setMatriculas(new Matricula[]{m5});

        for (Matricula m : a1.getMatriculas()){
            System.out.println("Matriculado em: "+ m.getDisplina().getNomeDisciplina());
        }

        for (Matricula m : d1.getMatriculas()){
            System.out.println("Matriculado na disciplina de POOS3: " + m.getAluno().getNome());

        }

    }
}