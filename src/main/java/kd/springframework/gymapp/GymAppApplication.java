package kd.springframework.gymapp;

import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import kd.springframework.gymapp.services.EquipmentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.bson.Document;

@SpringBootApplication
public class GymAppApplication {


	public static void main(String[] args) {

		SpringApplication.run(GymAppApplication.class, args);

	}

}
