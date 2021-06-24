package uy.gub.agesic.grep.core.exceptions;

import org.slf4j.Logger;

public class NotFoundException extends SystemRuntimeException {

	private static final long serialVersionUID = 1L;

	public NotFoundException(LevelError level, String userMessage, Logger logger, String internalMessage) {
		super(level, userMessage, logger, internalMessage);
	}

	public NotFoundException(LevelError level, String userMessage, Throwable e, Logger logger, String internalMessage) {
		super(level, userMessage, e, logger, internalMessage);
	}

	public NotFoundException(LevelError level, Logger logger, String internalMessage) {
		super(level, logger, internalMessage);
	}

	public NotFoundException(LevelError level, Throwable e, Logger logger, String internalMessage) {
		super(level, e, logger, internalMessage);
	}

	public NotFoundException(LevelError alertUserInfo, String userMessage, Logger logger) {
		super(alertUserInfo, userMessage, logger, userMessage);
	}
	
}
