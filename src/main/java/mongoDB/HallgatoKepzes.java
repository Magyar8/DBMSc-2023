package mongoDB;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class HallgatoKepzes {
	
	private String hkID;
	private String hallgatoID;
	private String kepzesID;

	Service service = new Service();

	
	public String getHkID() {
		return hkID;
	}

	public void setHkID(String hkID) {
		this.hkID = hkID;
	}

	public String getHallgatoID() {
		return hallgatoID;
	}

	public void setHallgatoID(String hallgatoID) {
		this.hallgatoID = hallgatoID;
	}

	public String getKepzesID() {
		return kepzesID;
	}

	public void setKepzesID(String kepzesID) {
		this.kepzesID = kepzesID;
	}

	void initHallgatoKepzes(MongoCollection<Document> collection) {
		Document hk0 = new Document();
		hk0.put("_id", "0");
		hk0.put("hallgatoID", "100");
		hk0.put("kepzesID", "100");
		service.insert(collection, hk0);
		
		Document hk1 = new Document();
		hk1.put("_id", "1");
		hk1.put("hallgatoID", "101");
		hk1.put("kepzesID", "101");
		service.insert(collection, hk1);
		
		Document hk2 = new Document();
		hk2.put("_id", "2");
		hk2.put("hallgatoID", "102");
		hk2.put("kepzesID", "102");
		service.insert(collection, hk2);
		
		Document hk3 = new Document();
		hk3.put("_id", "3");
		hk3.put("hallgatoID", "103");
		hk3.put("kepzesID", "103");
		service.insert(collection, hk3);
		
		Document hk4 = new Document();
		hk4.put("_id", "4");
		hk4.put("hallgatoID", "104");
		hk4.put("kepzesID", "104");
		service.insert(collection, hk4);
		
		Document hk5 = new Document();
		hk5.put("_id", "5");
		hk5.put("hallgatoID", "105");
		hk5.put("kepzesID", "105");
		service.insert(collection, hk5);
		
		Document hk6 = new Document();
		hk6.put("_id", "6");
		hk6.put("hallgatoID", "106");
		hk6.put("kepzesID", "106");
		service.insert(collection, hk6);
		
		Document hk7 = new Document();
		hk7.put("_id", "7");
		hk7.put("hallgatoID", "107");
		hk7.put("kepzesID", "107");
		service.insert(collection, hk7);

		Document hk8 = new Document();
		hk8.put("_id", "8");
		hk8.put("hallgatoID", "108");
		hk8.put("kepzesID", "108");
		service.insert(collection, hk8);
		
		Document hk9 = new Document();
		hk9.put("_id", "9");
		hk9.put("hallgatoID", "109");
		hk9.put("kepzesID", "109");
		service.insert(collection, hk9);
		
		Document hk10 = new Document();
		hk10.put("_id", "10");
		hk10.put("hallgatoID", "110");
		hk10.put("kepzesID", "110");
		service.insert(collection, hk10);
		
	}
	 
	void deleteHallgatoKepzesInit(MongoDatabase db, String collection) {
			service.deleteById(db, collection, "0");
			service.deleteById(db, collection, "1");
			service.deleteById(db, collection, "2");
			service.deleteById(db, collection, "3");
			service.deleteById(db, collection, "4");
			service.deleteById(db, collection, "5");
			service.deleteById(db, collection, "6");
			service.deleteById(db, collection, "7");
			service.deleteById(db, collection, "8");
			service.deleteById(db, collection, "9");
			service.deleteById(db, collection, "10");

		}
	
}
	
