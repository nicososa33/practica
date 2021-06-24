package uy.gub.agesic.grep.core.exceptions;

import org.slf4j.Logger;

import uy.gub.agesic.grep.core.utils.ErrorCodes;

public class SystemRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5417879825582725132L;
	private Logger logger;
	private String userMessage;
	private LevelError level;

	public SystemRuntimeException(LevelError level, Logger logger, String internalMessage) {
		super(internalMessage);
		this.logger = logger;
		this.level = level;
		this.userMessage = ErrorCodes.EXCEPTION_ERROR_GENERAL;
	}

	public SystemRuntimeException(LevelError level, String userMessage, Logger logger, String internalMessage) {
		super(internalMessage);
		this.logger = logger;
		this.level = level;
		this.userMessage = userMessage;
	}

	public SystemRuntimeException(LevelError level, Throwable e, Logger logger, String internalMessage) {
		super(internalMessage, e);
		this.logger = logger;
		this.level = level;
		this.userMessage = ErrorCodes.EXCEPTION_ERROR_GENERAL;
	}

	public SystemRuntimeException(LevelError level, String userMessage, Throwable e, Logger logger,
			String internalMessage) {
		super(internalMessage, e);
		logger.info(internalMessage, e);
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
