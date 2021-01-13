package jan_11;

public class EncapConcept {

	private String title;
	public String name;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	private void updateAcctBalance() {
		int amt =0;
		int deposit = 1000;
		
		int totalbalance = amt+deposit;
		System.out.println(totalbalance);
		
	}
	
	public void balanceUpdate() {
		updateAcctBalance();
	}
}
