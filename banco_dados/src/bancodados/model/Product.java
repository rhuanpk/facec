package bancodados.model;

@SuppressWarnings("unused")
public class Product {

	private long id;
	private String name;
	private String sku;
	private double price;

	public Product() {
	}

	public Product(String sku, double price) throws IllegalArgumentException {
		setSku(sku);
		setPrice(price);
	}

	public Product(String name, String sku, double price) throws IllegalArgumentException {
		setName(name);
		setSku(sku);
		setPrice(price);
	}

	public void setId(long id) throws IllegalArgumentException {
		if (id < 1)
			throw new IllegalArgumentException("'id' can't be less than 1");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) throws IllegalArgumentException {
		if (sku.isBlank())
			throw new IllegalArgumentException("'sku' can't be blank");
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws IllegalArgumentException {
		if (price < 0)
			throw new IllegalArgumentException("'price' can't be less than 0");
		this.price = price;
	}

}
