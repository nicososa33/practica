//package uy.gub.agesic.grep.core.controllers;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import uy.gub.agesic.grep.core.requests.PersonaFisicaRequest;
//import uy.gub.agesic.grep.core.responses.PersonaFisicaResponse;
//import uy.gub.agesic.grep.core.services.impl.PersonaFisicaServices;
//import uy.gub.agesic.grep.core.utils.FactoryObjects;
//
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(controllers = PersonaFisicaController.class)
//public class PersonaFisicaControllerTest extends ControllersTestBase<PersonaFisicaResponse, PersonaFisicaRequest, Long, PersonaFisicaServices> {
//
//    @MockBean
//    private PersonaFisicaServices paisServices;
//
//    private String path = "/personaFisica/";
//    
//    /************************************************************************************************/
//    /******************************  REQUEST  ----->   HTTP  ****************************************/
//    /************************************************************************************************/
//    /********************************* incluye validaciones *****************************************/
//    /************************************************************************************************/
//    
////    @Test
////    public void get1Ok() throws Exception {
////	   super.get1Ok(path+"/{id}", Long.valueOf(1));
////    }
////    
////    @Test
////    public void list1Ok() throws Exception {
////    	super.list1Ok(path);
////    }
////
////    @Test
////    public void create1Ok() throws Exception {
////    	super.create1Ok(path,FactoryObjects.generarPersonaFisicaRequest1(), status().isOk());
////    }
////    
////    @Test
////    public void update1Ok() throws Exception {
////    	super.update1Ok(path, FactoryObjects.generarPersonaFisicaRequest1(), Long.valueOf(1), status().isOk());
////    }
////    
////    @Test
////    public void delete1Ok() throws Exception {
////    	super.delete1Ok(path+"/{id}",Long.valueOf(1));
////    }
////
////    /************************************************************************************************/
////    /******************************  REQUEST  ----->   HTTP  ****************************************/
////    /************************************************************************************************/
////    /************************************ invalidos *************************************************/
////    /************************************************************************************************/
////    
////    @Test
////    public void create1Fail() throws Exception {
////    	PersonaFisicaRequest paisRequest = FactoryObjects.generarPersonaFisicaRequest1();
////    	paisRequest.setCorreoElectronico("");//Not blank
////    	super.create1Ok(path, paisRequest, status().isBadRequest());
////    }
////    
////    @Test
////    public void update1Fail() throws Exception {
////    	PersonaFisicaRequest paisRequest = FactoryObjects.generarPersonaFisicaRequest1();
////    	paisRequest.setCorreoElectronico("");//Not blank
////    	super.update1Ok(path, paisRequest, Long.valueOf(1), status().isBadRequest());
////    }
////    
////    /************************************************************************************************/
////    /*************************************  validos  ************************************************/
////    /************************************************************************************************/
////    /******************************  HTTTP  ----->   LOGICA  ****************************************/
////    /************************************************************************************************/
////    /************************************************************************************************/
////    
////    
////    @Test
////    public void get2Ok() throws Exception {        
////        super.get2Ok(path+"/{id}", Long.valueOf(1), FactoryObjects.generarPersonaFisicaRequest1(), FactoryObjects.generarPersonaFisicaResponse1(), paisServices);
////        
////    }
////    
////    @Test
////    public void list2Ok() throws Exception {
////    	super.list2Ok(path, FactoryObjects.generarPersonaFisicaRequest1(), FactoryObjects.generarPersonaFisicaRequest2(), FactoryObjects.generarPersonaFisicaResponse1(), FactoryObjects.generarPersonaFisicaResponse2(), paisServices);
////    }
////    
////    @Test
////    public void create2Ok() throws Exception {
////    	super.create2Ok(path, FactoryObjects.generarPersonaFisicaRequest2(), paisServices, PersonaFisicaRequest.class);    	
////    }
////    
////    @Test
////    public void update2Ok() throws Exception {
////    	super.update2Ok(path, FactoryObjects.generarPersonaFisicaRequest2(), Long.valueOf(2), paisServices, PersonaFisicaRequest.class);    
////    }
////    
////    @Test
////    public void delete2Ok() throws Exception {
////    	super.delete2WithIdOk(path+"/{id}", Long.valueOf(1), paisServices, Long.class);
////    }
//      
//}
