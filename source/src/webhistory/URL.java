package webhistory;

public class URL {
	private String url;

	URL(String theURL) {
		url = theURL;
	}

	@Override
	public String toString() {
		return url;
	}
}