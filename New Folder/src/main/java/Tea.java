/**
 * 
 * @author Beniamin
 *
 */
public class Tea {

	private String code;
	private String name;
	private int quantity;
	private int price;

	public Tea() {
	}

	public Tea(String code, String name, int quantity, int price) {
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tea [code=" + code + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
}
