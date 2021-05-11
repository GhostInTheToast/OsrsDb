package com.mahmood.OsrsDb;

import com.mahmood.OsrsDb.Item.ItemIdPOJO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class OsrsDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsrsDbApplication.class, args);
	}

	@GetMapping
	public List<ItemIdPOJO> hello() {
	    return List.of(new ItemIdPOJO(1,"fire rune"));
    }

}
