package uy.gub.agesic.grep.core.dataaccess.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.UpdateTimestamp;

@MappedSuperclass
public abstract class Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", nullable = false)
	private Long id;

    @Column(length = 50, nullable = false)
    private String uact;

    @Column
    @UpdateTimestamp
    private LocalDateTime fact;

    @Column(name = "corr_id", length = 50)
    private String corrId;

	@Column(name = "fecha_baja", nullable = true)
	private Date fechaBaja;

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUact() {
		return uact;
	}

	public void setUact(String uact) {
		this.uact = uact;
	}

	public LocalDateTime getFact() {
		return fact;
	}

	public void setFact(LocalDateTime fact) {
		this.fact = fact;
	}

	public String getCorrId() {
		return corrId;
	}

	public void setCorrId(String corrId) {
		this.corrId = corrId;
	}

	@Override
	public String toString() {
		return "Auditable [id=" + id + ", uact=" + uact + ", fact=" + fact + ", corrId=" + corrId + "]";
	}

}
