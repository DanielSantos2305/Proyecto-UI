package consolecrush;

public class Jugador {

    private int puntaje;
    private int vidas;
    private boolean jugar;

    //Puntos
    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = this.puntaje + puntaje;
    }

    //Vidas
    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    //Jugar
    public boolean getJugar() {
        return this.jugar;
    }

    public void setJugar(boolean jugar) {
        this.jugar = jugar;
    }

    public void restarVidas() {
        this.vidas--;
        //System.out.println("==========================================================================================================================================");
        //System.out.println("=============================================================¡Has realizado 50 movimientos!===============================================");
        //System.out.println("====================================================================Pierdes una vida======================================================");
        //System.out.println("==========================================================================================================================================");
    }

    public Jugador() {
        this.puntaje = 0;
        this.vidas = 5;
        this.jugar = true;
    }
}
