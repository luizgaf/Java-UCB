abstract class Shape{
    private double largura, altura, comprimento;

    public Shape(double largura, double comprimento,double altura){
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public Shape(double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public Shape(double largura){
        this.largura = largura;
    }

    public double getLargura(){
        return largura;
    }
    public double getAltura(){
        return altura;
    }
    public double getComprimento(){
        return comprimento;
    }
}

interface OpTwoShape{
    double getArea();
}
interface OpThreeShape{
    double getVolume();
}

class TwoSideShape extends Shape implements OpTwoShape{

    public TwoSideShape(double largura, double comprimento){
        super(largura, comprimento);
    }

    public TwoSideShape(double largura){
        super(largura, 3.14);
    }

    public double getRaio(){
        return super.getLargura();
    }
    public double getPi(){
        return super.getComprimento();
    }

    public double getArea(){
        return  (super.getComprimento() * super.getLargura());
    }
}

class ThreeSideShape extends Shape implements OpThreeShape{

    public ThreeSideShape(double largura, double comprimento, double altura){
        super(largura, comprimento, altura);
    }

    public double getVolume(){
        return  (super.getComprimento() * super.getLargura() * super.getAltura());
    }
}

class Square extends TwoSideShape{
    public Square(double largura, double comprimento){
        super(largura, comprimento);
    }

    public double getArea(){
        return super.getArea();
    }
}

class Circle extends TwoSideShape{
    public Circle(double raio){
        super(raio);
    }

    @Override
    public double getArea(){
        return (super.getPi() * (super.getRaio() * super.getRaio()));
    }
}

class Cube extends ThreeSideShape{
    public Cube(double largura, double comprimento, double altura){
        super(largura, comprimento, altura);
    }

    public double getVolume(){
        return super.getVolume();
    }
}

public class Geometric{
    public static void main(String[] args){
        Cube kevin = new Cube(2, 2, 2);
        Circle ball = new Circle(3);
        Square block = new Square(4, 4);

        System.out.printf("Cube %.2f   Circle %.2f   Square %.2f", kevin.getVolume(), ball.getArea(), block.getArea());
    }
}
