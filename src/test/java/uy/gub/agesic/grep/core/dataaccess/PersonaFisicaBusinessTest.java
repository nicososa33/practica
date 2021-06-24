//package uy.gub.agesic.grep.core.dataaccess;
//
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertEquals;
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
//import uy.gub.agesic.grep.core.dataaccess.model.Pais;
//import uy.gub.agesic.grep.core.dataaccess.model.PersonaFisica;
//import uy.gub.agesic.grep.core.dataaccess.model.TipoDocumento;
//import uy.gub.agesic.grep.core.dataaccess.model.UnidadEjecutora;
//import uy.gub.agesic.grep.core.exceptions.BusinessException;
//import uy.gub.agesic.grep.core.requests.PaisRequest;
//import uy.gub.agesic.grep.core.requests.PersonaFisicaRequest;
//import uy.gub.agesic.grep.core.requests.TipoDocumentoRequest;
//import uy.gub.agesic.grep.core.requests.UnidadEjecutoraRequest;
//import uy.gub.agesic.grep.core.responses.PersonaFisicaResponse;
//import uy.gub.agesic.grep.core.services.impl.PersonaFisicaServices;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapper;
//import uy.gub.agesic.grep.core.services.impl.utils.IMapperImpl;
//import uy.gub.agesic.grep.core.services.impl.utils.MapperResolver;
//import uy.gub.agesic.grep.core.utils.FactoryObjects;
//
//@RunWith(SpringRunner.class)
//@Import({PersonaFisicaServices.class, IMapperImpl.class, MapperResolver.class})
//@Transactional(propagation = Propagation.REQUIRES_NEW)
//@DataJpaTest
//public class PersonaFisicaBusinessTest {
//	
////    @Autowired(required=true) private IPersonaFisicaDataAccess personaFisicaDataAccess;
////    @Autowired(required=true) private PersonaFisicaServices personaFisicaServices;
////    
////    @Autowired
////    private IMapper mapper;
////    
////    @After
////    public void clear() {
////        this.personaFisicaDataAccess.deleteAll();
////    }    
////
////    @Autowired(required=true) private IUnidadEjecutoraDataAccess undiadEjecutoraDataAccess;
////    @Autowired(required=true) private ITipoDocumentoDataAccess tipoDocumentoDataAccess;
////    @Autowired(required=true) private IPaisDataAccess paisDataAccess;
////    
////
////    
////    private Pais crearPais(PaisRequest paisRequest) {
////    	Pais pais = mapper.fromRequest(paisRequest);
////    	pais.setId(null);
////    	return paisDataAccess.saveAndFlush(pais);
////    }        
////    
////    private TipoDocumento crearTipoDocumento(TipoDocumentoRequest tipoDocumentoRequest) {
////    	TipoDocumento unidadEjecutora = mapper.fromRequest(tipoDocumentoRequest);
////    	unidadEjecutora.setId(null);
////    	return tipoDocumentoDataAccess.saveAndFlush(unidadEjecutora);
////    }        
////    
////    private UnidadEjecutora crearUnidadEjecutora(UnidadEjecutoraRequest unidadEjecutoraRequest) {
////    	UnidadEjecutora unidadEjecutora = mapper.fromRequest(unidadEjecutoraRequest);
////    	unidadEjecutora.setId(null);
////    	return undiadEjecutoraDataAccess.saveAndFlush(unidadEjecutora);
////    }        
////    
////    @Test
////    public void get() throws BusinessException {
////    	PersonaFisicaRequest request = FactoryObjects.generarPersonaFisicaRequest1();
////    	UnidadEjecutoraRequest unidadEjecutoraRequest = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	UnidadEjecutora unidadEjecutora = crearUnidadEjecutora(unidadEjecutoraRequest);
////    	Pais pais = crearPais(FactoryObjects.generarPaisRequestLaArgentina());
////    	TipoDocumento tipoDocumento = crearTipoDocumento(FactoryObjects.generarTipoDocumentoRequest2());
////    	request.setIdUnidadEjecutora(unidadEjecutora.getId());
////    	request.setIdTipoDocumento(tipoDocumento.getId());
////    	request.setIdPaisDocumento(pais.getId());
////    	PersonaFisica modelAGuardar = mapper.fromRequest(request);
////    	personaFisicaDataAccess.saveAndFlush(modelAGuardar);
////    	PersonaFisicaResponse responseAGuardarExcepted = mapper.toResponse(modelAGuardar);
////    	PersonaFisicaResponse responseGuardado = personaFisicaServices.findBy(modelAGuardar.getTipoDocumento().getId(), modelAGuardar.getPaisDocumento().getId(), modelAGuardar.getNumeroDocumento());
////    	assertEquals(responseAGuardarExcepted, responseGuardado);
////    }
////    
//////    @Test
//////    public void list() throws BusinessException {
//////    	PersonaFisicaRequest request1 = FactoryObjects.generarPersonaFisicaRequest1();
//////    	PersonaFisicaRequest request2 = FactoryObjects.generarPersonaFisicaRequest2();
//////    	UnidadEjecutoraRequest unidadEjecutoraRequest1 = FactoryObjects.generarUnidadEjecutoraRequest1();
//////    	UnidadEjecutora unidadEjecutora = crearUnidadEjecutora(unidadEjecutoraRequest1);
//////    	UnidadEjecutoraRequest unidadEjecutoraRequest2 = FactoryObjects.generarUnidadEjecutoraRequest1();
//////    	UnidadEjecutora unidadEjecutora2 = crearUnidadEjecutora(unidadEjecutoraRequest2);
//////    	Pais pais1 = crearPais(FactoryObjects.generarPaisRequestUruguay());
//////    	TipoDocumento tipoDocumento1 = crearTipoDocumento(FactoryObjects.generarTipoDocumentoRequest1());
//////    	Pais pais2 = crearPais(FactoryObjects.generarPaisRequestLaArgentina());
//////    	TipoDocumento tipoDocumento2 = crearTipoDocumento(FactoryObjects.generarTipoDocumentoRequest2());
//////    	request1.setIdUnidadEjecutora(unidadEjecutora.getId());
//////    	request2.setIdUnidadEjecutora(unidadEjecutora2.getId());
//////    	request1.setIdTipoDocumento(tipoDocumento1.getId());
//////    	request2.setIdTipoDocumento(tipoDocumento2.getId());
//////    	request1.setIdPaisDocumento(pais1.getId());
//////    	request2.setIdPaisDocumento(pais2.getId());
//////    	personaFisicaServices.create(request1);
//////    	personaFisicaServices.create(request2);
//////    	PersonaFisicaResponse responseExcepted1 = mapper.toResponse(mapper.fromRequest(request1));
//////    	PersonaFisicaResponse responseExcepted2 = mapper.toResponse(mapper.fromRequest(request2));
//////    	List<PersonaFisicaResponse> responseGuardado = personaFisicaServices.list();
//////    	assertEquals(responseGuardado, List.of(responseExcepted1, responseExcepted2));
//////    }
////
////    @Test
////    public void create() throws BusinessException {
////    	PersonaFisicaRequest personaFisicaRequest = FactoryObjects.generarPersonaFisicaRequest1();
////    	UnidadEjecutoraRequest unidadEjecutoraRequest1 = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	UnidadEjecutora unidadEjecutora = crearUnidadEjecutora(unidadEjecutoraRequest1);
////    	Pais pais = crearPais(FactoryObjects.generarPaisRequestLaArgentina());
////    	TipoDocumento tipoDocumento = crearTipoDocumento(FactoryObjects.generarTipoDocumentoRequest2());
////    	personaFisicaRequest.setIdUnidadEjecutora(unidadEjecutora.getId());
////    	personaFisicaRequest.setIdPaisDocumento(pais.getId());
////    	personaFisicaRequest.setIdTipoDocumento(tipoDocumento.getId());
////    	personaFisicaServices.create(personaFisicaRequest);
////        PersonaFisica personaFisicaAGuardar = mapper.fromRequest(personaFisicaRequest);
////        PersonaFisica personaFisicaGuardado = personaFisicaDataAccess.findById(Long.valueOf(1)).get();
////        assertEquals(personaFisicaAGuardar, personaFisicaGuardado);
////	}
////    
////    @Test
////    public void update() throws BusinessException {
////    	PersonaFisicaRequest personaFisicaRequest = FactoryObjects.generarPersonaFisicaRequest1();
////    	UnidadEjecutoraRequest unidadEjecutoraRequest1 = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	UnidadEjecutora unidadEjecutora = crearUnidadEjecutora(unidadEjecutoraRequest1);
////    	personaFisicaRequest.setIdUnidadEjecutora(unidadEjecutora.getId());
////    	personaFisicaServices.create(personaFisicaRequest);
////    	UnidadEjecutoraRequest unidadEjecutoraRequest2 = FactoryObjects.generarUnidadEjecutoraRequest2();
////    	UnidadEjecutora unidadEjecutora2 = crearUnidadEjecutora(unidadEjecutoraRequest2);
////    	Pais pais = crearPais(FactoryObjects.generarPaisRequestLaArgentina());
////    	TipoDocumento tipoDocumento = crearTipoDocumento(FactoryObjects.generarTipoDocumentoRequest2());
////    	String nuevoTexto = personaFisicaRequest.getNombreYApellidos().concat(" - Modificada");
////    	personaFisicaRequest.setNombreYApellidos(nuevoTexto);
////    	personaFisicaRequest.setIdPaisDocumento(pais.getId());
////    	personaFisicaRequest.setIdTipoDocumento(tipoDocumento.getId());
////    	personaFisicaRequest.setIdUnidadEjecutora(unidadEjecutora2.getId());
////    	personaFisicaServices.update(personaFisicaRequest);
////    	PersonaFisica personaFisicaAGuardar = mapper.fromRequest(personaFisicaRequest);
////    	PersonaFisica personaFisicaGuardado = personaFisicaDataAccess.findById(Long.valueOf(1)).get();
////    	assertEquals(personaFisicaAGuardar.getCorreoElectronico(), personaFisicaGuardado.getCorreoElectronico());
////    	assertEquals(nuevoTexto, personaFisicaGuardado.getNombreYApellidos());
////    	assertEquals(personaFisicaAGuardar.getId(), personaFisicaGuardado.getId());
////    	assertEquals(personaFisicaAGuardar.getUnidadEjecutora().getId(), Long.valueOf(2));
//////    	assertNotEquals(personaFisicaAGuardar.getUltimaModificacion(), personaFisicaGuardado.getUltimaModificacion());
////    }
////    
////    /**
////     * PRECONDICION: El resultado de este test es válido si create() es válido
////     * @throws BusinessException
////     */
////    @Test
////    public void delete() throws BusinessException {
////    	PersonaFisicaRequest request = FactoryObjects.generarPersonaFisicaRequest1();
////    	UnidadEjecutoraRequest unidadEjecutoraRequest1 = FactoryObjects.generarUnidadEjecutoraRequest1();
////    	UnidadEjecutora unidadEjecutora = crearUnidadEjecutora(unidadEjecutoraRequest1);
////    	Pais pais = crearPais(FactoryObjects.generarPaisRequestLaArgentina());
////    	TipoDocumento tipoDocumento = crearTipoDocumento(FactoryObjects.generarTipoDocumentoRequest2());
////    	request.setIdUnidadEjecutora(unidadEjecutora.getId());
////    	request.setIdTipoDocumento(tipoDocumento.getId());
////    	request.setIdPaisDocumento(pais.getId());
////    	personaFisicaServices.create(request);
////    	PersonaFisicaResponse response = personaFisicaServices.findBy(request.getIdTipoDocumento(), request.getIdPaisDocumento(), request.getNumeroDocumento());
////    	personaFisicaServices.delete(response.getId());
////    	boolean sigueGuardado = personaFisicaDataAccess.findById(Long.valueOf(1)).isPresent();
////    	boolean sigueGuardadaUnidadEjecutora = undiadEjecutoraDataAccess.findById(unidadEjecutora.getId()).isPresent();
////    	assertFalse(sigueGuardado);
////    	assertTrue(sigueGuardadaUnidadEjecutora);
////    }
//    
//}
