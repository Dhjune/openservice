package org.jqing.openservice.biz.route;

import org.jqing.openservice.biz.route.filter.Filter;
import org.jqing.openservice.biz.route.request.Request;
import org.jqing.openservice.biz.route.response.Response;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user on 2016/1/14.
 */
public class FilterContext {

    private Iterator<Filter> filterIterator;

    private Map<String, Object> attributes = new HashMap<String, Object>();

    public Response doNextFilter(Request request, Response response){
        Filter filter =  nextFilter();
        if (filter!=null){
            return filter.doFilter(request,response,this);
        }
        return response;
    }

    protected  Filter nextFilter(){
        if(filterIterator.hasNext()){
            return  filterIterator.next();
        }
        return null;
    }

    public Iterator<Filter> getFilterIterator() {
        return filterIterator;
    }

    public void setFilterIterator(Iterator<Filter> filterIterator) {
        this.filterIterator = filterIterator;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }
}
