package org.example;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.MongoClients.create;

public class Connection {

    public static void main(String[] args) {
        String connectionString = System.getProperty("mongodb+srv://oleksiy_khudoshyn:Igibu777@cluster0.or7u1dm.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");
        try (MongoClient mongoClient = create(connectionString)) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println(db.toJson()));
        }
    }
}