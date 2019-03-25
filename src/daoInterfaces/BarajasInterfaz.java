package daoInterfaces;

import java.util.ArrayList;

import daoModelos.Carta;

public interface BarajasInterfaz {
	public ArrayList<Carta> cargarCartas();
	public void generarDeckAleatorio();
	public void moverCartas();
	
}
