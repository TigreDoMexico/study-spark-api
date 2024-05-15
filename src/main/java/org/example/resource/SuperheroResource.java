package org.example.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.example.services.SuperheroService;

@Path("/superhero")
public class SuperheroResource {
    @Inject
    public SuperheroService service;

    @GET
    @Path("/list")
    public Response list() {
        return Response.ok(service.GetAll()).build();
    }

    @GET
    @Path("/get/{id}")
    public Response getById(@PathParam("id") int id) {
        return Response.ok(service.Get(id)).build();
    }
}
