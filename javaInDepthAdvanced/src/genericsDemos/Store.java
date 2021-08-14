package genericsDemos;

public class Store<T> implements Container<T>{
	private T a;
	@Override
	public void set(T a) {
		this.a = a;
	}

	@Override
	public T get() {
		return a;
	}

}
