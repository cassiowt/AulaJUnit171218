package exemplo;

import java.util.ArrayList;

public class Triangulo {

    private int ladoA, ladoB, ladoC;
    ArrayList lados = new ArrayList();

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;

        lados.add(ladoA);
        lados.add(ladoB);
        lados.add(ladoC);

    }

    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public TipoTriangulo validaTriangulo(){

        if ((this.ladoA < this.ladoB + this.ladoC) && (this.ladoB < this.ladoA + this.ladoC) && (this.ladoC < this.ladoA+this.ladoB)) {
            return TipoTriangulo.INEXISTENTE;
        } else if (this.ladoA  == this.ladoB && this.ladoA  == this.ladoC){
            return TipoTriangulo.EQUILATERO;
        } else  if((this.ladoA  == this.ladoB) || (this.ladoA  == this.ladoC)) {
            return TipoTriangulo.ESCALENO;
        }
        return TipoTriangulo.ISOSCELES;
    }

    public TipoTriangulo identificaTipoTriangulo() {

        TipoTriangulo tipo = null;
        tipo = lados.stream().distinct().limit(3).count() <= 1 ? TipoTriangulo.EQUILATERO : tipo;
        tipo = lados.stream().distinct().limit(3).count() == 3 ? TipoTriangulo.ESCALENO : tipo;
        tipo = lados.stream().distinct().limit(3).count() == 2 ? TipoTriangulo.ISOSCELES : tipo;
        return tipo;

    }
}
