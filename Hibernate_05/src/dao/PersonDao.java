package dao;

import java.util.List;

import cn.por.Person;

public interface PersonDao {
	
	public List<Person> findAll();
	
	
	public Person findById(Integer pid);

}
