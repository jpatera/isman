/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.japtor.isman.rest;

import eu.japtor.isman.model.Person;
import javax.activation.MimeType;
import javax.activation.MimetypesFileTypeMap;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Honza
 */
@Path("people")
public class PeopleResource {
    @PersistenceContext
    EntityManager em;

//    @Context
//    private UriInfo context;

    /**
     * Creates a new instance of PeopleResource
     */
//    public PeopleResource() {
//    }

    /**
     * Retrieves representation of an instance of eu.japtor.isman.rest.PeopleResource
     * @return an instance of eu.japtor.isman.model.Person
     */
    @GET
//    @Produces("application/xml")
    public String people() {
        return "person 1, person 2";
    }

    
    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person person(@PathParam("name") String name) {
        String rawCode = java.util.UUID.randomUUID().toString();
//        String rawCode = java.util.UUID.nameUUIDFromBytes(name.getBytes()).toString();
        return new Person(rawCode, name);
    }
    
//    /**
//     * POST method for creating an instance of PersonResource
//     * @param content representation for the new resource
//     * @return an HTTP response with content of the created resource
//     */
//    @POST
//    @Consumes("application/xml")
//    @Produces("application/xml")
//    public Response postXml(Person content) {
//        //TODO
//        return Response.created(context.getAbsolutePath()).build();
//    }

//    /**
//     * Sub-resource locator method for {id}
//     */
//    @Path("{id}")
//    public PersonResource getPersonResource(@PathParam("id") String id) {
//        return PersonResource.getInstance(id);
//    }
    
}
