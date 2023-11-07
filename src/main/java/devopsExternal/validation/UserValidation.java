package devopsExternal.validation;
import java.util.ResourceBundle;
public class UserValidation {
	public boolean check(String name,String pws)
	{
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String username = rb.getString("username");
		String password = rb.getString("password");
		if(username.equals(name) && password.equals(pws))
		{
			return true;
		}
		return false;
	}
}
