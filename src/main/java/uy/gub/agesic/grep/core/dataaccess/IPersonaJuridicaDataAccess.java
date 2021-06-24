package uy.gub.agesic.grep.core.dataaccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uy.gub.agesic.grep.core.dataaccess.model.PersonaJuridica;

@Repository
public interface IPersonaJuridicaDataAccess extends JpaRepository<PersonaJuridica, Long> {

	List<PersonaJuridica> findByTipoDocumentoIdAndPaisDocumentoIdAndNumeroDocumento(Long idTipoDocumento, Long idPaisDocumento, String numeroDocumento);
	
}
