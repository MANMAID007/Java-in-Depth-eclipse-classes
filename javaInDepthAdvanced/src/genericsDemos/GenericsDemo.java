package genericsDemos;

public class GenericsDemo {
	public static void main(String[] arg) {
		Container<String> storeString = new Store<>();
		storeString.set("Java");
		System.out.println(storeString.get());
	}
}
