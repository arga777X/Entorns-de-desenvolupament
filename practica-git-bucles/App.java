public class App {
    public static void main(String[] args) {
        int mida = 5;

        System.out.println("=== MATRIU DE MULTIPLICACIÓ ===");
        for (int i = 0; i < mida; i++){
            for (int j = 0; j < mida; j++) {
                System.out.printf("%02d ", (i + 1) * (j + 1));
            }
            System.out.println();
        }

        System.out.println("=== PATRÓ TRIANGLE ===");
        //Bucles aniuats per dibuixar un triangle rectangle
        for (int i = 0; i < mida; i ++) {
            for (int j = 0; j < mida; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}