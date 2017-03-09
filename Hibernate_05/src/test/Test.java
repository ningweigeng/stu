package test;

import java.util.List;

import cn.por.Person;
import impl.PersonImpl;
import dao.PersonDao;

public class Test {
	
	public static void main(String[] args) {
		
		PersonDao personDao=new PersonImpl();
		
	/*	List<Person> list=personDao.findAll();
		
		for (int i = 0; i < list.size(); i++) {
			
			Person person=list.get(i);
			
			System.out.println(person.getPid()+","+person.getPname());
			
		}*/
		
		
		Person person=personDao.findById(1);
		
		System.out.println(person.getPid()+","+person.getPname());
		
	}

}
