package eg1;

public class Flight1 {
	private int id;
	private String name;
	private int num;
	private float rating;
	
	public Flight1() {
		// TODO Auto-generated constructor stub
	}

	public Flight1(int id, String airplaneName, int numPassengers) {
		super();
		this.id = id;
		this.name = airplaneName;
		this.num = numPassengers;
	}

	@Override
	public String toString() {
		return "Flight1 [id=" + id + ", name=" + name + ", num=" + num + ", rating=" + rating + "]";
	}

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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight1 other = (Flight1) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
