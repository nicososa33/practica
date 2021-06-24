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
//import uy.gub.agesic.grep.core.requests.TramiteRequest;
//import uy.gub.agesic.grep.core.responses.TramiteResponse;
//import uy.gub.agesic.grep.core.services.impl.TramiteServices;
//import uy.gub.agesic.grep.core.utils.FactoryObjects;
//
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(controllers = TramiteController.class)
//public class TramiteControllerTest extends ControllersTestBase<TramiteResponse, TramiteRequest, Long, TramiteServices> {
//
//    @MockBean
//    private TramiteServices tramiteServices;
//
//    /************************************************************************************************/
//    /******************************  REQUEST  ----->   HTTP  ****************************************/
//    /************************************************************************************************/
//    /********************************* incluye validaciones *****************************************/
//    /************************************************************************************************/
//    
////    @Test
////    public void get1Ok() throws Exception {
////	   super.get1Ok("/tramite/{id}", Long.valueOf(1));
////    }
////    
////    @Test
////    public void list1Ok() throws Exception {
////    	super.list1Ok("/tramite/");
////    }
////
////    @Test
////    public void create1Ok() throws Exception {
////    	super.create1Ok("/tramite",FactoryObjects.generarTramiteRequest1(), status().isOk());
////    }
////    
////    @Test
////    public void update1Ok() throws Exception {
////    	super.update1Ok("/tramite", FactoryObjects.generarTramiteRequest1(), Long.valueOf(1), status().isOk());
////    }
////    
////    @Test
////    public void delete1Ok() throws Exception {
////    	super.delete1Ok("/tramite/{id}", Long.valueOf(1));
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
////    	TramiteRequest tramiteRequest = FactoryObjects.generarTramiteRequest1();
////    	tramiteRequest.setDescripcion("");//Not blank
////    	super.create1Ok("/tramite", tramiteRequest, status().isBadRequest());
////    }
////    
////    @Test
////    public void update1Fail() throws Exception {
////    	TramiteRequest tramiteRequest = FactoryObjects.generarTramiteRequest1();
////    	tramiteRequest.setDescripcion("");//Not blank
////    	super.update1Ok("/tramite", tramiteRequest, Long.valueOf(1), status().isBadRequest());
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
////        super.get2Ok("/tramite/{id}", Long.valueOf(1), FactoryObjects.generarTramiteRequest1(), FactoryObjects.generarTramiteResponse1(), tramiteServices);
////        
////    }
////    
////    @Test
////    public void list2Ok() throws Exception {
////    	super.list2Ok("/tramite/", FactoryObjects.generarTramiteRequest1(), FactoryObjects.generarTramiteRequest2(), FactoryObjects.generarTramiteResponse1(), FactoryObjects.generarTramiteResponse2(), tramiteServices);
////    }
////    
////    @Test
////    public void create2Ok() throws Exception {
////    	super.create2Ok("/tramite", FactoryObjects.generarTramiteRequest2(), tramiteServices, TramiteRequest.class);    	
////    }
////    
////    @Test
////    public void update2Ok() throws Exception {
////    	super.update2Ok("/tramite", FactoryObjects.generarTramiteRequest2(), Long.valueOf(2), tramiteServices, TramiteRequest.class);    
////    }
////    
////    @Test
////    public void delete2Ok() throws Exception {
////    	super.delete2WithIdOk("/tramite/{id}", Long.valueOf(1), tramiteServices, Long.class);
////    }
//      
//}
