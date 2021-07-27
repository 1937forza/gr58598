package controller;
import model.PersonModel;
import persistence.service.PersonService;
import persistence.service.PersonServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/index")
public class indexController {

 /*  @Path("/hello")
   @GET

   public void sayHello(){
       System.out.println("Hello World");
   }*/

/*@Path("/hello/{name}/{surname}")
@GET
public String sayHello(@PathParam("name") String ad, @PathParam("surname") String soyad){

    return "Hello " + ad + " " + soyad;
}*/

  /*  @Path("/hello")
    @GET
    public String sayHello (@QueryParam("name") String ad, @QueryParam("surname") String soyad){

        return "Hello " + ad+ " "  +soyad ;
    } */

    /*@Path("/hello")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public PersonModel sayHello(){



        return new PersonModel(1000, "Eyyub" , "Qedirov");


    }*/
//    @Path("/hello")
//    @GET
//    @Consumes(MediaType.APPLICATION_JSON)
//    public PersonModel sayHello(@QueryParam("id") Integer id){
//
//        return new PersonModel(id,"Eyyub","Qedirov");
//    }


    private PersonService personService = new PersonServiceImpl();

    @Path("/update")
    @PUT
    @Consumes (MediaType.APPLICATION_JSON)
    @Produces (MediaType.APPLICATION_JSON)
    public void update(PersonModel model){

        personService.updatePerson(model);

    }

    @Path("/{id}")
    @DELETE
    public void delete(@PathParam("id") Integer id){

        personService.deletePerson(id);

    }



    @Path("/get")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)

    public List<PersonModel> getAllPersons(){

        return personService.getALLPersons();
    }

    @Path("/add")
    @POST
    @Consumes (MediaType.APPLICATION_JSON)
    @Produces (MediaType.APPLICATION_JSON)
    public void post (PersonModel model) {

        personService.addPerson(model);

    }

}
