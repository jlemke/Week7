package edu.matc.restdemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/hello")
public class HelloWorld {

    @GET
    @Produces("application/xml")
    @Path("/{name}")
    public Response getMessageAsXml(@PathParam("name") String name) {
        // Return a simple message
        Hello output = new Hello();
        output.setName(name);

        return Response.status(200).entity(output).build();
    }

    @GET
    @Produces("plain/text")
    @Path("/{name}")
    public Response getMessageAsText(@PathParam("name") String name) {
        // Return a simple message
        String output = "Hello " + name;

        return Response.status(200).entity(output).build();
    }

    @GET
    @Produces("application/json")
    @Path("/{name}")
    public Response getMessageAsJson(@PathParam("name") String name) {
        // Return a simple message
        Hello output = new Hello();
        output.setName(name);

        return Response.status(200).entity(output).build();
    }

}
