public class Televisor {
    private int volume;
    private int canal;
    Televisor() {

    }
    Televisor (int volume){
        this.volume = volume;
    }
    Televisor(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }
    public void mostrar() {
        System.out.println("Volume: " + volume +"\nCanal: " + canal);
    }
}
