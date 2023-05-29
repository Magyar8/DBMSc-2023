package mongoDB;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Hallgato {
	
	private String hallgatoID;
	private String name;
	private String birthDate;
	private String address;
	private String gender;

	Service service = new Service();
	
	public String getHallgatoID() {
		return hallgatoID;
	}

	public void setHallgatoID(String hallgatoID) {
		this.hallgatoID = hallgatoID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	void initHallagto(MongoCollection<Document> collection) {
		Document hallgato0 = new Document();
		hallgato0.put("_id", "100");
		hallgato0.put("name", "Kovács Márton");
		hallgato0.put("birthDate", "2000.01.01");
		hallgato0.put("address", "Budapest");
		hallgato0.put("gender", "Férfi");
		service.insert(collection, hallgato0);
		
		Document hallgato1 = new Document();
		hallgato1.put("_id", "101");
		hallgato1.put("name", "Nagy Emese");
		hallgato1.put("birthDate", "2000.02.02");
		hallgato1.put("address", "Miskolc");
		hallgato1.put("gender", "Nő");
		service.insert(collection, hallgato1);
		
		Document hallgato2 = new Document();
		hallgato2.put("_id", "102");
		hallgato2.put("name", "Szabó Gábor");
		hallgato2.put("birthDate", "2000.03.03");
		hallgato2.put("address", "Eger");
		hallgato2.put("gender", "Férfi");
		service.insert(collection, hallgato2);
		
		Document hallgato3 = new Document();
		hallgato3.put("_id", "103");
		hallgato3.put("name", "Tóth Anna");
		hallgato3.put("birthDate", "2000.04.04");
		hallgato3.put("address", "Kazincbarcika");
		hallgato3.put("gender", "Nő");
		service.insert(collection, hallgato3);
		
		Document hallgato4 = new Document();
		hallgato4.put("_id", "104");
		hallgato4.put("name", "Kiss Bence");
		hallgato4.put("birthDate", "2000.05.05");
		hallgato4.put("address", "Bükkaranyos");
		hallgato4.put("gender", "Férfi");
		service.insert(collection, hallgato4);
		
		Document hallgato5 = new Document();
		hallgato5.put("_id", "105");
		hallgato5.put("name", "Horváth Viktória");
		hallgato5.put("birthDate", "2000.06.06");
		hallgato5.put("address", "Miskolc");
		hallgato5.put("gender", "Nő");
		service.insert(collection, hallgato5);
		
		Document hallgato6 = new Document();
		hallgato6.put("_id", "106");
		hallgato6.put("name", "Molnár Dávid");
		hallgato6.put("birthDate", "2000.07.07");
		hallgato6.put("address", "Debrecen");
		hallgato6.put("gender", "Férfi");
		service.insert(collection, hallgato6);
		
		Document hallgato7 = new Document();
		hallgato7.put("_id", "107");
		hallgato7.put("name", "Varga Eszter");
		hallgato7.put("birthDate", "2000.08.08");
		hallgato7.put("address", "Szikszó");
		hallgato7.put("gender", "Nő");
		service.insert(collection, hallgato7);
		
		Document hallgato8 = new Document();
		hallgato8.put("_id", "108");
		hallgato8.put("name", "Farkas Balázs");
		hallgato8.put("birthDate", "2000.09.09");
		hallgato8.put("address", "Debrecen");
		hallgato8.put("gender", "Férfi");
		service.insert(collection, hallgato8);
		
		Document hallgato9 = new Document();
		hallgato9.put("_id", "109");
		hallgato9.put("name", "Lakatos Réka");
		hallgato9.put("birthDate", "2000.10.10");
		hallgato9.put("address", "Ózd");
		hallgato9.put("gender", "Nő");
		service.insert(collection, hallgato9);
		
		Document hallgato10 = new Document();
		hallgato10.put("_id", "110");
		hallgato10.put("name", "Újvári Petra");
		hallgato10.put("birthDate", "2000.11.11");
		hallgato10.put("address", "Budapest");
		hallgato10.put("gender", "Nő");
		service.insert(collection, hallgato10);

	}
	
	void deleteHallgatoInit(MongoDatabase mongoDB, String collection) {
		service.deleteById(mongoDB, collection, "100");
		service.deleteById(mongoDB, collection, "101");
		service.deleteById(mongoDB, collection, "102");
		service.deleteById(mongoDB, collection, "103");
		service.deleteById(mongoDB, collection, "104");
		service.deleteById(mongoDB, collection, "105");
		service.deleteById(mongoDB, collection, "106");
		service.deleteById(mongoDB, collection, "107");
		service.deleteById(mongoDB, collection, "108");
		service.deleteById(mongoDB, collection, "109");
		service.deleteById(mongoDB, collection, "110");
		
	}
	
}
