package com.learning.lili_seckill.config;

import com.learning.lili_seckill.entity.TUser;
import com.learning.lili_seckill.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * 自定义用户参数
 */
@Component
public class UserArgumentResolver implements HandlerMethodArgumentResolver {

    @Autowired
    private ITUserService itUserService;

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        Class<?> parameterType = parameter.getParameterType();
        return parameterType == TUser.class;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {

        return UserContext.getUser();

        //        HttpServletRequest nativeRequest = webRequest.getNativeRequest(HttpServletRequest.class);
//        HttpServletResponse nativeResponse = webRequest.getNativeResponse(HttpServletResponse.class);
//        String userTicket = CookieUtil.getCookieValue(nativeRequest, "userTicket");
//        if (StringUtils.isEmpty(userTicket)) {
//            return null;
//        }
//        return itUserService.getUserByCookie(userTicket, nativeRequest, nativeResponse);
    }

}
