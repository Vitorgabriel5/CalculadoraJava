package calculo;


public class calculadoraCientifica  extends calculadoraSimples {
    public  double calcularRaizQuadrada(double a){
        if (a < 0) {
            throw new IllegalArgumentException("Numero negativo não é permitido");
        }
        return Math.sqrt(a);
    }
    public double calcularPotencia(double base, double exponente){
        return Math.pow(base, exponente);
    }
    public double calcularSeno(double anguloEmGraus){
        return Math.sin(Math.toRadians(anguloEmGraus));
    }
    public double calcularCosseno(double anguloEmGraus){
        return Math.cos(Math.toRadians(anguloEmGraus));

    }

}
