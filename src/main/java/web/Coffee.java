package web;
import javax.persistence.*;

@Entity
@Table(name="coffee")
public class Coffee {
	@Id long id;
	public String name;
	public char size;
	public double price;
}
