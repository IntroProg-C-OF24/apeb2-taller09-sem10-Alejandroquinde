import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);     
        System.out.println("¿Cuantas marcas desea ingresar?");
        int limMarcas = teclado.nextInt();
        String[] marcas = new String[limMarcas];
        System.out.println("No se contabilisan las marcas que empiecen en A C T O");
        for (int i = 0; i < limMarcas; i++) {
            System.out.println("Ingrese la marca " +(i+1));
            marcas[i] = teclado.next();         
            if(marcas[i].startsWith("C")   ){
                i--;
            }else if (marcas[i].startsWith("A")   ){
                i--;
            }else if (marcas[i].startsWith("T")   ){
                i--;    
            }    
        }
    }
}
