public class Reverser {
    public static void main(String[] args) {
        //HaltChecker analiza el código de Reverser

        int[] code = {1, 2, 3, 4, 5}; //Código de Reverser
        int input = 5; //Entrada específica para Reverser

        //Si HaltChecker indica que el programa se detiene, Reverser ejecuta un bucle infinito
        if (HaltChecker.checkHalt(code, input)) {
            while (true) {
                //Bucle infinito
            }
        }

    }
}
