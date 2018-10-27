package org.restapi.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentResource {
	
	@GET
	public String test() {
		return "new subresource";
	}
	
	@GET
	@Path("/{commentId}")
    public String test2(@PathParam("messageId") long messageId, @PathParam("commentId") long commentId) {
    	return "Method to return commnet id";
	}

}
