package uy.gub.agesic.grep.core.exceptions;

import org.slf4j.Logger;

public class AlreadyExists extends SystemRuntimeException {

	private static final long serialVersionUID = 1L;

	public AlreadyExists(LevelError level, String userMessage, Logger logger, String internalMessage) {
		super(level, userMessage, logger, internalMessage);
	}

	public AlreadyExists(LevelError level, String userMessage, Throwable e, Logger logger, String internalMessage) {
		super(level, userMessage, e, logger, internalMessage);
	}

	public AlreadyExists(LevelError level, Logger logger, String internalMessage) {
		super(level, logger, internalMessage);
	}

	public AlreadyExists(LevelError level, Throwable e, Logger logger, String internalMessage) {
		super(level, e, logger, internalMessage);
	}

	public AlreadyExists(LevelError alertUserInfo, String userMessage, Logger logger) {
		super(alertUserInfo, userMessage, logger, userMessage);
	}

}
