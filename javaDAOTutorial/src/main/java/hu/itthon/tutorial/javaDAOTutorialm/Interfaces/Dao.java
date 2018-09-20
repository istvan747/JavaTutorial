package hu.itthon.tutorial.javaDAOTutorialm.Interfaces;

import java.util.List;

public interface Dao<T> {
	
	T get(long id);
	
	List<T> getAll();
	
	void save(T t);
	
	void update(T t, String name, String email);
	
	void delete(T t);
	
}
