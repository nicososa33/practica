package uy.gub.agesic.grep.core.services.impl.utils;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import uy.gub.agesic.grep.core.dataaccess.model.Pais;
import uy.gub.agesic.grep.core.dataaccess.model.PersonaFisica;
import uy.gub.agesic.grep.core.dataaccess.model.PersonaJuridica;
import uy.gub.agesic.grep.core.dataaccess.model.TipoDocumento;
import uy.gub.agesic.grep.core.dataaccess.model.TipoPermiso;
import uy.gub.agesic.grep.core.dataaccess.model.TipoRelacion;
import uy.gub.agesic.grep.core.dataaccess.model.Tramite;
import uy.gub.agesic.grep.core.dataaccess.model.UnidadEjecutora;
import uy.gub.agesic.grep.core.requests.PaisRequest;
import uy.gub.agesic.grep.core.requests.PersonaFisicaRequest;
import uy.gub.agesic.grep.core.requests.PersonaJuridicaRequest;
import uy.gub.agesic.grep.core.requests.TipoDocumentoRequest;
import uy.gub.agesic.grep.core.requests.TipoPermisoRequest;
import uy.gub.agesic.grep.core.requests.TipoRelacionRequest;
import uy.gub.agesic.grep.core.requests.TramiteRequest;
import uy.gub.agesic.grep.core.requests.UnidadEjecutoraRequest;
import uy.gub.agesic.grep.core.responses.PaisResponse;
import uy.gub.agesic.grep.core.responses.PersonaFisicaResponse;
import uy.gub.agesic.grep.core.responses.PersonaJuridicaResponse;
import uy.gub.agesic.grep.core.responses.TipoDocumentoResponse;
import uy.gub.agesic.grep.core.responses.TipoPermisoResponse;
import uy.gub.agesic.grep.core.responses.TipoRelacionResponse;
import uy.gub.agesic.grep.core.responses.TramiteResponse;
import uy.gub.agesic.grep.core.responses.UnidadEjecutoraResponse;

@Mapper(componentModel = "spring", uses = MapperResolver.class)
public interface IMapper {

	TipoRelacionResponse toResponse(TipoRelacion model);
	UnidadEjecutoraResponse toResponse(UnidadEjecutora model);
	TipoPermisoResponse toResponse(TipoPermiso model);
	PaisResponse toResponse(Pais model);	
	TipoDocumentoResponse toResponse(TipoDocumento model);
	PersonaFisicaResponse toResponse(PersonaFisica model);
	PersonaJuridicaResponse toResponse(PersonaJuridica model);
	TramiteResponse toResponse(Tramite model);
	
	@Mappings({
		@Mapping(ignore = true, target = "fechaBaja"),
		@Mapping(ignore = true, target = "fact"),
		@Mapping(ignore = true, target = "id")
    })
	Pais fromRequest(PaisRequest request);
	
	
	@Mappings({
		@Mapping(ignore = true, target = "fechaBaja"),
		@Mapping(ignore = true, target = "fact"),
		@Mapping(ignore = true, target = "id")
    })
	TipoDocumento fromRequest(TipoDocumentoRequest request);


	@Mappings({
		@Mapping(ignore = true, target = "fechaBaja"),
		@Mapping(ignore = true, target = "fact"),
		@Mapping(ignore = true, target = "id")
    })	
	TipoPermiso fromRequest(TipoPermisoRequest request);	

	@Mappings({
		@Mapping(ignore = true, target = "fechaBaja"),
		@Mapping(ignore = true, target = "fact"),
		@Mapping(ignore = true, target = "id")
    })	
	TipoRelacion fromRequest(TipoRelacionRequest request);


	@Mappings({
		@Mapping(ignore = true, target = "fechaBaja"),
		@Mapping(ignore = true, target = "fact"),
		@Mapping(ignore = true, target = "id")
    })	
	UnidadEjecutora fromRequest(UnidadEjecutoraRequest request);	
	

	@Mappings({
		@Mapping(ignore = true, target = "fechaBaja"),
		@Mapping(ignore = true, target = "fact"),
		@Mapping(ignore = true, target = "id"),
		@Mapping(source = "request.idUnidadEjecutora", target = "unidadEjecutora")
    })	
	Tramite fromRequest(TramiteRequest request);	
	
	
	
	@Mappings({
		@Mapping(ignore = true, target = "fechaBaja"),
		@Mapping(ignore = true, target = "fact"),
		@Mapping(ignore = true, target = "id"),
		@Mapping(source = "request.idPaisDocumento", target = "paisDocumento"),
		@Mapping(source = "request.idTipoDocumento", target = "tipoDocumento"),
		@Mapping(source = "request.idUnidadEjecutora", target = "unidadEjecutora")
	})	
	PersonaFisica fromRequest(PersonaFisicaRequest request);	
	
	
	
	@Mappings({
		@Mapping(ignore = true, target = "fechaBaja"),
		@Mapping(ignore = true, target = "fact"),
		@Mapping(ignore = true, target = "id"),
		@Mapping(source = "request.idPaisDocumento", target = "paisDocumento"),
		@Mapping(source = "request.idTipoDocumento", target = "tipoDocumento"),
	})	
	PersonaJuridica fromRequest(PersonaJuridicaRequest request);	
	
	
}

