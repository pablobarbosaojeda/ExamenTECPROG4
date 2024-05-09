package HaltChecker;
import java.util.List;
public class HaltChecker {

        public boolean checkHalting(Program program, Input input) {
            return program.halt(input);
        }

        // Método sobrecargado para verificar múltiples programas con la misma entrada
        public void checkHalting(List<Program> programs, Input input) {
            for (Program program : programs) {
                boolean halts = checkHalting(program, input);
                System.out.println(program.getClass().getSimpleName() + " halts: " + halts);
            }
        }
    }

