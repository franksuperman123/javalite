package app.controllers;

import app.controllers.request_objects.Person;
import app.controllers.request_objects.Plant;
import org.javalite.activeweb.AppController;

public class RequestArgumentController extends AppController {

    public void person(Person person){
        respond(person.toString() );
    }

    public void plant(Plant plant){
        respond("Validators: " + plant.errors().toString());
    }
}