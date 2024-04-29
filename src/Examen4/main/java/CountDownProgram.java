
public class CountDownProgram {
    public static void main(String[] args) {
      int num = 10;
      while (num != 0) {
        System.out.println(num);
        num--;
        sleep(1000); //Esperar 1 segundo entre cada interración
      }
        System.out.println("El programa se detiene");
    }
    private static void sleep(long milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
