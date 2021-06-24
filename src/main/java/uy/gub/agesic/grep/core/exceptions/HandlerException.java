package uy.gub.agesic.grep.core.exceptions;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import uy.gub.agesic.grep.core.responses.ErrorMessageResponse;
import uy.gub.agesic.grep.core.utils.ErrorCodes;
import uy.gub.agesic.grep.core.utils.Messages;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class HandlerException {// extends ResponseEntityExceptionHandler

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ErrorMessageResponse validationException(MethodArgumentNotValidException ex) {
		BindingResult bindingResult = ex.getBindingResult();
		FieldError fieldError = bindingResult.getFieldError();
		ErrorMessageResponse message = new ErrorMessageResponse();
		message.setErrorKey(fieldError.getDefaultMessage());
		message.setInternalMessage(Messages.getMessages(fieldError.getDefaultMessage()));
		message.setLevel(LevelError.VALIDATION_REQUEST_FAILED);
		return message;
	}

	@ExceptionHandler(BusinessException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public ErrorMessageResponse businessException(BusinessException ex) {
		ErrorMessageResponse message = new ErrorMessageResponse();
		message.setErrorKey(ex.getMessage());
		message.setInternalMessage(Messages.getMessages(ex.getMessage()));
		message.setLevel(ex.getLevel());
		return message;
	}

	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public ErrorMessageResponse serviceException(NotFoundException ex) {
		ErrorMessageResponse message = new ErrorMessageResponse();
		message.setErrorKey(ex.getMessage());
		message.setInternalMessage(Messages.getMessages(ex.getMessage()));
		message.setLevel(ex.getLevel());
		return message;
	}
	
	@ExceptionHandler(org.hibernate.exception.ConstraintViolationException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	@ResponseBody
	public ErrorMessageResponse serviceException(org.hibernate.exception.ConstraintViolationException ex) {
		ErrorMessageResponse message = new ErrorMessageResponse();
		message.setErrorKey(ErrorCodes.YA_EXISTE);
		message.setInternalMessage(Messages.getMessages(ex.getMessage()));
		message.setLevel(LevelError.ALERT_USER_ERROR);
		return message;
	}
	
	@ExceptionHandler(AlreadyExists.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	@ResponseBody
	public ErrorMessageResponse serviceException(AlreadyExists ex) {
		ErrorMessageResponse message = new ErrorMessageResponse();
		message.setErrorKey(ex.getUserMessage());
		message.setInternalMessage(Messages.getMessages(ex.getMessage()));
		message.setLevel(ex.getLevel());
		return message;
	}
	
	@ExceptionHandler(IntegrityException.class)
	@ResponseStatus(HttpStatus.FAILED_DEPENDENCY)
	@ResponseBody
	public ErrorMessageResponse serviceException(IntegrityException ex) {
		ErrorMessageResponse message = new ErrorMessageResponse();
		message.setErrorKey(ex.getMessage());
		message.setInternalMessage(Messages.getMessages(ex.getMessage()));
		message.setLevel(ex.getLevel());
		return message;
	}

}
