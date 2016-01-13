package org.jqing.openservice.biz.route.invocation;

import org.jqing.openservice.biz.route.params.SimpleParam;
import org.jqing.openservice.biz.route.request.Request;
import org.jqing.openservice.biz.route.response.Response;

import java.util.List;

/**
 * Created by user on 2016/1/13.
 */
public interface Invocation {

    boolean prepare(Request request, Response response);

    public Object invoke();

    List<SimpleParam> getParameters();

    void setParameters(List<SimpleParam> parameters);

}
