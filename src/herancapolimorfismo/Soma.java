
package herancapolimorfismo;

public class Soma extends OperacaoMatematica{

    @Override
    public void Calcular(double valor1, double valor2) {
        double resultado = valor1 + valor2;
        System.out.println("O VALOR DA SOMA É: " +  resultado);
        
    }
}
