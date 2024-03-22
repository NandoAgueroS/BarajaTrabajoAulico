/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barajatrabajoaulico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author NandoJ
 */
public class Baraja {
    private final List<Carta> cartas;
    private List<Carta> monton;
    public Baraja() {
        cartas=new ArrayList<>();
        String[]palos={"Espada","Oro","Basto","Copa"};
        for (String palo : palos) {
            for(int numero=1;numero<=12;numero++){
                if(numero!=8  && numero!=9){
                    cartas.add(new Carta(numero,palo));
                    
                }
            }
        }
    }
    
    public void barajar(){
        Collections.shuffle(cartas);
        
        
}
    
    public Carta siguienteCarta(){
        if(cartas.isEmpty()){
            System.out.println("!no hay mas cartas!");
            return null;
        }
        Carta carta = cartas.remove(0);
        monton.add(carta);
        return carta;

    }
    public int cartasDisponibles(){
        return cartas.size();
}
    public void darCartas(int cantidad){
        if (cantidad>cartas.size()) {
            for (int i = 0; i < cantidad; i++) {
                siguienteCarta();
            }
        }else{
            System.out.println("No hay cartas suficientes");
            System.out.println("Cartas disponibles: "+cartas.size());
        }
    }
    
    public void mostrarBaraja(){
        System.out.println("Baraja:");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}