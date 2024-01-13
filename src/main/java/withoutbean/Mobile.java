package withoutbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	public void used() {
		System.out.println("it is used for chatting");
	}
    @Value("1")
	private int id;
    @Value("vivo")
	private String name;
    
    @Autowired
	private Charger charger;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Charger getCharger() {
		return charger;
	}
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", charger=" + charger + "]";
	}
	
}
