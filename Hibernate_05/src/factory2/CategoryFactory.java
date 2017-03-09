package factory2;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CategoryFactory {
	
	public static Configuration conf=null;
	
	public static SessionFactory factory=null;
	
	//threadLocal : 本地线程
	//可以保存一个对象,在同一个线程范围内共享
	private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
		
	static{
		try {
			conf = new Configuration().configure();
			factory = conf.buildSessionFactory();
		} catch (HibernateException e) {
			System.out.println("##########解析配置文件出错############");
			e.printStackTrace();
		}
	}
	
	
	public static Session getSession(){
		Session se=threadLocal.get();
		
		if(se==null){
			
			se=factory.openSession();
		}
		
		threadLocal.set(se);
		
		return se;
					
	}
	
	public static void closeSession(){
		
		Session se=threadLocal.get();
		
		if(se!=null){
			
			se.close();
		}
		
		threadLocal.set(null);
		
	}
		

}
