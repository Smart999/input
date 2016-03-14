package resources;





public class Loginbean  {
	private String user;
	private String pwd;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String register() 
	 {
	    if (user.equals("raja") && pwd.equals("jsf")) 
		{
	       return("success");
	    }
		else
		

	      return("failure");
	    
	 }

}
