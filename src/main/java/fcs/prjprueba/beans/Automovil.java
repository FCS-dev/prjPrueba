package fcs.prjprueba.beans;

public class Automovil extends Vehiculo {

    private String placa;
    private String soat;
    private String numero_motor;

    public Automovil() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getSoat() {
        return soat;
    }

    public void setSoat(String soat) {
        this.soat = soat;
    }

    public String getNumero_motor() {
        return numero_motor;
    }

    public void setNumero_motor(String numero_motor) {
        this.numero_motor = numero_motor;
    }

    @Override
    public String toString() {

        return "Automovil{" + "placa=" + placa + ", soat=" + soat + ", numero_motor=" + numero_motor + ",color=" + super.getColor() + "}";
    }

}
