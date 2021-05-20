
package com.cg.fleetmanagement;

import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.cg.fleetmanagement.entity.Customer;
import com.cg.fleetmanagement.entity.Opportunity;
import com.cg.fleetmanagement.service.IntOpportunityService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class OpportunityControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Mock
	private IntOpportunityService userServiceMock;
	
	@Test
	@Ignore
	public void getAllOpportunities_thenStatus200() throws Exception{
		mvc.perform(get("http://localhost:5000/opportunity")
		.contentType(MediaType.APPLICATION_JSON))
		.andExpect (status().isOk())
		.andExpect(jsonPath("$[0].opportunityId", is(22)));
	}
	
	
//	@Test
//	@Ignore
//	public void test_get_by_id_fail_404_not_found() throws Exception {
//		mvc.perform(get("http://localhost:5000/opportunity/{opportunitId}", 20)).andExpect(status().isNotFound());
//	}
	
	@Test
	public void test_createOpportunity_thenstatus201() throws Exception {
//		Opportunity course = new Opportunity();
		Opportunity oppo = getMockUsers("create").get(0);
		when(userServiceMock.insertOpportunity(oppo)).thenReturn(oppo);

		mvc.perform(post("/opportunity/opportunity")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(oppo)))
//				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isCreated());
//				.andExpect(jsonPath("$[0].opportunityId", is(7)));
//				.andExpect(header().string("location", containsString("http://localhost/opportunity/opportunity/{opportunityId}")));

	}
	
	@Test
	public void test_delete_oppo_success() throws Exception {
		int oppId = 7;
		mvc.perform(delete("/opportunity/{opportunityId}", oppId))
		.andExpect(status().is2xxSuccessful());
//		.andExpect(header().string("location", Matchers.equalToIgnoringCase("http://localhost/courses/" + courseId)));

	}
	
//	@Test
//	public void test_update_opportunity_success() throws Exception {
//		
//		Opportunity up = new Opportunity();
////		Opportunity oppo = getMockUsers("create").get(0);
//		up.setOpportunityStatus("won");
//		
//		
//		mvc.perform(patch("/opportunity/opportunityDescription/{opportunityId}")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(asJsonString(oppo)))
//				.andExpect(status().isCreated());
//	}
	
	List<Opportunity> getMockUsers(String condition)
	{
//		Opportunity obj1 = new Opportunity();
//		Customer cus1 = new Customer();
//		cus1.setCustomerId(32);
//		cus1.setCustomerName("dell");
		
//		obj1.setOpportunityId(22);
//		obj1.setOpportunityName("laptops");
//		obj1.setOpportunityStatus("active");
//		obj1.setOpportunityDescription("bying processors");
//		obj1.setOpportunity_Date(null);
//		obj1.setCustomer(cus1);
		
		Opportunity obj2 = new Opportunity();
		Customer cus2 = new Customer();
		cus2.setCustomerId(19);
		cus2.setCustomerName("godrej");
		
		obj2.setOpportunityId(7);
		obj2.setOpportunityName("almirah");
		obj2.setOpportunityStatus("active");
		obj2.setOpportunityDescription("bying almirah");
		obj2.setOpportunity_Date(null);
		obj2.setCustomer(cus2);
		
		 if(condition == "Create")
		 {
			 return Arrays.asList(obj2);
		 }
		 else if(condition == "Update")
		 {
			 return Arrays.asList(obj2);
		 }
//		 else if(condition == "Delete")
//		 {
//			 return Arrays.asList(userDto);
//		 }
		 else
		 {
			 //returns all users
			 return Arrays.asList(obj2);
		 }
	}
	
    
	 static String asJsonString(final Object obj) {
	        try {
	            return new ObjectMapper().writeValueAsString(obj);
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }
}
