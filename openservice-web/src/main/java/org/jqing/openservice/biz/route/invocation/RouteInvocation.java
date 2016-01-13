package org.jqing.openservice.biz.route.invocation;

import org.jqing.openservice.biz.route.params.SimpleParam;
import org.jqing.openservice.biz.route.request.Request;
import org.jqing.openservice.biz.route.response.Response;

import java.util.List;

/**
 *
 */
public class RouteInvocation implements  Invocation{

    public boolean prepare(Request request, Response response) {

        return false;
    }

    public Object invoke() {
        return null;
    }

    public List<SimpleParam> getParameters() {
        return null;
    }

    public void setParameters(List<SimpleParam> parameters) {

    }
}
