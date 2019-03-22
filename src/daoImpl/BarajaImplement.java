package daoImpl;

import javax.xml.transform.OutputKeys;

import org.exist.management.impl.Database;
import org.exist.xmldb.EXistResource;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.XMLResource;

public class BarajaImplement {

	public static void main(String[] args) {
//		final String driver = "org.exist.xmldb.DatabaseImpl";
//		// initialize database driver
//		Class cl = Class.forName(driver);
//		Database database = (Database) cl.newInstance();
//		database.setProperty("create-database","true");
//		DatabaseManager.registerDatabase(database);
//
//		Collection col = null;
//		XMLResource res = null;
//		try {    
//			// get the collection
//			col = DatabaseManager.getCollection(URI + args[0]);
//			col.setProperty(OutputKeys.INDENT, "no");
//			res = (XMLResource)col.getResource(args[0]);
//
//			if(res == null) {
//				System.out.println("document not found!");
//			} else {
//				System.out.println(res.getContent());
//			}
//		} finally {
//			//dont forget to clean up!
//			if(res != null) {
//				try { 
//					((EXistResource)res).freeResources();
//				} catch(XMLDBException e) {
//					e.printStackTrace();
//				}
//			}
//			if(col != null) {
//				try { col.close(); 
//				
//				} catch(XMLDBException xe) {
//					xe.printStackTrace();
//				}
//			}
//		}
	}

}
}
