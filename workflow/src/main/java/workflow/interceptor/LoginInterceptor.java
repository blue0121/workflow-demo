package workflow.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import workflow.model.UserEntity;
import workflow.util.Const;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Jin Zheng
 * @since 2022-05-09
 */
public class LoginInterceptor implements HandlerInterceptor {
	public LoginInterceptor() {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		var session = request.getSession();
		var user = (UserEntity) session.getAttribute(Const.USER_KEY);
		if (user == null) {
			response.sendRedirect("/login");
			return false;
		}

		return true;
	}
}
