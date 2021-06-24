//package uy.gub.agesic.grep.core.dataaccess;
//
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.util.List;
//
//import org.junit.After;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.context.annotation.Import;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import uy.gub.agesic.grep.core.dataaccess.model.Tramite;
//import uy.gub.agesic.grep.core.dataaccess.model.UnidadEjecutora;
//import uy.gub.agesic.grep.core.exceptions.BusinessException;
//import uy.gub.agesic.grep.core.requests.TramiteRequest;
//import uy.gub.agesic.grep.core.requests.UnidadEjecutoraRequest;
//import uy.gub.agesic.grep.core.responses.TramiteResponse;
//import uy.gub.agesic.grep.core.services.impl.TramiteServices;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapper;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapperImpl;
//import uy.gub.agesic.grep.core.services.impl.utils.MapperResolver;
//import uy.gub.agesic.grep.core.utils.FactoryObjects;
//
//@RunWith(SpringRunner.class)
//@Import({TramiteServices.class, IMapperImpl.class, MapperResolver.class})
//@Transactional(propagation = Propagation.REQUIRES_NEW)
//@DataJpaTest
//public class TramiteBusinessTest {
//	
////    @Autowired(required=true)
////    private ITramiteDataAccess tramiteDataAccess;
////    
////    @Autowired(required=true)
////    private TramiteServices tramiteServices;
////    
////    @Autowired
////    private IMapper mapper;
////    
////    @After
////    public void clear() {
////        this.tramiteDataAccess.deleteAll();
////    }    
////
////    @Autowired(required=true)
////    private IUnidadEjecutoraDataAccess undiadEjecutoraDataAccess;
////    
////
////    
////    private UnidadEjecutora crearUnidadEjecutora(UnidadEjecutoraRequest unidadEjecutoraRequest) {
////    	UnidadEjecutora unidadEjecutora = mapper.fromRequest(unidadEjecutoraRequest);
////    	unidadEjecutora.setId(null);
////    	return undiadEjecutoraDataAccess.saveAndFlush(unidadEjecutora);
////    }        
////    
////    @Test
////    public void get() throws BusinessException {
////    	TramiteRequest request = FactoryObjects.generarTramiteRequest1();
////    	UnidadEjecutoraRequest unidadEjecutoraRequest = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	UnidadEjecutora unidadEjecutora = crearUnidadEjecutora(unidadEjecutoraRequest);
////    	request.setIdUnidadEjecutora(unidadEjecutora.getId());
////    	Tramite modelAGuardar = mapper.fromRequest(request);
////    	tramiteDataAccess.saveAndFlush(modelAGuardar);
////    	TramiteResponse responseAGuardarExcepted = mapper.toResponse(modelAGuardar);
////    	TramiteResponse responseGuardado = tramiteServices.get(modelAGuardar.getId());
////    	assertEquals(responseAGuardarExcepted, responseGuardado);
////    }
////    
////    @Test
////    public void list() throws BusinessException {
////    	TramiteRequest request1 = FactoryObjects.generarTramiteRequest1();
////    	TramiteRequest request2 = FactoryObjects.generarTramiteRequest2();
////    	UnidadEjecutoraRequest unidadEjecutoraRequest1 = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	UnidadEjecutora unidadEjecutora = crearUnidadEjecutora(unidadEjecutoraRequest1);
////    	UnidadEjecutoraRequest unidadEjecutoraRequest2 = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	UnidadEjecutora unidadEjecutora2 = crearUnidadEjecutora(unidadEjecutoraRequest2);
////    	request1.setIdUnidadEjecutora(unidadEjecutora.getId());
////    	request2.setIdUnidadEjecutora(unidadEjecutora2.getId());
////    	tramiteServices.create(request1);
////    	tramiteServices.create(request2);
////    	TramiteResponse responseExcepted1 = mapper.toResponse(mapper.fromRequest(request1));
////    	TramiteResponse responseExcepted2 = mapper.toResponse(mapper.fromRequest(request2));
////    	List<TramiteResponse> responseGuardado = tramiteServices.list();
////    	assertEquals(responseGuardado, List.of(responseExcepted1, responseExcepted2));
////    }
////
////    @Test
////    public void create() throws BusinessException {
////    	TramiteRequest tramiteRequest = FactoryObjects.generarTramiteRequest1();
////    	UnidadEjecutoraRequest unidadEjecutoraRequest1 = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	UnidadEjecutora unidadEjecutora = crearUnidadEjecutora(unidadEjecutoraRequest1);
////    	tramiteRequest.setIdUnidadEjecutora(unidadEjecutora.getId());
////    	tramiteServices.create(tramiteRequest);
////        Tramite tramiteAGuardar = mapper.fromRequest(tramiteRequest);
////        Tramite tramiteGuardado = tramiteDataAccess.findById(Long.valueOf(1)).get();
////        assertEquals(tramiteAGuardar, tramiteGuardado);
////	}
////    
////    @Test
////    public void update() throws BusinessException {
////    	TramiteRequest tramiteRequest = FactoryObjects.generarTramiteRequest1();
////    	UnidadEjecutoraRequest unidadEjecutoraRequest1 = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	UnidadEjecutora unidadEjecutora = crearUnidadEjecutora(unidadEjecutoraRequest1);
////    	tramiteRequest.setIdUnidadEjecutora(unidadEjecutora.getId());
////    	tramiteServices.create(tramiteRequest);
////    	UnidadEjecutoraRequest unidadEjecutoraRequest2 = FactoryObjects.generarUnidadEjecutoraRequest2();
////    	UnidadEjecutora unidadEjecutora2 = crearUnidadEjecutora(unidadEjecutoraRequest2);
////    	String nuevoTexto = tramiteRequest.getDescripcion().concat(" - Modificada");
////    	tramiteRequest.setDescripcion(nuevoTexto);
////    	tramiteRequest.setIdUnidadEjecutora(unidadEjecutora2.getId());
////    	tramiteServices.update(tramiteRequest, Long.valueOf(1));
////    	Tramite tramiteAGuardar = mapper.fromRequest(tramiteRequest);
////    	Tramite tramiteGuardado = tramiteDataAccess.findById(Long.valueOf(1)).get();
////    	assertEquals(tramiteAGuardar.getCodigo(), tramiteGuardado.getCodigo());
////    	assertEquals(nuevoTexto, tramiteGuardado.getDescripcion());
////    	assertEquals(tramiteAGuardar.getId(), tramiteGuardado.getId());
////    	assertEquals(tramiteAGuardar.getUnidadEjecutora().getId(), Long.valueOf(2));
//////    	assertNotEquals(tramiteAGuardar.getUltimaModificacion(), tramiteGuardado.getUltimaModificacion());
////    }
////    
////    /**
////     * PRECONDICION: El resultado de este test es válido si create() es válido
////     * @throws BusinessException
////     */
////    @Test
////    public void delete() throws BusinessException {
////    	TramiteRequest request = FactoryObjects.generarTramiteRequest1();
////    	UnidadEjecutoraRequest unidadEjecutoraRequest1 = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	UnidadEjecutora unidadEjecutora = crearUnidadEjecutora(unidadEjecutoraRequest1);
////    	request.setIdUnidadEjecutora(unidadEjecutora.getId());
////    	tramiteServices.create(request);
////    	TramiteResponse response = tramiteServices.get(Long.valueOf(1));
////    	tramiteServices.delete(response.getId());
////    	boolean sigueGuardado = tramiteDataAccess.findById(Long.valueOf(1)).isPresent();
////    	boolean sigueGuardadaUnidadEjecutora = undiadEjecutoraDataAccess.findById(unidadEjecutora.getId()).isPresent();
////    	assertFalse(sigueGuardado);
////    	assertTrue(sigueGuardadaUnidadEjecutora);
////    }
//    
//}
