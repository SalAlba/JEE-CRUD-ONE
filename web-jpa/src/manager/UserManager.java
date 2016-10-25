package manager;

import javax.ejb.Remote;

@Remote
public interface UserManager {
	public void CreateUser();
}
