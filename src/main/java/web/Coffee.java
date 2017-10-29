package web;
import javax.persistence.*;

@Entity
@Table(name="coffee")
public class Coffee {
	@Id long id;
	String name;
	char size;
	double price;
	public String getName()  { return name;  }
	public char   getSize()  { return size;  }
	public double getPrice() { return price; }
}
