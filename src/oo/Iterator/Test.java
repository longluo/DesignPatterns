package oo.Iterator;


public class Test {
	public static void main(String[] args) {
		String fileName = "F:\\Android\\work\\DesignPatterns\\src\\oo\\Iterator\\data.txt";
		DataVector dataVector = new DataVector(fileName);
		Iterator iVector = dataVector.CreateIterator();
		for (iVector.First(); !iVector.IsDone(); iVector.Next()) {
			iVector.CurrentItem();
		}
	}
}
