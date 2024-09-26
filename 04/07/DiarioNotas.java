import java.util.ArrayList;
import java.util.Scanner;

public class DiarioNotas{

    private static String NomeDoCurso;
    private static ArrayList<Double> notas;

    public DiarioNotas(String nome){
        NomeDoCurso = nome;
        notas = new ArrayList<>();
    }

    public static void addNota(Double nota){
        notas.add(nota);
    }

    public static void setCourseName(String name){
        NomeDoCurso = name;
    }
    public static String getCourseName(){
        return NomeDoCurso;
    }

    public static ArrayList<Double> getNotes(){
        return notas;
    }

    public static Double getMedia(ArrayList<Double> noteList){
        Double media= 0.0;
        for (Double not  : noteList) {
            media += not;
        }
        return (media/noteList.size());
    }

    public static Double[] getNotesToDouble(ArrayList<Double> noteList){
        Double[] arrayNotes = new Double[noteList.size()];
        for (int i = 0; i < noteList.size(); i++) {
            for (Double note : notas) {
                arrayNotes[i] = note;
            }
        }
        return arrayNotes;
    }

    public static Double highNote(ArrayList<Double> noteList){
        Double hNote = 0.0;

        for (Double n : noteList) {
            if (hNote<n) {
                hNote = n;
            }
        }
        return hNote;
    }

    public static Double minorNote(ArrayList<Double> noteList){
        Double mNote = 10000.0;

        for (Double n : noteList) {
            if (mNote>n) {
                mNote = n;
            }
        }
        return mNote;
    }

    public static void getGraph(ArrayList<Double> noteList){
        Double note;
        for (Double nota : noteList) {
            System.out.printf("%.2f: ", nota);
            for (int i = 0; i < nota; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void getRelatorio(Double maior, Double menor, Double media){
        System.out.println("Nome do curso: "+ NomeDoCurso);
        System.out.println("Maior Nota: "+ maior);
        System.out.println("Menor Nota: "+ menor);
        System.out.println("Media das notas: "+ media);
    }

}

class DiarioNotasTest{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do curso:");
        String cursoName = sc.nextLine();
        DiarioNotas dn = new DiarioNotas(cursoName);
        
        boolean status = true;
        int noteNumber = 1;
        while(status){

            System.out.println("Digite a nota"+ noteNumber + ":");
            Double ans = sc.nextDouble();
            dn.addNota(ans);
            noteNumber++;


                System.out.println("Nota adicionada! Deseja adicionar mais? (1-y) (2-n)");
                int ansAdcMore = sc.nextInt();
                boolean temp = true;
                            while (temp) { 
                                switch (ansAdcMore) {
                                case 1:
                                    temp = false;
                                    break;
                                case 2:
                                    temp=false;
                                    status = false;
                                    break;
                                default:
                                    System.err.println("Resposta Inváida! Tente Novamente!");
                                }
                            }
        }

        ArrayList<Double> notesList = dn.getNotes();
            dn.getRelatorio(dn.highNote(notesList), dn.minorNote(notesList), dn.getMedia(notesList));
            dn.getGraph(notesList);

        
    }
    
}