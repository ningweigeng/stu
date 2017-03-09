package impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.por.Person;
import dao.PersonDao;
import factory2.CategoryFactory;

public class PersonImpl implements PersonDao {

	@Override
	public List<Person> findAll() {
		Session session=null;
		try {
			
			session=CategoryFactory.getSession();
			
			String hql="from Person";
			
			Query query=session.createQuery(hql);
			
			return query.list();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			CategoryFactory.closeSession();
			
		}
		
		return null;
	}

	@Override
	public Person findById(Integer pid) {
		
		Session session=null;
		try {
			
			session=CategoryFactory.getSession();
			
			String hql="from Person where pid=?";
			
			Query query=session.createQuery(hql);
			
			query.setParameter(0, pid);
			
			return (Person) query.uniqueResult();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
			
			CategoryFactory.closeSession();
		}
		
		return null;
	}

}
