public class ModelCraps {

    private Dice[] dado;
    private int [] caras;

    public ModelCraps(){
        dado = new Dice[10];
        for (int i=0; i<10;i++){
            dado[i] =new Dice();
        }
        caras = new int[10];
    }
    public void obtenerValorCaras(){
        for (int i=0; i<caras.length; i++){
            caras[i]=dado[i].getFace(); // 1=Meeple, 2=42, 3=Héroe, 4=Dragón, 5=Corazón, 6=Cohete.
        }
    }
    public int[] getCaras(){
        return caras;
    }
    public static void main(String[] args) {
        ModelCraps dado = new ModelCraps();
        dado.getCaras();;
    }
}
