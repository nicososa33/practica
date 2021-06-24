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
//import uy.gub.agesic.grep.core.requests.TipoPermisoRequest;
//import uy.gub.agesic.grep.core.responses.TipoPermisoResponse;
//import uy.gub.agesic.grep.core.services.impl.TipoPermisoServices;
//import uy.gub.agesic.grep.core.utils.FactoryObjects;
//
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(controllers = TipoPermisoController.class)
//public class TipoPermisoControllerTest extends ControllersTestBase<TipoPermisoResponse, TipoPermisoRequest, Long, TipoPermisoServices> {
//
//    @MockBean
//    private TipoPermisoServices tipoPermisoServices;
//
//    /************************************************************************************************/
//    /******************************  REQUEST  ----->   HTTP  ****************************************/
//    /************************************************************************************************/
//    /********************************* incluye validaciones *****************************************/
//    /************************************************************************************************/
//    
////    @Test
////    public void get1Ok() throws Exception {
////	   super.get1Ok("/tipoPermiso/{id}", Long.valueOf(1));
////    }
////    
////    @Test
////    public void list1Ok() throws Exception {
////    	super.list1Ok("/tipoPermiso/");
////    }
////
////    @Test
////    public void create1Ok() throws Exception {
////    	super.create1Ok("/tipoPermiso",FactoryObjects.generarTipoPermisoRequest1(), status().isOk());
////    }
////    
////    @Test
////    public void update1Ok() throws Exception {
////    	super.update1Ok("/tipoPermiso", FactoryObjects.generarTipoPermisoRequest1(), Long.valueOf(1), status().isOk());
////    }
////    
////    @Test
////    public void delete1Ok() throws Exception {
////    	super.delete1Ok("/tipoPermiso/{id}",Long.valueOf(1));
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
////    	TipoPermisoRequest tipoPermisoRequest = FactoryObjects.generarTipoPermisoRequest1();
////    	tipoPermisoRequest.setDescripcion("");//Not blank
////    	super.create1Ok("/tipoPermiso", tipoPermisoRequest, status().isBadRequest());
////    }
////    
////    @Test
////    public void update1Fail() throws Exception {
////    	TipoPermisoRequest tipoPermisoRequest = FactoryObjects.generarTipoPermisoRequest1();
////    	tipoPermisoRequest.setDescripcion("");//Not blank
////    	super.update1Ok("/tipoPermiso", tipoPermisoRequest, Long.valueOf(1), status().isBadRequest());
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
////        super.get2Ok("/tipoPermiso/{id}", Long.valueOf(1), FactoryObjects.generarTipoPermisoRequest1(), FactoryObjects.generarTipoPermisoResponse1(), tipoPermisoServices);
////        
////    }
////    
////    @Test
////    public void list2Ok() throws Exception {
////    	super.list2Ok("/tipoPermiso/", FactoryObjects.generarTipoPermisoRequest1(), FactoryObjects.generarTipoPermisoRequest2(), FactoryObjects.generarTipoPermisoResponse1(), FactoryObjects.generarTipoPermisoResponse2(), tipoPermisoServices);
////    }
////    
////    @Test
////    public void create2Ok() throws Exception {
////    	super.create2Ok("/tipoPermiso", FactoryObjects.generarTipoPermisoRequest2(), tipoPermisoServices, TipoPermisoRequest.class);    	
////    }
////    
////    @Test
////    public void update2Ok() throws Exception {
////    	super.update2Ok("/tipoPermiso", FactoryObjects.generarTipoPermisoRequest2(), Long.valueOf(2), tipoPermisoServices, TipoPermisoRequest.class);    
////    }
////    
////    @Test
////    public void delete2Ok() throws Exception {
////    	super.delete2WithIdOk("/tipoPermiso/{id}", Long.valueOf(1), tipoPermisoServices, Long.class);
////    }
//      
//}
