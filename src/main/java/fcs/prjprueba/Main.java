package fcs.prjprueba;

import fcs.prjprueba.beans.Automovil;
import fcs.prjprueba.beans.Concesionaria;
import fcs.prjprueba.beans.Motocicleta;
import fcs.prjprueba.beans.Vehiculo;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Concesionaria c1 = new Concesionaria();
        c1.setNombre("Principal");
        c1.setDireccion("Surquillo");
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Automovil carro1 = new Automovil();
        Automovil carro2 = new Automovil();
        Motocicleta moto1 = new Motocicleta();
        Motocicleta moto2 = new Motocicleta();
        carro1.setColor("Verde");
        carro1.setAsientos(4);
        carro1.setMarca("Hyundai");
        carro1.setModelo("Elantra");
        carro1.setPlaca("IO3600");
        carro1.setSoat("FCS1995");
        carro1.setNumero_motor("HY1995EL001");
        carro2.setColor("Azul");
        carro2.setAsientos(4);
        carro2.setMarca("Nissan");
        carro2.setModelo("Sunny");
        carro2.setPlaca("AB4545");
        carro2.setSoat("MCM1987");
        carro2.setNumero_motor("NI1987SU010");
        moto1.setColor("Rojo");
        moto1.setAsientos(2);
        moto1.setMarca("Honda");
        moto1.setModelo("Kawasaki");
        moto1.setCilindros(1200);
        moto2.setColor("Blanco");
        moto2.setAsientos(1);
        moto2.setMarca("McLaren");
        moto2.setModelo("F1");
        moto2.setCilindros(2500);
        vehiculos.add(carro1);
        vehiculos.add(moto1);
        vehiculos.add(carro2);
        vehiculos.add(moto2);
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
        Vehiculo carroX = new Automovil();
        carroX = carro1;
        System.out.println(carroX.toString());
        carroX.setColor("fucsia");
        System.out.println("------");
        System.out.println(carro1.toString());
        System.out.println(carroX.toString());

//        String cadena = "Franco";
//        String cadena2 = cadena;
//        System.out.println(cadena);
//        System.out.println(cadena2);
//        cadena = "FrancoCS";
//        System.out.println("-----");
//        System.out.println(cadena2);
    }

}
