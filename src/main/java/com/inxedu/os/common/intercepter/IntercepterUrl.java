package com.inxedu.os.common.intercepter;

import com.inxedu.os.common.util.SingletonLoginUtils;
import com.inxedu.os.edu.entity.user.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 请求打印
 * @author www.inxedu.com
 */
public class IntercepterUrl extends HandlerInterceptorAdapter{


	public boolean preHandle(HttpServletRequest request,
							 HttpServletResponse response, Object handler) throws Exception {
//		StringBuffer url = request.getRequestURL();
//		System.out.println("请求地址");
//		System.out.println(url);
//		System.out.println("\n");
		return true;
	}


	public void postHandle(HttpServletRequest request,
						   HttpServletResponse response, Object handler,
						   ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}


	public void afterCompletion(HttpServletRequest request,
								HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}


	public void afterConcurrentHandlingStarted(HttpServletRequest request,
											   HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		super.afterConcurrentHandlingStarted(request, response, handler);
	}

}
