package hu.itthon.tutorial.javaDAOTutorialm.DAO;

import java.util.ArrayList;
import java.util.List;

import hu.itthon.tutorial.javaDAOTutorialm.Interfaces.Dao;
import hu.itthon.tutorial.javaDAOTutorialm.Model.User;

public class UserDao implements Dao<User>{

	private List<User> users = new ArrayList<User>();

	public User get(long id) {
		return users.get( (int)id );
	}

	public List<User> getAll() {
		return users;
	}

	public void save(User t) {
		users.add(t);	
	}

	public void update(User t, String name, String email) {
		User setUser = new User(name, email);
		for(int i = 0; i <= users.size(); i++) {
			if(users.get(i).equals(t)) {
				users.set(i, setUser);
			}
		}
	}

	public void delete(User t) {
		users.remove(t);
	}
}
