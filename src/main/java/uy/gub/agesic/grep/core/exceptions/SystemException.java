package uy.gub.agesic.grep.core.exceptions;

import org.slf4j.Logger;

import uy.gub.agesic.grep.core.utils.ErrorCodes;

public class SystemException extends Exception {
	private static final long serialVersionUID = 1L;
	private Logger logger;
	private String userMessage;
	private LevelError level;

	public SystemException(LevelError level, Logger logger, String internalMessage) {
		super(internalMessage);
		this.logger = logger;
		this.level = level;
		this.userMessage = ErrorCodes.EXCEPTION_ERROR_GENERAL;
	}

	public SystemException(LevelError level, String userMessage, Logger logger, String internalMessage) {
		super(internalMessage);
		this.logger = logger;
		this.level = level;
		this.userMessage = userMessage;
	}

	public SystemException(LevelError level, Throwable e, Logger logger, String internalMessage) {
		super(internalMessage, e);
		this.logger = logger;
		this.level = level;
		this.userMessage = ErrorCodes.EXCEPTION_ERROR_GENERAL;
	}

	public SystemException(LevelError level, String userMessage, Throwable e, Logger logger, String internalMessage) {
		super(internalMessage, e);
		logger.error(internalMessage, e);
		this.logger = logger;
		this.level = level;
		this.userMessage = userMessage;
	}

	public Logger getLogger() {
		return this.logger;
	}

	public LevelError getLevel() {
		return level;
	}

	public String getUserMessage() {
		return userMessage;
	}

}
