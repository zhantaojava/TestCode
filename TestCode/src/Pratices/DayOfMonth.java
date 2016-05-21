package Pratices;

public enum DayOfMonth {
	Jan(31,"Januery"),
	Feb(28,"February"),
	Mar(31,"March"),
	April(28,"February");
	
	private int days;
	private String des;
	
	DayOfMonth(int days,String des){
		this.days=days;
		this.des=des;
	}

	public int getDays() {
		return days;
	}
	
	public String getDes(){
		return des;
	}

	
	
	
}
