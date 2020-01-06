package srit.rhes.api.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreFilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import srit.rhes.api.model.UserSession;
import srit.rhes.api.repositery.UserSessionRepositery;
@PreFilter(value = "pre")
public class SecurityPreFilter extends ZuulFilter{
	 private static Logger log = LoggerFactory.getLogger(SecurityPreFilter.class);
	
	@Autowired
	UserSessionRepositery userSessionRepositery;
	
	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();    
		/*
		 * ctx.addZuulRequestHeader("Authorization",
		 * request.getHeader("Authorization"));
		 */
		String httpSession=request.getSession().getId();
		UserSession session=userSessionRepositery.findBysessionId(httpSession);
		if(httpSession.equalsIgnoreCase(session.getSessionId())) {
			}else {
				ctx.addZuulRequestHeader("Authorization",
						request.getHeader("Authorization"));
			}
		log.info(String.format("%s request to %s", request.getMethod(), 
				request.getRequestURL().toString()));
		return null;
	}
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		
		return 1;
	}
}
