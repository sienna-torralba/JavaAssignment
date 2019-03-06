package com.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/animal")
public class AnimalsAPI {
	
	@GET
	@Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
	public Response getFlatInfo(@PathParam("name") String name) {
		
		try {
			
			
		} catch(WebApplicationException wae) {
			throw wae;
			
		} catch(Exception e) {
			throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
		}
		
		return Response.ok("Successful!", MediaType.APPLICATION_JSON).build();
	}
	
	
}



