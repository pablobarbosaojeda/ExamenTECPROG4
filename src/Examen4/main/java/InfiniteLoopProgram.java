public class InfiniteLoopProgram {
    public static void main(String[] Args){
        int num = 1;
        while(true) {
            System.out.println(num);
            num++;
            sleep(1000); //Esperar 1 segundo entre cada interración
        }
    }
    private static void sleep(long milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
