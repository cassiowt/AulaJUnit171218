package exemplo;

public class Triangulo {

    private int ladoA, ladoB, ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
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
        return TipoTriangulo.ESOSCELES;
    }

}
