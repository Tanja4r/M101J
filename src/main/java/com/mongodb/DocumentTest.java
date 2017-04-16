package com.mongodb;

import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.Arrays;
import java.util.Date;

import static com.mongodb.Helpers.printJson;

/**
 * Created by USER on 4/16/2017.
 */
public class DocumentTest {
    public static void main(String[] args) {
        Document document = new Document()
                .append("str", "MongoDB Hello")
                .append ("int",42)
                .append("double",1.2)
                .append("null",null)
                .append("objectId", new ObjectId())
                .append("date", new Date())
                .append("list", Arrays.asList(1,2,3));

        printJson (document);
    }
}
