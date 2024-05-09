package HaltChecker;

public class HaltChecker {
public boolean checkIfHalt(Program program, int input){
    if(program.getCode() == 1){
        return input >= 0; //El contador hacia abajo se detiene si el contador alcanza cero o un número negativo
    } else if(program.getCode() == 2){
        return false; //El contador infinito nunca se detiene
    } else {
        return input == 0; // Otros programas se detienen solo si la entrada es cero

        }
    }
}
