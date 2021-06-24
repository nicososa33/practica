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
//import uy.gub.agesic.grep.core.requests.UnidadEjecutoraRequest;
//import uy.gub.agesic.grep.core.responses.UnidadEjecutoraResponse;
//import uy.gub.agesic.grep.core.services.impl.UnidadEjecutoraServices;
//import uy.gub.agesic.grep.core.utils.FactoryObjects;
//
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(controllers = UnidadEjecutoraController.class)
//public class UnidadEjecutoraControllerTest extends ControllersTestBase<UnidadEjecutoraResponse, UnidadEjecutoraRequest, Long, UnidadEjecutoraServices> {
//
//    @MockBean
//    private UnidadEjecutoraServices unidadEjecutoraServices;
//
//    /************************************************************************************************/
//    /******************************  REQUEST  ----->   HTTP  ****************************************/
//    /************************************************************************************************/
//    /********************************* incluye validaciones *****************************************/
//    /************************************************************************************************/
//    
////    @Test
////    public void get1Ok() throws Exception {
////	   super.get1Ok("/unidadEjecutora/{id}", Long.valueOf(1));
////    }
////    
////    @Test
////    public void list1Ok() throws Exception {
////    	super.list1Ok("/unidadEjecutora/");
////    }
////
////    @Test
////    public void create1Ok() throws Exception {
////    	super.create1Ok("/unidadEjecutora",FactoryObjects.generarUnidadEjecutoraRequest1(), status().isOk());
////    }
////    
////    @Test
////    public void update1Ok() throws Exception {
////    	super.update1Ok("/unidadEjecutora", FactoryObjects.generarUnidadEjecutoraRequest1(), Long.valueOf(1), status().isOk());
////    }
////    
////    @Test
////    public void delete1Ok() throws Exception {
////    	super.delete1Ok("/unidadEjecutora/{id}", Long.valueOf(1));
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
////    	UnidadEjecutoraRequest unidadEjecutoraRequest = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	unidadEjecutoraRequest.setDescripcion("");//Not blank
////    	super.create1Ok("/unidadEjecutora", unidadEjecutoraRequest, status().isBadRequest());
////    }
////    
////    @Test
////    public void update1Fail() throws Exception {
////    	UnidadEjecutoraRequest unidadEjecutoraRequest = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	unidadEjecutoraRequest.setDescripcion("");//Not blank
////    	super.update1Ok("/unidadEjecutora", unidadEjecutoraRequest, Long.valueOf(1), status().isBadRequest());
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
////        super.get2Ok("/unidadEjecutora/{id}", Long.valueOf(1), FactoryObjects.generarUnidadEjecutoraRequest1(), FactoryObjects.generarUnidadEjecutoraResponse1(), unidadEjecutoraServices);
////        
////    }
////    
////    @Test
////    public void list2Ok() throws Exception {
////    	super.list2Ok("/unidadEjecutora/", FactoryObjects.generarUnidadEjecutoraRequest1(), FactoryObjects.generarUnidadEjecutoraRequest2(), FactoryObjects.generarUnidadEjecutoraResponse1(), FactoryObjects.generarUnidadEjecutoraResponse2(), unidadEjecutoraServices);
////    }
////    
////    @Test
////    public void create2Ok() throws Exception {
////    	super.create2Ok("/unidadEjecutora", FactoryObjects.generarUnidadEjecutoraRequest2(), unidadEjecutoraServices, UnidadEjecutoraRequest.class);    	
////    }
////    
////    @Test
////    public void update2Ok() throws Exception {
////    	super.update2Ok("/unidadEjecutora", FactoryObjects.generarUnidadEjecutoraRequest2(), Long.valueOf(2), unidadEjecutoraServices, UnidadEjecutoraRequest.class);    
////    }
////    
////    @Test
////    public void delete2Ok() throws Exception {
////    	super.delete2WithIdOk("/unidadEjecutora/{id}", Long.valueOf(1), unidadEjecutoraServices, Long.class);
////    }
//      
//}
