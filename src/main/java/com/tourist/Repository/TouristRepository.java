package com.tourist.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourist.Entity.Tourist;

@Repository
public interface TouristRepository extends JpaRepository<Tourist,Long>{

	List<Tourist> findByfirstNameOrderByFirstNameDesc(String firstName);

	
}
