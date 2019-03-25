package daoImpl;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.modules.XMLResource;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

import daoInterfaces.BarajasInterfaz;
import daoModelos.Carta;

public class BarajaImplement implements BarajasInterfaz{
	protected static String driver = "org.exist.xmldb.DatabaseImpl";
	protected static String URI = "xmldb:exist://localhost:8845/exist/xmlrpc";
    protected static String collectionPath = "/db/Cartas"; 
    protected static String resourceName = "Cartas.xml"; 
    
    @Override
    public ArrayList<Carta> cargarCartas() {
    	ArrayList<Carta> cartas = new ArrayList<Carta>();
    	try {
    		Class cl = Class.forName(driver);
    		Database base_datos = (Database) cl.newInstance();
    		base_datos.setProperty("create-database","true");
    		DatabaseManager.registerDatabase(base_datos);
			
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
						cartas.add(c);
					} 
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return cartas;
	}
	@Override
	public void generarDeckAleatorio() {
		
	}
	@Override
	public void moverCartasaDeck() {
	
	}
	@Override
	public void moverCartasaColeccion() {
		
	}
	public static void main(String[] args) {
		BarajaImplement b = new BarajaImplement();
		b.cargarCartas();
	}
}
