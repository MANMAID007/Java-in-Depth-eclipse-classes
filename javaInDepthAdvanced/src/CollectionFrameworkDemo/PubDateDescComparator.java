package CollectionFrameworkDemo;

import java.util.Comparator;

public class PubDateDescComparator implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {
		int comp;
		comp = o2.getYear() - o1.getYear();
		if (comp == 0) return o1.getTitle().compareTo(o2.getTitle());
		return comp;
	}
}
