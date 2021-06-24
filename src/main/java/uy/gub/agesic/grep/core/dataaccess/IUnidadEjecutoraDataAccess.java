package uy.gub.agesic.grep.core.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import uy.gub.agesic.grep.core.dataaccess.model.UnidadEjecutora;

@Repository
public interface IUnidadEjecutoraDataAccess extends JpaRepository<UnidadEjecutora, Long> {

}
