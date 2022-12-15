public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persistable sv = new Persister(user);
		sv.save();
		Reportable report = new Report(user);
		report.report();
	}
}