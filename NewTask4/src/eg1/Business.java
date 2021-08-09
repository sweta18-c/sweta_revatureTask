package eg1;

public class Business {

	public boolean validName(String name)throws InvalidNameException 
	{
		// TODO Auto-generated method stub
		if(name.matches("[a-zA-Z0-9]")) {
			return true;
		}
		else {
			throw new InvalidNameException("exception occurs in name");
		}
	}
	public boolean validPassward(String password)throws InvalidPasswordException{
		if(password.matches("[a-zA-Z0-9@-#>]{7,}"){
			return true;
		}
		else {
			throw new InvalidPasswordException("password incorrect format");
		}
	}

}
