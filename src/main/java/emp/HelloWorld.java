package emp;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class HelloWorld {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(){
        try{
            return Response.status(Response.Status.OK).entity(EmployeeFakeWebService.getInstance().getEmployees()).build();
        } catch(Throwable t){
         return  Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id")int id){
        try{
            return Response.status(Response.Status.OK).entity(EmployeeFakeWebService.getInstance().get(id)).build();
        } catch(Throwable t){
            return  Response.status(Response.Status.NOT_FOUND).build();
        }
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Employee employee){
        try{
            return Response.status(Response.Status.OK).entity(EmployeeFakeWebService.getInstance().add(employee)).build();
        } catch(Throwable t){
            return  Response.status(Response.Status.NOT_FOUND).build();
        }
    }


    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response upadte(Employee employee){
        try{
            return Response.status(Response.Status.OK).entity(EmployeeFakeWebService.getInstance().update(employee)).build();
        } catch(Throwable t){
            return  Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}

