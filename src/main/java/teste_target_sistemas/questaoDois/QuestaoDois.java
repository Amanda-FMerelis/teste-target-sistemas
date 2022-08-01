package teste_target_sistemas.questaoDois;

public class QuestaoDois {
	
	public QuestaoDois() {
	}
	
	public void calcularFibonacci(int numero){
	       int sequencia = 0, auxiliar1 = 0, auxiliar2 = 1;
	       while(numero > sequencia){
	           sequencia = auxiliar1 + auxiliar2;
	           auxiliar1 = auxiliar2;
	           auxiliar2 = sequencia;
	       }

	       if((numero - sequencia) == 0){
	           System.out.println("Este numero pertence a sequencia fibonacci");
	       } else {
	           System.out.println("Este numero nao pertence a sequencia fibonacci");
	       }
	    }
	
}
