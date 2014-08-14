/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.japtor.isman.rest;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Honza
 */
@Path("name")
@Stateless
public class NameService {
//    @EJB
//    private NameBean nameBean;
    private String name = "QqQq";

    public NameService() {
    }

    @GET
    @Path("/getNameHtml/{suff}")
    @Produces(MediaType.TEXT_HTML)
    public String getHtml(@PathParam("suff")String suff) {
//        return "<h2>Hello "+nameBean.getName()+"</h2>";
        name = name + " " + suff;
        return "<h2>Hello Mr." + name + "</h2>";
    }

    @GET
    @Path("/getNameJson/{suff}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("suff")String suff) {
//        return "<h2>Hello "+nameBean.getName()+"</h2>";
        name = name + " " + suff;
        return name;
    }

    @PUT
    @Consumes("text/plain")
    public void put(String content) {
//        nameBean.setName(content);
        name = name + " A";
    }

}
