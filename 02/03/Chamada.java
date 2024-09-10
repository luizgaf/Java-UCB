public class Chamada{
    private String nomeProfessor;
    private String cursoProfessor;

    public Chamada(String nome, String curso){
        this.nomeProfessor = nome;
        this.cursoProfessor = curso;
    }

    public String getProfessorName(){
        return nomeProfessor;
    }
    public void setProfessorName(String name){
        this.nomeProfessor = name;
    }

    public String getCurso(){
        return cursoProfessor;
    }
    public void setCurso(String curso){
        this.cursoProfessor = curso;
    }
    

    public void chamada() {
        System.out.println("");
        System.out.println("Nome do professor: " + nomeProfessor);
        System.out.println("Curso: " + cursoProfessor);
        System.out.println("");
    }

    public static void main(String[] args) {
        Chamada chamada = new Chamada("Fulano Tal", "Biologia");
        chamada.chamada();

        System.out.println("Atualizando...");

        chamada.setProfessorName("Lucas Roberto");

        chamada.setCurso("Odontologia");

        chamada.chamada();
    }
}