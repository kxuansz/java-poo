import java.util.Scanner;

abstract class FiguraGeometrica {
    public abstract double calcularArea();
}

class Quadrado extends FiguraGeometrica {
    double medidaLado;

    public Quadrado(double lado) {
        this.medidaLado = lado;
    }

    @Override
    public double calcularArea() {
        return medidaLado * medidaLado;
    }
}

class Circulo extends FiguraGeometrica {
    double medidaRaio;

    public Circulo(double raio) {
        this.medidaRaio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * medidaRaio * medidaRaio;
    }
}

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double lado = sc.nextDouble();
        FiguraGeometrica fig1 = new Quadrado(lado);

        System.out.print("Digite o raio do circulo: ");
        double raio = sc.nextDouble();
        FiguraGeometrica fig2 = new Circulo(raio);

        System.out.println("Area do quadrado: " + fig1.calcularArea());
        System.out.println("Area do circulo: " + fig2.calcularArea());

        sc.close();
    }
}
