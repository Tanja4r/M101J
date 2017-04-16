package com.mongodb;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Created by USER on 4/16/2017.
 */
public class InsertTest {
    public static void main(String[] args) {
        MongoClient client = new MongoClient("localhost", 27017);

        MongoDatabase db = client.getDatabase("course").withReadPreference(ReadPreference.secondary());
        MongoCollection coll = db.getCollection("testInsert");
        coll.drop();
        Document smith = new Document("name", "Smith")
                .append("age", 42)
                .append("profession", "programmer");
        coll.insertOne(smith);

    }
}
