package fcs.prjprueba.beans;

public class Motocicleta extends Vehiculo {

    private int cilindros;

    @Override
    public String toString() {
        return "Motocicleta{" + "cilindros=" + cilindros +", color=" + super.getColor() + '}';
    }

    public Motocicleta() {
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

}
