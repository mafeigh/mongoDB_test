package com.test;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;
import java.util.Date;

public class MongoDB {

	public static void main(String[] args) {
		try {
			MongoClient mongoClient;
			mongoClient = new MongoClient(new ServerAddress("localhost", 27017), Arrays.asList(MongoCredential.createCredential("test", "test", "pass".toCharArray())));
			MongoDatabase db = mongoClient.getDatabase("test");
			MongoCollection<Document> mongoCollection = db.getCollection("User");
			Document doc = new Document();
			doc.append("name", "z4");
			doc.append("age", 13);
			doc.append("time", new Date());
			mongoCollection.insertOne(doc);
			// mongoCollection.updateOne(new Document("name", "z4"), new Document("$set", new Document("age", "24")).append("$currentDate", new Document("lastModified", true)));
			FindIterable<Document> iterable = mongoCollection.find();
			iterable.forEach(new Block<Document>() {
				@Override
				public void apply(final Document document) {
					System.out.println(document);
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
