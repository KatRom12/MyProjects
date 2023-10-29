class StackEmptyException extends RuntimeException {}
class StackFullException extends RuntimeException {}

public class Stack{
	private int[] stos;
	private int currentSize;
	
	public Stack (int stackSize){
		if (stackSize < 0){
			throw new IllegalArgumentException();
		}
		this.stos = new int[stackSize];
	}	
	
	public void push (int number){
		if (currentSize == stos.length){
			throw new StackFullException();
		} 
		stos[currentSize++] = number;
	}
	
	public int pop() {
		if (currentSize == 0){
			throw new StackEmptyException();
		}
		return stos[--currentSize];
	}
	
	public void clear(){
		currentSize = 0;
	}	

	public int top(){
		if (currentSize == 0){
			throw new StackEmptyException();
		}	
		return stos[currentSize - 1];
	}	

	public int size(){
		return currentSize;
	}	
	
	public static void main (String[] args){
		try {
			Stack stack1 = new Stack(5);
			System.out.println("Rozmiar: " + stack1.size());
			stack1.push(3);
			stack1.push(4);
			System.out.println("Rozmiar: " + stack1.size());
			System.out.println("Top: " + stack1.top());
			stack1.clear();
			stack1.push(3);
			stack1.push(4);
			stack1.push(5);
			System.out.println("Rozmiar: " + stack1.size());
			System.out.println("Pop: " + stack1.pop());
			System.out.println("Rozmiar: " + stack1.size());
		} catch (StackEmptyException e) {
			System.out.println("Stos jest pusty! " + e.getMessage());
		} catch (StackFullException e) {
			System.out.println("Stos jest pełny! " + e.getMessage());
		}
	}	
}	