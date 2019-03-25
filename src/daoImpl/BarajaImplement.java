package daoImpl;


import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.modules.XMLResource;

import com.google.gson.Gson;

import daoInterfaces.BarajasInterfaz;
import daoModelos.Carta;

public class BarajaImplement implements BarajasInterfaz{
	protected static String driver = "org.exist.xmldb.DatabaseImpl";
	protected static String URI = "xmldb:exist://localhost:8845/exist/xmlrpc";
    protected static String collectionPath = "/db/Cartas"; 
    protected static String resourceName = "Cartas.xml";
    //ArrayLists 
    private  ArrayList<Carta> cartas_sin_seleccionar;
    private ArrayList<Carta> cartas_en_Mazo;
    private JList<Carta> cartas_ns;
    private JList<Carta> cartas_sn;
    
    //Metodos
    public void conexionExist() {
    	try {
    		Class cl = Class.forName(driver);
    		Database base_datos = (Database) cl.newInstance();
    		base_datos.setProperty("create-database","true");
    		DatabaseManager.registerDatabase(base_datos);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    @Override
    public ArrayList<Carta> cargarCartas() {
    	cartas_sin_seleccionar = new ArrayList<Carta>();
    	try {
			conexionExist();
    		Collection coleccion = null;
			XMLResource archivo_xml = null;
			try {
				coleccion = DatabaseManager.getCollection(URI +collectionPath);
				archivo_xml =(XMLResource) coleccion.getResource(resourceName);
				if (archivo_xml == null) {
					System.out.println("Documento no Encontrado!");
				}else {
					JSONObject objeto = XML.toJSONObject((String) archivo_xml.getContent());
					JSONArray cards = objeto.getJSONObject("cards").getJSONArray("card");
					Carta c = null;
					for (int i = 0; i < cards.length(); i++) {
						c = new Gson().fromJson(cards.get(i).toString(), Carta.class);
						cartas_sin_seleccionar.add(c);
					} 
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return cartas_sin_seleccionar;
	}
	@Override
	public void generarDeckAleatorio() {
		
	}
	@Override
	public void moverCartas(){
		cargarCartas();
		int contador=0;
		try {
			for (int i = 0; i < cartas_sin_seleccionar.size(); i++) {
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
