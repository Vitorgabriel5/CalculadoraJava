package calculo;

public class calculadoraSimples {
    public double soma (double a, double b) {
        return a + b;
    }
    public double subtrair(double a, double b) {
        return a - b;
    }
    public double multiplica(double a, double b) {
        return a * b;
    }
    public double dividir(double a, double b) {
        if (b == 0){
            throw new IllegalArgumentException("Divisao deve ser maior que zero");
        }
        return a / b;
    }
}
