package uy.gub.agesic.grep.core.interceptors;

import uy.gub.agesic.grep.core.utils.Constants;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//ModelMapper
public class UsernameInterceptor extends HandlerInterceptorAdapter implements ClientHttpRequestInterceptor {
	private static final Logger log = LoggerFactory.getLogger(UsernameInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.debug(Constants.UACT == null ?"Request sin " + Constants.UACT:"Recibí el header " + Constants.UACT + ": "+ request.getHeader(Constants.UACT));
		log.debug(Constants.CORRELATION_ID_HEADER == null ?"Request sin " + Constants.CORRELATION_ID_HEADER:"Recibí el header " + Constants.CORRELATION_ID_HEADER + ": "+ request.getHeader(Constants.UACT));
		
		String uact = request.getHeader(Constants.UACT) == null ? Constants.USERNAME : request.getHeader(Constants.UACT);
		String corrId = request.getHeader(Constants.CORRELATION_ID_HEADER) == null ? UUID.randomUUID().toString() : request.getHeader(Constants.CORRELATION_ID_HEADER);
		ThreadContext.put(Constants.UACT, uact);
		log.debug("Request of: " + uact);
		ThreadContext.put(Constants.CORRELATION_ID_HEADER, corrId);
		return true;
	}

	@Override
	public ClientHttpResponse intercept(HttpRequest httpRequest, byte[] bytes,
			ClientHttpRequestExecution clientHttpRequestExecution) throws IOException {
		return null;
	}
}