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
//import uy.gub.agesic.grep.core.requests.TipoRelacionRequest;
//import uy.gub.agesic.grep.core.responses.TipoRelacionResponse;
//import uy.gub.agesic.grep.core.services.impl.TipoRelacionServices;
//import uy.gub.agesic.grep.core.utils.FactoryObjects;
//
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(controllers = TipoRelacionController.class)
//public class TipoRelacionControllerTest extends ControllersTestBase<TipoRelacionResponse, TipoRelacionRequest, Long, TipoRelacionServices> {
//
//    @MockBean
//    private TipoRelacionServices tipoRelacionServices;
//
//    /************************************************************************************************/
//    /******************************  REQUEST  ----->   HTTP  ****************************************/
//    /************************************************************************************************/
//    /********************************* incluye validaciones *****************************************/
//    /************************************************************************************************/
//    
////    @Test
////    public void get1Ok() throws Exception {
////	   super.get1Ok("/tipoRelacion/{id}", Long.valueOf(1));
////    }
////    
////    @Test
////    public void list1Ok() throws Exception {
////    	super.list1Ok("/tipoRelacion/");
////    }
////
////    @Test
////    public void create1Ok() throws Exception {
////    	super.create1Ok("/tipoRelacion",FactoryObjects.generarTipoRelacionRequest1(), status().isOk());
////    }
////    
////    @Test
////    public void update1Ok() throws Exception {
////    	super.update1Ok("/tipoRelacion", FactoryObjects.generarTipoRelacionRequest1(), Long.valueOf(1), status().isOk());
////    }
////    
////    @Test
////    public void delete1Ok() throws Exception {
////    	super.delete1Ok("/tipoRelacion/{id}",Long.valueOf(1));
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
////    	TipoRelacionRequest tipoRelacionRequest = FactoryObjects.generarTipoRelacionRequest1();
////    	tipoRelacionRequest.setTipoRelacion("");//Not blank
////    	super.create1Ok("/tipoRelacion", tipoRelacionRequest, status().isBadRequest());
////    }
////    
////    @Test
////    public void update1Fail() throws Exception {
////    	TipoRelacionRequest tipoRelacionRequest = FactoryObjects.generarTipoRelacionRequest1();
////    	tipoRelacionRequest.setTipoRelacion("");//Not blank
////    	super.update1Ok("/tipoRelacion", tipoRelacionRequest, Long.valueOf(1), status().isBadRequest());
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
////        super.get2Ok("/tipoRelacion/{id}", Long.valueOf(1), FactoryObjects.generarTipoRelacionRequest1(), FactoryObjects.generarTipoRelacionResponse1(), tipoRelacionServices);
////        
////    }
////    
////    @Test
////    public void list2Ok() throws Exception {
////    	super.list2Ok("/tipoRelacion/", FactoryObjects.generarTipoRelacionRequest1(), FactoryObjects.generarTipoRelacionRequest2(), FactoryObjects.generarTipoRelacionResponse1(), FactoryObjects.generarTipoRelacionResponse2(), tipoRelacionServices);
////    }
////    
////    @Test
////    public void create2Ok() throws Exception {
////    	super.create2Ok("/tipoRelacion", FactoryObjects.generarTipoRelacionRequest2(), tipoRelacionServices, TipoRelacionRequest.class);    	
////    }
////    
////    @Test
////    public void update2Ok() throws Exception {
////    	super.update2Ok("/tipoRelacion", FactoryObjects.generarTipoRelacionRequest2(), Long.valueOf(2), tipoRelacionServices, TipoRelacionRequest.class);    
////    }
////    
////    @Test
////    public void delete2Ok() throws Exception {
////    	super.delete2WithIdOk("/tipoRelacion/{id}",Long.valueOf(1), tipoRelacionServices, Long.class);
////    }
//      
//}
