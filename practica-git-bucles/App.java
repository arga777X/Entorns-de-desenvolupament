public class App {
    public static void main(String[] args) {
        int mida = 5;
        System.out.println("=== PATRÓ INICIAL (QUADRAT) ===");
        //Bucles aniuats per dibuixar una llista de coordenades
        for (int i = 0; i < mida; i ++) {
            for (int j = 0; j < mida; j++) {
                System.out.print("[" + i + ", " + j + "] ");
            }
            System.out.println(); //Canvi de línia al final de cada fila
        }
    }
}