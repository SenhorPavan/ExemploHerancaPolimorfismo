package herancapolimorfismo;

public class HerancaPolimorfismo {

    
    public static void Gugu(OperacaoMatematica op, double valor1, double valor2){      
        op.Calcular(valor1, valor2);
        
    }
       
    public static void main(String[] args) {

//        Soma som = new Soma();   
//        Subtracao sub = new Subtracao();
//        Multiplicacao mult = new Multiplicacao();
//        Divisao div = new Divisao();
//        Potencia pot = new Potencia();
        
        Gugu(new Soma(),10,20);
        Gugu(new Subtracao(),10,20);
        Gugu(new Multiplicacao(),10,20);
        Gugu(new Divisao(),10,20);
        Gugu(new Potencia(),2,5);
    }

}
