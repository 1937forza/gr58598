package persistence.dao;

import model.PersonModel;

import java.util.List;

public interface PersonDao {

    List<PersonModel> getALLPersons();

    void addPerson(PersonModel model);

    void updatePerson(PersonModel model);

    void deletePerson(Integer id);

}
