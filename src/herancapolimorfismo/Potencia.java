
package herancapolimorfismo;


public class Potencia extends OperacaoMatematica{

    @Override
    public void Calcular(double valor1, double valor2) {
        double resultado = Math.pow(valor1, valor2);
        System.out.println("O VALOR DA POTENCIA É: "+resultado);
    }
    
    
    
}
