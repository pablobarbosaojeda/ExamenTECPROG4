public class HaltChecker {
    public static boolean checkHalt(int[] code, int input){
        for (int instruction : code) {
            if (instruction == input) {
                return true; //El programa se detiene si encuentra la entrada específica
            }
        }
        return false; //El programa no se detiene si no encuentra la entrada específica
    }
}
