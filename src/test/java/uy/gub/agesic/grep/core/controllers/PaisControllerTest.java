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
//import uy.gub.agesic.grep.core.requests.PaisRequest;
//import uy.gub.agesic.grep.core.responses.PaisResponse;
//import uy.gub.agesic.grep.core.services.impl.PaisServices;
//import uy.gub.agesic.grep.core.utils.FactoryObjects;
//
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(controllers = PaisController.class)
//public class PaisControllerTest extends ControllersTestBase<PaisResponse, PaisRequest, Long, PaisServices> {
//
//    @MockBean
//    private PaisServices paisServices;
//
//    /************************************************************************************************/
//    /******************************  REQUEST  ----->   HTTP  ****************************************/
//    /************************************************************************************************/
//    /********************************* incluye validaciones *****************************************/
//    /************************************************************************************************/
////    
////    @Test
////    public void get1Ok() throws Exception {
////	   super.get1Ok("/pais/{id}", Long.valueOf(1));
////    }
////    
////    @Test
////    public void list1Ok() throws Exception {
////    	super.list1Ok("/pais/");
////    }
////
////    @Test
////    public void create1Ok() throws Exception {
////    	super.create1Ok("/pais",FactoryObjects.generarPaisRequestUruguay(), status().isOk());
////    }
////    
////    @Test
////    public void update1Ok() throws Exception {
////    	super.update1Ok("/pais", FactoryObjects.generarPaisRequestUruguay(), Long.valueOf(1), status().isOk());
////    }
////    
////    @Test
////    public void delete1Ok() throws Exception {
////    	super.delete1Ok("/pais/{id}",Long.valueOf(1));
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
////    	PaisRequest paisRequest = FactoryObjects.generarPaisRequestUruguay();
////    	paisRequest.setDescripcion("");//Not blank
////    	super.create1Ok("/pais", paisRequest, status().isBadRequest());
////    }
////    
////    @Test
////    public void update1Fail() throws Exception {
////    	PaisRequest paisRequest = FactoryObjects.generarPaisRequestUruguay();
////    	paisRequest.setDescripcion("");//Not blank
////    	super.update1Ok("/pais", paisRequest, Long.valueOf(1), status().isBadRequest());
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
////        super.get2Ok("/pais/{id}", Long.valueOf(1), FactoryObjects.generarPaisRequestUruguay(), FactoryObjects.generarPaisResponseUruguay(), paisServices);
////        
////    }
////    
////    @Test
////    public void list2Ok() throws Exception {
////    	super.list2Ok("/pais/", FactoryObjects.generarPaisRequestUruguay(), FactoryObjects.generarPaisRequestLaArgentina(), FactoryObjects.generarPaisResponseUruguay(), FactoryObjects.generarPaisResponseLaArgentina(), paisServices);
////    }
////    
////    @Test
////    public void create2Ok() throws Exception {
////    	super.create2Ok("/pais", FactoryObjects.generarPaisRequestLaArgentina(), paisServices, PaisRequest.class);    	
////    }
////    
////    @Test
////    public void update2Ok() throws Exception {
////    	super.update2Ok("/pais", FactoryObjects.generarPaisRequestLaArgentina(), Long.valueOf(2), paisServices, PaisRequest.class);    
////    }
////    
////    @Test
////    public void delete2Ok() throws Exception {
////    	super.delete2WithIdOk("/pais/{id}", Long.valueOf(1), paisServices, Long.class);
////    }
//      
//}
