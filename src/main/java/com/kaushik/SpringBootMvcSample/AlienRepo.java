package com.kaushik.SpringBootMvcSample;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kaushik.SpringBootMvcSample.Model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

	//List<Alien> findByLocation(String Name);
    
	@Query("from Alien where Name=:name")
	List<Alien> find(@Param("name") String Aname);

}
