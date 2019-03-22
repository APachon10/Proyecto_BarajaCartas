package daoImpl;

import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.modules.XMLResource;

import daoInterfaces.BarajasInterfaz;

public class BarajaImplement implements BarajasInterfaz{
	protected static String driver = "org.exist.xmldb.DatabaseImpl";
	protected static String URI = "xmldb:exist://localhost:8845/exist/xmlrpc";
    protected static String collectionPath = "/db/Cartas"; 
    protected static String resourceName = "Cartas.xml"; 
    @Override
	public void cargarCartas() {
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
					System.out.println(archivo_xml.getContent());
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void generarDeckAleatorio() {
		
	}
	@Override
	public void guardarDeck() {
		
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
