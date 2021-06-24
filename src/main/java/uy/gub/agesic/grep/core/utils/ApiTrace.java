package uy.gub.agesic.grep.core.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import net.atos.aspect.AtosTraceAspect;


@Component
@Aspect	
public class ApiTrace extends AtosTraceAspect {
	
	public static final String TRACE_PACKAGE = "execution(* uy.gub.agesic..*.* (..))";

	@Pointcut(TRACE_PACKAGE)
	public void resources() {
	}

	@Before("resources()")
	public void apiRequestLog(JoinPoint jp) {
		super.apiRequestLog(jp);
	}

	@AfterReturning(pointcut = "resources()", returning = "returnValue")
	public void apiResponseLog(JoinPoint jp, Object returnValue) {
		super.apiResponseLog(jp, returnValue);
	}

	@AfterThrowing(pointcut = "resources()", throwing = "exception")
	public void apiResponseExceptionLog(JoinPoint jp, Exception exception) {
		super.apiResponseExceptionLog(jp, exception);
	}
}