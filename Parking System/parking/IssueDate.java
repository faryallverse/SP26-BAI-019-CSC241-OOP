package parking.core;

public class IssueDate{
	private int day;
	private int month;
	private int year;

	public IssueDate(int d, int m, int y){
		this.day = d;
		this.month = m;
		this.year = y;
	}

	public String format(){
		return day + "/" + month + "/" + year;
	}
}