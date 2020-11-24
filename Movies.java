
public class Movies {
	 private String name;
	    private double ticketPrice ;
	    private int budget;
	    private int numberOfVisitors;
	    
	    public String getName() {
	        return name;
	    }

	    public void setName(String name1) {
	        if (name1 != null) {
	            this.name = name1;
	        }
	    }

	    public double getTicketPrice() {
	        return ticketPrice;
	    }

	    public void setTicketPrice(double price1) {
	        if (price1 > 0) {
	            this.ticketPrice = price1;
	        }
	    }

	    public int getBudget() {
	        return budget;
	    }

	    public void setBudget(int budget1) {
	        this.budget = budget1;
	    }

	    public int getNumberOfVisitors() {
	        return numberOfVisitors;
	    }

	    public void setNumberOfVisitors(int visit1) {
	        this.numberOfVisitors = visit1;
	    }
	    public Movies(String name, double ticketPrice , int budget, int numberOfVisitors) {
	        setName(name);
	        setTicketPrice(ticketPrice);
	        setBudget(budget);
	        setNumberOfVisitors(numberOfVisitors);

	    }

	    public Movies() {
	        this("Chicho Parjo", 2.98 , 2000 , 351);
	    }

	    public Movies(Movies obj) {
	        this(obj.getName(), obj.getTicketPrice(), obj.getBudget(), obj.getNumberOfVisitors());
	    }

	    public String toString() {
	        return String.format("Ime:%s Cena na bilet%.2f Budjet na Filma:%d Doshli da gledat:%d",getName(), getTicketPrice(), getBudget(), getNumberOfVisitors());
	    }

public double income(double pp, double qq) {
	double incom=0;
	incom=pp*qq;
	return incom;
}
boolean Pechalba(double in, double bu) {
	
if(in*bu>budget) {
	return true;	
}
else {
	return false;
}
}


}
