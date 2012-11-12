package linkedlist;

class LinkBox {
	Object	thingToStore;
	LinkBox	nextOnList;

	LinkBox(Object thingToStore, LinkBox nextOnList) {
		this.thingToStore = thingToStore;
		this.nextOnList = nextOnList;
	}

	void setNext(LinkBox nextOnList) {
		this.nextOnList = nextOnList;
	}

	LinkBox getNext() {
		return nextOnList;
	}

	Object getItem() {
		return thingToStore;
	}

	@Override
	public String toString() {
		return thingToStore.toString();
	}
}