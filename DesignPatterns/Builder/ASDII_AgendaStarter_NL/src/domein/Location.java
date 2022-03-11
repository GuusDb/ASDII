package domein;

public class Location {
	private String location;

	public Location() {
	}

	public Location(String newLocation) {
		location = newLocation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String newLocation) {
		location = newLocation;
	}

	@Override
	public String toString() {
		return location;
	}
}