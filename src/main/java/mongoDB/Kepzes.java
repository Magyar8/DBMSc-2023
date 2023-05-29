package mongoDB;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Kepzes {
	
	private String kepzesID;
	private String name;
	private String faculty;
	private String category;
	private String level;
	private String financial;
	
	
	Service service = new Service();

	public String getKepzesID() {
		return kepzesID;
	}

	public void setKepzesID(String kepzesID) {
		this.kepzesID = kepzesID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getFinancial() {
		return financial;
	}

	public void setFinancial(String financial) {
		this.financial = financial;
	}

	void initKepzes(MongoCollection<Document> collection) {
		Document kepzes0 = new Document();
		kepzes0.put("_id", "100");
		kepzes0.put("name", "Energetikai mérnöki");
		kepzes0.put("faculty", "Gépészmérnöki és Informatikai Kar");
		kepzes0.put("category", "nappali");
		kepzes0.put("level", "BSc");
		kepzes0.put("financial", "allami");
		service.insert(collection, kepzes0);
		
		Document kepzes1 = new Document();
		kepzes1.put("_id", "101");
		kepzes1.put("name", "Gazdaságinformatikus");
		kepzes1.put("faculty", "Gépészmérnöki és Informatikai Kar");
		kepzes1.put("category", "nappali");
		kepzes1.put("level", "BSc");
		kepzes1.put("financial", "allami");
		service.insert(collection, kepzes1);
		
		Document kepzes2 = new Document();
		kepzes2.put("_id", "102");
		kepzes2.put("name", "Gépészmérnöki");
		kepzes2.put("faculty", "Gépészmérnöki és Informatikai Kar");
		kepzes2.put("category", "nappali");
		kepzes2.put("level", "BSc");
		kepzes2.put("financial", "allami");
		service.insert(collection, kepzes2);
		
		Document kepzes3 = new Document();
		kepzes3.put("_id", "103");
		kepzes3.put("name", "Ipari termék- és formatervező mérnöki");
		kepzes3.put("faculty", "Gépészmérnöki és Informatikai Kar");
		kepzes3.put("category", "nappali");
		kepzes3.put("level", "BSc");
		kepzes3.put("financial", "allami");
		service.insert(collection, kepzes3);
		
		Document kepzes4 = new Document();
		kepzes4.put("_id", "104");
		kepzes4.put("name", "Járműmérnöki");
		kepzes4.put("faculty", "Gépészmérnöki és Informatikai Kar");
		kepzes4.put("category", "nappali");
		kepzes4.put("level", "BSc");
		kepzes4.put("financial", "allami");
		service.insert(collection, kepzes4);
		
		Document kepzes5 = new Document();
		kepzes5.put("_id", "105");
		kepzes5.put("name", "Logisztikai mérnöki");
		kepzes5.put("faculty", "Gépészmérnöki és Informatikai Kar");
		kepzes5.put("category", "nappali");
		kepzes5.put("level", "BSc");
		kepzes5.put("financial", "allami");
		service.insert(collection, kepzes5);
		
		Document kepzes6 = new Document();
		kepzes6.put("_id", "106");
		kepzes6.put("name", "Mechatronikai mérnöki");
		kepzes6.put("faculty", "Gépészmérnöki és Informatikai Kar");
		kepzes6.put("category", "nappali");
		kepzes6.put("level", "BSc");
		kepzes6.put("financial", "allami");
		service.insert(collection, kepzes6);
		
		Document kepzes7 = new Document();
		kepzes7.put("_id", "107");
		kepzes7.put("name", "Mérnökinformatikus");
		kepzes7.put("faculty", "Gépészmérnöki és Informatikai Kar");
		kepzes7.put("category", "nappali");
		kepzes7.put("level", "BSc");
		kepzes7.put("financial", "allami");
		service.insert(collection, kepzes7);
		
		Document kepzes8 = new Document();
		kepzes8.put("_id", "108");
		kepzes8.put("name", "Mérnökinformatikus");
		kepzes8.put("faculty", "Gépészmérnöki és Informatikai Kar");
		kepzes8.put("category", "nappali");
		kepzes8.put("level", "BSc");
		kepzes8.put("financial", "allami");
		service.insert(collection, kepzes8);
		
		Document kepzes9 = new Document();
		kepzes9.put("_id", "109");
		kepzes9.put("name", "Műszaki menedzser");
		kepzes9.put("faculty", "Gépészmérnöki és Informatikai Kar");
		kepzes9.put("category", "nappali");
		kepzes9.put("level", "BSc");
		kepzes9.put("financial", "allami");
		service.insert(collection, kepzes9);
		
		Document kepzes10 = new Document();
		kepzes10.put("_id", "110");
		kepzes10.put("name", "Programtervező informatikus");
		kepzes10.put("faculty", "Gépészmérnöki és Informatikai Kar");
		kepzes10.put("category", "nappali");
		kepzes10.put("level", "BSc");
		kepzes10.put("financial", "allami");
		service.insert(collection, kepzes10);
		
		Document kepzes11 = new Document();
		kepzes11.put("_id", "111");
		kepzes11.put("name", "Villamosmérnöki");
		kepzes11.put("faculty", "Gépészmérnöki és Informatikai Kar");
		kepzes11.put("category", "nappali");
		kepzes11.put("level", "BSc");
		kepzes11.put("financial", "allami");
		service.insert(collection, kepzes11);
		
		
	}
	 
	void deleteKepzesInit(MongoDatabase mongoDB, String collection) {
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
			service.deleteById(mongoDB, collection, "111");
		}

}
