package webhistory;

public class WebHistory {
	private StackInterface<URL> history;
	private StackInterface<URL> forward;

	public WebHistory() {
		history = new StackLinked<URL>();
		forward = new StackLinked<URL>();
	}

	public void add(URL where) {
		forward = new StackLinked<URL>();
		history.push(where);
	}

	public URL previous() {
		URL theItem = history.pop();

		forward.push(theItem);

		return current();
	}

	public URL current() {
		if (history.size() == 0)
			return null;

		URL currentURL = history.pop();
		history.push(currentURL);
		return currentURL;
	}

	public URL forward() {
		URL nextURL = forward.pop();
		history.push(nextURL);
		return nextURL;
	}

	public int historySize() {
		return history.size();
	}

	public int forwardSize() {
		return forward.size();
	}
}