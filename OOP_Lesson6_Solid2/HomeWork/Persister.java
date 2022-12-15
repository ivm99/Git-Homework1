public class Persister implements Persistable{
	private User user;
	
	public Persister(User user){
		this.user = user;
	}
	@Override
	public void save(){
		System.out.println("Save user: " + user.getName());
	}
}