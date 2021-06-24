package uy.gub.agesic.grep.core.responses;

import uy.gub.agesic.grep.core.exceptions.LevelError;

public class ErrorMessageResponse {

	private LevelError level;
	private String errorKey;
	private String title;
	private String internalMessage;

	public ErrorMessageResponse() {
		this.title = "ERROR";
	}

	public LevelError getLevel() {
		return level;
	}

	public void setLevel(LevelError level) {
		this.level = level;
	}

	public String getErrorKey() {
		return errorKey;
	}

	public void setErrorKey(String errorKey) {
		this.errorKey = errorKey;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInternalMessage() {
		return internalMessage;
	}

	public void setInternalMessage(String internalMessage) {
		this.internalMessage = internalMessage;
	}

	@Override
	public String toString() {
		return "ErrorMessageResponse [level=" + level + ", errorKey=" + errorKey + ", title=" + title
				+ ", internalMessage=" + internalMessage + "]";
	}

}
