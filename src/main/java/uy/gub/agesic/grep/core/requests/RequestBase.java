package uy.gub.agesic.grep.core.requests;

import uy.gub.agesic.grep.core.utils.Constants;

import java.util.UUID;

import org.apache.logging.log4j.ThreadContext;

import com.fasterxml.jackson.annotation.JsonIgnore;


public abstract class RequestBase {

	@JsonIgnore
	private Long id;

	@JsonIgnore
	private String uact;

	@JsonIgnore
	private String corrId;

	public RequestBase() {
		this.uact = ThreadContext.get(Constants.UACT) == null ? Constants.USERNAME : ThreadContext.get(Constants.UACT);
		this.corrId = ThreadContext.get(Constants.CORRELATION_ID_HEADER) == null ? UUID.randomUUID().toString()
				: ThreadContext.get(Constants.CORRELATION_ID_HEADER);
	}

	public String getUact() {
		return uact;
	}

	public void setUact(String uact) {
		this.uact = uact;
	}

	public String getCorrId() {
		return corrId;
	}

	public void setCorrId(String corrId) {
		this.corrId = corrId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((corrId == null) ? 0 : corrId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((uact == null) ? 0 : uact.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestBase other = (RequestBase) obj;
		if (corrId == null) {
			if (other.corrId != null)
				return false;
		} else if (!corrId.equals(other.corrId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (uact == null) {
			if (other.uact != null)
				return false;
		} else if (!uact.equals(other.uact))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RequestBase [id=" + id + ", uact=" + uact + ", corrId=" + corrId + "]";
	}

}
