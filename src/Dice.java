import java.util.Random;

public class Dice {
    private int face;
    //Función que elige número random del 1 al 6 para los dados
    public int getFace() {
        Random rand = new Random();
        face = rand.nextInt(6)+1;
        return face;
    }

}
