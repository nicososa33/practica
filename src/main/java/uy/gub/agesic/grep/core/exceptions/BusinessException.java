package uy.gub.agesic.grep.core.exceptions;

import org.slf4j.Logger;

public class BusinessException extends SystemException {

	private static final long serialVersionUID = 1L;

	public BusinessException(LevelError level, Logger logger, String internalMessage) {
		super(level, "Error General", logger, internalMessage);
	}

	public BusinessException(LevelError level, String userMessage, Logger logger, String internalMessage) {
		super(level, userMessage, logger, internalMessage);
	}

	public BusinessException(LevelError level, Throwable e, Logger logger, String internalMessage) {
		super(level, "Error General", e, logger, internalMessage);
	}

	public BusinessException(LevelError level, String userMessage, Throwable e, Logger logger, String internalMessage) {
		super(level, userMessage, e, logger, userMessage);
	}

	///// Sin mensaje interno (Mensaje interno = Mensaje al usuario)

	public BusinessException(LevelError level, Logger logger) {
		super(level, "Error General", logger, "Error General");
	}

	public BusinessException(LevelError level, String userMessage, Logger logger) {
		super(level, userMessage, logger, "Error, el usuairo vio: " + userMessage);
	}

	public BusinessException(LevelError level, Throwable e, Logger logger) {
		super(level, "Error General", e, logger, "Error General");
	}

	public BusinessException(LevelError level, String userMessage, Throwable e, Logger logger) {
		super(level, userMessage, e, logger, "Error, el usuairo vio: " + userMessage);
	}

}
