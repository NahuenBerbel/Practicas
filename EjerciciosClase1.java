public class EjerciciosClase1 {
    public static void main(String args[]) {
        int a = 0;
        int b = 14;
        boolean esPar = false;
        
        System.out.println("------------------------------------------------------------------------------");
        //PROBLEMA 1-A)   
        System.out.println("Problema 1-A: Imprimir todos los enteros entre " + a + " Y " + b + "\n");
        while (a <= b){
            System.out.println(a);
            a++;
        }
        System.out.println("------------------------------------------------------------------------------ \n");
        //PROBLEMA 1-B) 
        int c = 0;
        int d = 14;
           
        System.out.println("Problema 1-B: Imprimir todos los pares entre " + c +" Y " + d + "\n");
        while (c <= d){
            if(c%2 == 0){
            System.out.println(c);
            }
            c++;
        }
        System.out.println("------------------------------------------------------------------------------ \n");
        //PROBLEMA 1-C)
        int e = 0;
        int f = 14;
        
        System.out.println("Problema 1-C: Imprimir todos los impares entre " + e +" Y " + f + "\n");
        while (e <= f){
        	if(esPar == true) {
        		if(e%2 == 0) {
        			System.out.println(e);
        		}
        	}else if(e%2 != 0){
        		System.out.println(e);
        	}
        	e++;
        }
        System.out.println("------------------------------------------------------------------------------ \n");
		//PROBLEMA 1-D)
        System.out.println("Problema 1-D: Imprimir todos los impares entre 1 Y 14 con sentencia \"for\" \n");
        for(int x=1; x<=14; x++) {
        	if(x%2 != 0) {
        		System.out.println(x);
        	}
        }
        System.out.println("------------------------------------------------------------------------------ \n");
        //PROBLEMA 2)
        System.out.println("Problema 2:");
        System.out.println("Si una persona declara tener al menos un ingreso superior de $489.083; Contar con 3 vehiculos; poseer 3 inmuebles;  Poseer una embarcación, una aeronave de lujo o ser titular de activos societarios que demuestren capacidad económica plena.? (\"EAA\"), se la concidera una persona con ingresos altos. \n");
        
        float ingresos = 489080;
        int vehiculos = 2;
        int inmuebles = 1;
        boolean eaa = true;
        
        System.out.println("Ingresos declarados: ");
        System.out.println("Total de ingresos declarados: $" + ingresos);
        System.out.println("Total de vehiculos declarados: " + vehiculos);
        System.out.println("Total de inmuebles declarados: " + inmuebles);
        System.out.println("EAA: " + eaa + "\n");

        if ((ingresos >= 489083) ||
        	(vehiculos >= 3) ||
        	(inmuebles >=3) ||
        	(eaa == true)){
        	
        	System.out.println("Ingreso Altos");
        	
        } else if((ingresos < 489083) ||
        		  (vehiculos <= 3) ||
        		  (inmuebles <= 3) ||
        		  (eaa == false)) {
        	
                    System.out.println("Ingreso Bajos");
                    
        }
        	
    }
}
