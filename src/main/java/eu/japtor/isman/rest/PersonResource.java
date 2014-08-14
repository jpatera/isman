/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.japtor.isman.rest;

import eu.japtor.isman.model.Person;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.DELETE;

/**
 * REST Web Service
 *
 * @author Honza
 */
public class PersonResource {

    private String id;

    /**
     * Creates a new instance of PersonResource
     */
    private PersonResource(String id) {
        this.id = id;
    }

    /**
     * Get instance of the PersonResource
     */
    public static PersonResource getInstance(String id) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of PersonResource class.
        return new PersonResource(id);
    }

    /**
     * Retrieves representation of an instance of eu.japtor.isman.rest.PersonResource
     * @return an instance of eu.japtor.isman.model.Person
     */
    @GET
    @Produces("application/xml")
    public Person getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of PersonResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(Person content) {
    }

    /**
     * DELETE method for resource PersonResource
     */
    @DELETE
    public void delete() {
    }
}
