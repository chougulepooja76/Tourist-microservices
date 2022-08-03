package com.tourist;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tourist.Entity.Tourist;
import com.tourist.Repository.TouristRepository;

@SpringBootTest
class TouristApplicationTests {
	
	@Autowired
	TouristRepository tRepo;

	
	@Test
	public void testCreate()
	{
		Tourist t=new Tourist();
		t.setId(6L);
		t.setFirstName("Mansi");
		t.setLastName("Gadgil");
		t.setGender("Female");
		t.setAge(26);
		t.setFromPlace("Punjab");
		t.setNumberOfDaysVisits(3);
		
		tRepo.save(t);
		assertNotNull(tRepo.findById(6L).get());
		
	}

	
	
	private void assertNotNull(Tourist tourist) {
		// TODO Auto-generated method stub
		
	}



	@Test
	public void testReadAll()
	{
		List<Tourist> list=tRepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	
	
}
