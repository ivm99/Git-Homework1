public class Report implements Reportable{
    
    private User user;
    
    public Report(User user) {
        this.user = user;
    }
    @Override
    public void report(){
		System.out.println("Report for user: " + user.getName());
	}
}
