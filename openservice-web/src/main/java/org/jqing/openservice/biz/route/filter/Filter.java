package org.jqing.openservice.biz.route.filter;

import org.jqing.openservice.biz.route.FilterContext;
import org.jqing.openservice.biz.route.request.Request;
import org.jqing.openservice.biz.route.response.Response;

/**
 * Created by user on 2016/1/13.
 */
public interface Filter {

    public Response doFilter(Request request, Response response, FilterContext filterContext);

}
