//package uy.gub.agesic.grep.core.controllers;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.List;
//
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
//import org.mockito.ArgumentCaptor;
//import org.mockito.BDDMockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.ResultMatcher;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import uy.gub.agesic.grep.core.services.CrudServices;
//
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(controllers = PaisController.class)
//public class ControllersTestBase<Response, Request, ID, Service> {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    /************************************************************************************************/
//    /******************************  REQUEST  ----->   HTTP  ****************************************/
//    /************************************************************************************************/
//    /********************************* incluye validaciones *****************************************/
//    /************************************************************************************************/
//    
//    public void get1Ok(String path, ID id) throws Exception {
//	   mockMvc.perform(get(path,id)
//	        .contentType("application/json"))
//	        .andExpect(status().isOk());
//    }
//    
//    public void list1Ok(String path) throws Exception {
//    	mockMvc.perform(get(path)
//    			.contentType("application/json"))
//    	.andExpect(status().isOk());
//    }    
//    
//    public void create1Ok(String path, Request request, ResultMatcher resultMatcher) throws Exception {    	
//    	mockMvc.perform(post(path)
//    			.contentType("application/json")
//    			.content(objectMapper.writeValueAsString(request)))
//    	.andExpect(resultMatcher);
//    }
//    
//    public void update1Ok(String path, Request request, Long id, ResultMatcher resultMatcher) throws Exception {
//    	mockMvc.perform(put(path + "/" + id)
//    			.contentType("application/json")
//    			.content(objectMapper.writeValueAsString(request)))
//    	.andExpect(resultMatcher);
//    }
//    
//    public void delete1Ok(String path, ID id) throws Exception {
//    	mockMvc.perform(delete(path,id)
//    			.contentType("application/json"))
//    	.andExpect(status().isOk());
//    }    
//    
//
//    /************************************************************************************************/
//    /*************************************  validos  ************************************************/
//    /************************************************************************************************/
//    /******************************  HTTTP  ----->   LOGICA  ****************************************/
//    /************************************************************************************************/
//    /************************************************************************************************/
//    
//	@SuppressWarnings("unchecked")
//    public void get2Ok(String path, ID id, Request request, Response response, Service services) throws Exception {
//		BDDMockito.when(((CrudServices<Request, Response, ID>)services).get(id)).thenReturn(response);
//		MvcResult mvcResult = mockMvc.perform(get(path,id)
//					.contentType("application/json")
//					.content(objectMapper.writeValueAsString(request)))
//					.andReturn();
//		String exceptedResponse = objectMapper.writeValueAsString(response);
//		String actualResponseBody = mvcResult.getResponse().getContentAsString();
//		assertThat(actualResponseBody).isEqualToIgnoringWhitespace(exceptedResponse);
//    }    
//    
//    @SuppressWarnings("unchecked")
//    public void list2Ok(String path, Request request1, Request request2, Response response1, Response response2, Service services) throws Exception {
//    	List<Response> responses = List.of(response1, response2);
//
//		BDDMockito.when(((CrudServices<Request, Response, ID>)services).list()).thenReturn(responses);
//    	
//    	MvcResult mvcResult = mockMvc.perform(get(path)
//    			.contentType("application/json"))
//    			.andReturn();
//    	
//    	String exceptedResponse = objectMapper.writeValueAsString(responses);
//    	String actualResponseBody = mvcResult.getResponse().getContentAsString();
//    	assertThat(actualResponseBody).isEqualToIgnoringWhitespace(exceptedResponse);
//    }
//    
//
//    @SuppressWarnings("unchecked")
//    public void create2Ok(String path, Request request, Service services, Class<Request> clase) throws Exception {
//    	mockMvc.perform(post(path)
//    			.contentType("application/json")
//    			.content(objectMapper.writeValueAsString(request)))
//    	.andExpect(status().isOk());
//    	
//    	  ArgumentCaptor<Request> userCaptor = ArgumentCaptor.forClass(clase);
//    	  BDDMockito.verify(((CrudServices<Request, Response, ID>)services), times(1)).create(userCaptor.capture());
//    	  
//    	  assertEquals(userCaptor.getValue(), request);
//    }
//
//    @SuppressWarnings("unchecked")
//    public void update2Ok(String path, Request request, Long id, Service services, Class<Request> clase) throws Exception {
//    	mockMvc.perform(put(path + "/" + id)
//    			.contentType("application/json")
//    			.content(objectMapper.writeValueAsString(request)))
//    	.andExpect(status().isOk());
//    	
//    	  ArgumentCaptor<Request> userCaptor = ArgumentCaptor.forClass(clase);
//    	  ArgumentCaptor<Long> longCaptor = ArgumentCaptor.forClass(Long.class);
//    	  BDDMockito.verify(((CrudServices<Request, Response, ID>)services), times(1)).update(userCaptor.capture(), longCaptor.capture());
//    	  
//    	  assertEquals(longCaptor.getValue(), id);
//    	  assertEquals(userCaptor.getValue(), request);
//    }
//    
//    @SuppressWarnings("unchecked")
//    public void delete2WithIdOk(String path, ID id, Service services, Class<ID> clase) throws Exception {
//    	mockMvc.perform(delete(path,id)
//    			.contentType("application/json"))
//    			.andExpect(status().isOk());
//    	
//    	ArgumentCaptor<ID> userCaptor = ArgumentCaptor.forClass(clase);
//    	verify(((CrudServices<Request, Response, ID>)services), times(1)).delete(userCaptor.capture());
//    	assertThat(userCaptor.getValue().equals(id));    	
//    }    
//    
//}
