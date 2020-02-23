package stack;

import java.util.ArrayList;
import java.util.List;

public class ListStack<X> implements Stack<X> {

	private List<X> data;
	private int stackPointer;
	 
	public ListStack() {
		data = new ArrayList<X>();
	}
	
	@Override
	public void push(X newItem) {
		data.add(newItem);
	}

	@Override
	public X pop() {
		X dataPop = data.get(data.size() - 1);
		data.remove(data.size() - 1);
		return dataPop;
	}

	@Override
	public boolean contains(X item) {
		return data.contains(item);
	}

	@Override
	public X access(X item) {
		return data.get(data.indexOf(item));
	}

	@Override
	public int size() {
		return data.size();
	}
	

}
