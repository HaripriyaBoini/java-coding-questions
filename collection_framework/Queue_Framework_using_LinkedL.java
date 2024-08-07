package collection_framework;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;                //add,remove,offer,poll,peek

public class Queue_Framework_using_LinkedL implements Queue<String>{

	
	    private LinkedList<String> list = new LinkedList<>();

	    @Override
	    public boolean add(String e) {
	        return list.add(e);
	    }

	    @Override
	    public boolean offer(String e) {
	        return list.offer(e);
	    }

	    @Override
	    public String remove() {
	        return list.remove();
	    }

	    @Override
	    public String poll() {
	        return list.poll();
	    }

	    @Override
	    public String element() {
	        return list.element();
	    }

	    @Override
	    public String peek() {
	        return list.peek();
	    }

	    // Other methods from Queue interface can be implemented similarly

	    public static void main(String[] args) {
	        // Creating a Queue using LinkedList
	        Queue<String> queue = new Queue_Framework_using_LinkedL();

	        // Adding elements to the Queue using add() or offer()
	        queue.add("First");
	        queue.offer("Second");
	        queue.add("Third");

	        // Retrieving and removing the head of the Queue using remove() or poll()
	        String removedElement1 = queue.remove();
	        System.out.println("Removed Element: " + removedElement1);

	        String removedElement2 = queue.poll();
	        System.out.println("Removed Element: " + removedElement2);

	        // Retrieving the head of the Queue without removing it using element() or peek()
	        String peekedElement = queue.element();
	        System.out.println("Peeked Element: " + peekedElement);

	        String peekedElementAgain = queue.peek();
	        System.out.println("Peeked Element: " + peekedElementAgain);
	    }

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterator<String> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T> T[] toArray(T[] a) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean addAll(Collection<? extends String> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
	}



