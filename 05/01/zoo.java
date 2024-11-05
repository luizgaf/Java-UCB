
abstract class Animal{
    private String nome;
    private int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    abstract void emitirSom();
}

class Mamifero extends Animal{
    private String corPelo;

    public Mamifero(String nome, int idade, String cor){
        super(nome, idade);
        this.corPelo = cor;
    }

    @Override
    public void emitirSom(){
        System.out.println("Som mamifero");
    }

}

class Ave extends Animal{
    private int tamanhoAsa;

    public Ave(String nome, int idade, int tamanhoAsa){
        super(nome, idade);
        this.tamanhoAsa = tamanhoAsa;
    }

    @Override
    public void emitirSom(){
        System.out.println("Som ave");
    }
}

interface Nadador{
    void nadando();
}

interface Voador{
    void voando();
}

class Elefante extends Mamifero implements Nadador{

    public Elefante(String nome, int idade, String cor){
        super(nome, idade, cor);
    }    

    @Override
    public void emitirSom(){
        System.out.println("Bramido");
    }

    public void nadando(){
        System.out.println("Elefante esta nadando");
    }
}

class Calopsita extends Ave implements Voador{

    public Calopsita(String nome, int idade, int TamanhoAsa){
        super(nome, idade, TamanhoAsa);
    }    

    @Override
    public void emitirSom(){
        System.out.println("Piado");
    }

    public void voando(){
        System.out.println("Calopsita esta voando");
    }
}

public class zoo{
    public static void main(String[] args) {
        Elefante Tuco = new Elefante("Tuco", 4, "Cinza");
        Calopsita Lupito = new Calopsita("Lupito", 3, 13);

        Lupito.emitirSom();
        Lupito.voando();

        Tuco.emitirSom();
        Tuco.nadando();
    }
}