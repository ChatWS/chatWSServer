/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
//import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
//import com.sun.jersey.spi.container.servlet.ServletContainer;
//import com.sun.jersey
//import com.sun.jersey.property.packages;

/**
 *
 * @author Sara
 */
@Path("service")
public class HelloRest {
   
     
    
    
    
    @GET
    @Path("/getMessage")
    @Produces("text/plain")
    public String getMessage() {
        
       return "hello rest";
    }
    
      
    @GET
    @Path("/getParamMessage/{name}")
    @Produces("text/plain")
    public String getParamMessage(@PathParam("name")String content) {
        System.out.println(content);
        return content;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
