 /*************************************************************************************
 *
 * This class implements the SetInterface by using a linked bag object.
 * LinkedBag and BagInteface programs are given.
 *
 * Requirements:
 * 1. Implement SetInterface and toString() methods using a Bag object to hold data 
 * 2. Must not add new or modify existing data fields; must not add new public methods
 * 3. May add private methods
 *
 ************************************************************************************/

package PJ2;

public class SimpleSet<T> implements SetInterface<T> 
{
	private LinkedBag<T> myBag;

	public SimpleSet()
	{
		myBag = new LinkedBag<T>();
	}
	public T[] toArray() 
	{
		return myBag.toArray();
	}
	public boolean isEmpty() 
	{
		return myBag.isEmpty();
	}
	public boolean add(T newEntry)
	{
		if (myBag.contains(newEntry)) {
			return false;
		}
		return myBag.add(newEntry);
	}
	public int size() 
	{
		return myBag.getCurrentSize();
	}

	public boolean contains(T anEntry)
	{
		return myBag.contains(anEntry);
	}
	public void clear() 
	{
		myBag.clear();
	}
	public T remove()
	{
		return myBag.remove();
	}

	public boolean remove(T anEntry) 
	{
		return myBag.remove(anEntry);
	}
	public SetInterface<T> union(SetInterface<T> anotherSet)
	{
		SimpleSet<T> output = new SimpleSet<T>();
		for (T object : this.toArray()) {
			output.add(object);
		}
		for (T object : anotherSet.toArray()) {
			output.add(object);
		}
		return output;
	}
	public SetInterface<T> intersection(SetInterface<T> anotherSet)
	{
		SimpleSet<T> output = new SimpleSet<T>();
		for (T object : this.toArray()) {
			if (anotherSet.contains(object)) {
				output.add(object);
			}
		}
		return output;
	}
	public SetInterface<T> difference(SetInterface<T> anotherSet)
	{
		SimpleSet<T> output = new SimpleSet<T>();
		for (T object : this.toArray()) {
			if (!anotherSet.contains(object)) {
				output.add(object);
			}
		}
		return output;
	}
	public boolean subset(SetInterface<T> anotherSet)
	{
		for (T object : this.toArray()) {
			if (!anotherSet.contains(object)) {
				return false;
			}
		}
		return true;
	}
	public String toString()
   	{
		T[] part = toArray();
		String str = "{";

		for (int i = 0; i < size(); i++) {
			str += part[i];

			if (i != size() - 1) {
				str += ", ";
			}
		}
		str += "}";
		return str;
   	}
}
