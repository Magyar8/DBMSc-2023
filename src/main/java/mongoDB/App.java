package mongoDB;

import static com.mongodb.client.model.Filters.eq;

import java.util.Scanner;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class App {
	
	public static void main(String[] args) {
	
		MongoClientURI uri = new MongoClientURI("mongodb+srv://AE18RS:ae18rs_U9@cluster0.9gnjphs.mongodb.net/?retryWrites=true&w=majority");
		MongoClient mongoClient = new MongoClient(uri);
		//MongoClient mongoClient = new MongoClient("cluster0-shard-00-02.8fdri.mongodb.net", 27017);
		MongoDatabase mongoDB = mongoClient.getDatabase("MongoDB_API");
		MongoCollection<Document> hallgatok = mongoDB.getCollection("hallgatok");
		MongoCollection<Document> kepzesek = mongoDB.getCollection("kepzesek");
		MongoCollection<Document> hallgatoKepzes = mongoDB.getCollection("hallgatoKepzes");
		
		Service service = new Service();
		Hallgato hallgato = new Hallgato();
		Kepzes kepzes = new Kepzes();
		HallgatoKepzes hallgatoKepzes1 = new HallgatoKepzes();
		
		// delete all init
		hallgato.deleteHallgatoInit(mongoDB, "hallgatok");
		kepzes.deleteKepzesInit(mongoDB, "kepzesek");
		hallgatoKepzes1.deleteHallgatoKepzesInit(mongoDB, "hallgatoKepzes");
		
		hallgato.initHallagto(hallgatok);
		kepzes.initKepzes(kepzesek);
		hallgatoKepzes1.initHallgatoKepzes(hallgatoKepzes);
		
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			System.out.println("Válasszon műveletet!");
			System.out.println("1\tHallgató felvitele");
			System.out.println("2\tHallgató nevének módosítása");
			System.out.println("3\tHallgató lakcíme módosítása");
			System.out.println("4\tHallgató  törlése");
			System.out.println("5\tKépzés felvitele");
			System.out.println("6\tKépzés munkarendjánek módosítása");
			System.out.println("7\tKépzés finanszírozása módosítása");
			System.out.println("8\tKépzés törlése");
			System.out.println("9\tÖsszes hallgató lekérdezésee");
			System.out.println("10\tÖsszes képzés lekérdezése");
			System.out.println("11\tMegadott hallgatóhoz tartozó képzés ID-ja");
			System.out.println("12\tHallgató és képzés összerendelése");
			System.out.println("0\tkilépés");
			input = scanner.nextInt();

			switch(input) {
			case 0: {
				input = 0;
				break;
			}
			
			case 1: {
				// Hallgató felvitele
				Document document = new Document();
				System.out.println("Hallgató ID-ja:");
				document.put("_id", scanner.next());
				System.out.println("Hallgató neve:");
				document.put("name", scanner.next());
				System.out.println("Hallgató születési dátuma:");
				document.put("birthDate", scanner.next());
				System.out.println("Hallgató lakcíme:");
				document.put("address", scanner.next());
				System.out.println("Hallgató neme:");
				document.put("gender", scanner.next());
				service.insert(hallgatok, document);
				System.out.println("Hallgató tárolva.");
				break;
			}
			
			case 2: {
				// Hallgató nevének módosítása
				System.out.println("Hallgató ID-ja:");
				String id = scanner.next();
				System.out.println("Hallgató új neve:");
				String name = scanner.next();
				service.update(mongoDB, "hallgatok", id, "name", name);
				System.out.println("Hallgató neve módosítva.");	
				break;
			}
			
			case 3: {
				// Hallgató lakcíme módosítása
				System.out.println("Hallgató ID-ja:");
				String id = scanner.next();
				System.out.println("Hallgató új lakcíme:");
				String address = scanner.next();
				service.update(mongoDB, "hallgatok", id, "address", address);
				System.out.println("Hallgató lakcíme módosítva.");	
				break;
			}
			
			case 4: {
				// Hallgató  törlése
				System.out.println("Törlendő hallgató ID-ja:");
				String id = scanner.next();
				service.deleteById(mongoDB, "hallgatok", id);
				System.out.println("Törölve.");
				break;
			}
			
			case 5: {
				// Képzés felvitele
				Document document = new Document();
				System.out.println("Képzés ID-ja:");
				document.put("_id", scanner.next());
				System.out.println("Képzés neve:");
				document.put("name", scanner.next());
				System.out.println("Képzéshez tartozó kar:");
				document.put("faculty", scanner.next());
				System.out.println("Képzés munkarendje:");
				document.put("category", scanner.next());
				System.out.println("Képzés szintje:");
				document.put("level", scanner.next());
				System.out.println("Képzés finanszírozása:");
				document.put("financial", scanner.next());
				service.insert(kepzesek, document);
				System.out.println("Képzés tárolva.");
				break;
			}
			
			case 6: {
				// Képzés munkarendjánek módosítása
				System.out.println("Képzés ID-ja:");
				String id = scanner.next();
				System.out.println("Képzés új munkarendje:");
				String category = scanner.next();
				service.update(mongoDB, "kepzesek", id, "category", category);
				System.out.println("Képzés munkarendje módosítva.");	
				break;
			}
			
			case 7: {
				// Képzés finanszírozása módosítása
				System.out.println("Képzés ID-ja:");
				String id = scanner.next();
				System.out.println("Képzés új finanszírozása:");
				String financial = scanner.next();
				service.update(mongoDB, "kepzesek", id, "financial", financial);
				System.out.println("Képzés finanszírozása módosítva.");	
				break;
			}
			
			case 8: {
				// Képzés törlése
				System.out.println("Törlendő képzés ID-ja:");
				String id = scanner.next();
				service.deleteById(mongoDB, "kepzesek", id);
				System.out.println("Törölve.");
				break;
			}
			
			case 9: {
				// Összes hallgató lekérdezése
				System.out.println("Hallgatók listája:");
				for(Document document : service.selectAll(mongoDB, "hallgatok").find()) {
					System.out.println(document);
				}
				break;
			}
			
			case 10: {
				// Összes képzés lekérdezése
				System.out.println("Képzések listája");
				for(Document document : service.selectAll(mongoDB, "kepzesek").find()) {
					System.out.println(document);
				}
				break;	
			}
			
			case 11: {
				// Megadott hallgatóhoz tartozó képzések
				System.out.println("Hallgató ID-ja:");
				String hallgatoID = scanner.next();
				for(Document document : service.selectAll(mongoDB, "hallgatoKepzes").find(eq("hallgatoID", hallgatoID))) {
					System.out.println(document);	
				}
				break;
			}
			
			case 12: {
				// Hallgató és képzés összerendelése
				Document document = new Document();
				System.out.println("összerendelés új ID-ja:");
				document.put("_id", scanner.next());
				System.out.println("Adja meg a hallgató ID-ját, akit képzéshez szeretne rendelni:");
				String hallgatoID = scanner.next();
				document.put("hallgatoID", hallgatoID);
				System.out.println("Adja meg a képzés ID-ját, amelyhez " + hallgatoID + " ID-jú hallagtót-t szeretné rendelni.");
				String kepzesID = scanner.next();
				document.put("kepzesID", kepzesID);
				service.insert(hallgatoKepzes, document);
				System.out.println("összerendelve.");
				break;
			}
			default: {
				System.out.println("Nem létező menüpont.");					
				break;
			}
		}
			
		} while(input != 0);
		
		// delete all init
		hallgato.deleteHallgatoInit(mongoDB, "hallgatok");
		kepzes.deleteKepzesInit(mongoDB, "kepzesek");
		hallgatoKepzes1.deleteHallgatoKepzesInit(mongoDB, "hallgatoKepzes");
		
		scanner.close();
		
		mongoClient.close();
			
	}

}
