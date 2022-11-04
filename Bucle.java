public class Bucle {
    public static void main(String[] args) {
        int max = 10;
        int enteroRandom = (int) (Math.random()*max);
        int Salir = 3;

        while (enteroRandom!=Salir){
            enteroRandom = (int) (Math.random()*max);
            System.out.println(enteroRandom);
        }
       
    }
    
}

