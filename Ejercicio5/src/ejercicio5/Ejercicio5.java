package ejercicio5;
public class Ejercicio5 {
    public static void main(String[] args) {
        int limEst = 100;
        double notasEst[] = new double [limEst];
        double sumaNotas = 0, promedio = 0, notaMayor, notaMenor;
        for (int i = 0; i < notasEst.length; i++) {
            notasEst[i] = (double) (Math.random() * (10 - 0 + 1) + 0);
        }
        System.out.println("LISTA DE NOTAS");
        for (int i = 0; i < notasEst.length; i++) {
            System.out.printf("%s %d: %2.f \n", "Notas del Est", (i + 1), notasEst[i]);
        }
        for (int i = 0; i < notasEst.length; i++) {
            sumaNotas += notasEst[i];
        }
        promedio = sumaNotas / notasEst.length;
        System.out.printf("Promedio: %.2f \n", promedio);
        notaMayor = notasEst[0];
        notaMenor = notasEst[0];
        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] > notaMayor) {
                notaMayor = notasEst[i];
            }
            if (notasEst[i] < notaMenor) {
                notaMayor = notasEst[i];
            }
        }
        System.out.println("Nota mayor: " + notaMayor);
        System.out.println("Nota menor: " + notaMenor);
        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] >= 6) {
                System.out.printf("%s %d 5.2f \n", "NOtas del Est", (i + 1), notasEst[i]);
            }
            
        }
        
    }
    
}
