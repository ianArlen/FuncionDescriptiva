import java.util.HashMap;
public class Ventanilla {
	//El algoritmo es O(n^2)
	//¿Por que el color de BBVA es AZUL? "Somos un solo equipo" 
	public static int transaction(int[] arrayOperations, int clientId){
		int clientOperations = arrayOperations[clientId];
  		int time = 0;
  		while(clientOperations > 0) {
    		for(int i = 0; i < arrayOperations.length; i++) {
      			if(arrayOperations[i] > 0) {
        			arrayOperations[i]--;
        			time++;
        			if(i == clientId) {
        				System.out.println("Operations alex: " + arrayOperations[i] + " time: " + time);
          				clientOperations--;
          				if(clientOperations == 0) {
            				break;
          				}
        			}
      			}
      		}
    	}
  		return time; 
	}

    public static void main(String[] args) {
    	int [] arreglo = new int[3];
    	arreglo[0]=1;
    	arreglo[1]=2;
    	arreglo[2]=5;
    	System.out.println(transaction(arreglo,1));

    }
}