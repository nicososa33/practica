//package uy.gub.agesic.grep.core.dataaccess;
//
//import static org.junit.Assert.assertFalse;
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
//import uy.gub.agesic.grep.core.dataaccess.model.TipoDocumento;
//import uy.gub.agesic.grep.core.exceptions.BusinessException;
//import uy.gub.agesic.grep.core.requests.TipoDocumentoRequest;
//import uy.gub.agesic.grep.core.responses.TipoDocumentoResponse;
//import uy.gub.agesic.grep.core.services.impl.TipoDocumentoServices;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapper;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapperImpl;
//import uy.gub.agesic.grep.core.services.impl.utils.MapperResolver;
//import uy.gub.agesic.grep.core.utils.FactoryObjects;
//
//@RunWith(SpringRunner.class)
//@Import({TipoDocumentoServices.class, IMapperImpl.class, MapperResolver.class})
//@Transactional(propagation = Propagation.REQUIRES_NEW)
//@DataJpaTest
//public class TipoDocumentoBusinessTest {
//	
////    @Autowired(required=true)
////    private ITipoDocumentoDataAccess tipoDocumentoDataAccess;
////    
////    @Autowired(required=true)
////    private TipoDocumentoServices tipoDocumentoServices;
////    
////    @Autowired
////    private IMapper mapper;
////    
////    @After
////    public void clear() {
////        this.tipoDocumentoDataAccess.deleteAll();
////    }    
////    
////    @Test
////    public void get() throws BusinessException {
////    	TipoDocumentoRequest request = FactoryObjects.generarTipoDocumentoRequest1();
////    	TipoDocumento modelAGuardar = mapper.fromRequest(request);
////    	tipoDocumentoDataAccess.saveAndFlush(modelAGuardar);
////    	TipoDocumentoResponse responseAGuardarExcepted = mapper.toResponse(modelAGuardar);
////    	TipoDocumentoResponse responseGuardado = tipoDocumentoServices.get(modelAGuardar.getId());
////    	assertEquals(responseAGuardarExcepted, responseGuardado);
////    }
////    
////    @Test
////    public void list() throws BusinessException {
////    	TipoDocumentoRequest request1 = FactoryObjects.generarTipoDocumentoRequest1();
////    	TipoDocumentoRequest request2 = FactoryObjects.generarTipoDocumentoRequest2();
////    	tipoDocumentoServices.create(request1);
////    	tipoDocumentoServices.create(request2);
////    	TipoDocumentoResponse responseExcepted1 = mapper.toResponse(mapper.fromRequest(request1));
////    	TipoDocumentoResponse responseExcepted2 = mapper.toResponse(mapper.fromRequest(request2));
////    	List<TipoDocumentoResponse> responseGuardado = tipoDocumentoServices.list();
////    	assertEquals(responseGuardado, List.of(responseExcepted1, responseExcepted2));
////    }
////
////    @Test
////    public void create() throws BusinessException {
////    	TipoDocumentoRequest tipoDocumentoRequest = FactoryObjects.generarTipoDocumentoRequest1();
////    	tipoDocumentoServices.create(tipoDocumentoRequest);
////        TipoDocumento tipoDocumentoAGuardar = mapper.fromRequest(tipoDocumentoRequest);
////        TipoDocumento tipoDocumentoGuardado = tipoDocumentoDataAccess.findById(Long.valueOf(1)).get();
////        assertEquals(tipoDocumentoAGuardar, tipoDocumentoGuardado);
////	}
////    
////    @Test
////    public void update() throws BusinessException {
////    	TipoDocumentoRequest tipoDocumentoRequest = FactoryObjects.generarTipoDocumentoRequest1();
////    	tipoDocumentoServices.create(tipoDocumentoRequest);
////    	String nuevoTexto = tipoDocumentoRequest.getDescripcion().concat(" - Modificado");
////    	tipoDocumentoRequest.setDescripcion(nuevoTexto);
////    	tipoDocumentoServices.update(tipoDocumentoRequest, Long.valueOf(1));
////    	TipoDocumento tipoDocumentoAGuardar = mapper.fromRequest(tipoDocumentoRequest);
////    	TipoDocumento tipoDocumentoGuardado = tipoDocumentoDataAccess.findById(Long.valueOf(1)).get();
////    	assertEquals(tipoDocumentoAGuardar.getCodigo(), tipoDocumentoGuardado.getCodigo());
////    	assertEquals(tipoDocumentoAGuardar.getId(), tipoDocumentoGuardado.getId());
////    	assertEquals(nuevoTexto, tipoDocumentoGuardado.getDescripcion());
//////    	assertNotEquals(tipoDocumentoAGuardar.getUltimaModificacion(), tipoDocumentoGuardado.getUltimaModificacion());
////    }
////    
////    /**
////     * PRECONDICION: El resultado de este test es válido si create() es válido
////     * @throws BusinessException
////     */
////    @Test
////    public void delete() throws BusinessException {
////    	TipoDocumentoRequest request = FactoryObjects.generarTipoDocumentoRequest1();
////    	tipoDocumentoServices.create(request);
////    	TipoDocumentoResponse response = tipoDocumentoServices.get(Long.valueOf(1));
////    	tipoDocumentoServices.delete(response.getId());
////    	boolean sigueGuardado = tipoDocumentoDataAccess.findById(Long.valueOf(1)).isPresent();
////    	assertFalse(sigueGuardado);
////    }
//    
//}
