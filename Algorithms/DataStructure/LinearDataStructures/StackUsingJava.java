package LinearDataStructures;

class Stack{
	
	int capacity;
	char[] arr;
	int top;
	
	public Stack(int capacity){
		
		this.capacity = capacity;
		this.top = -1;
		this.arr = new char[capacity];
	}
	
	public boolean isEmpty(){
		
		return this.top == -1;
	}
	
	public boolean isFull(){
		
	 return this.top == this.capacity- 1;
	}
	
	
	public void push(char c){
		
		if(!this.isFull()){
		this.arr[++top] = c;
		}
	}
	
	public char pop(){
		
		return this.isEmpty()?'\u0000':this.arr[this.top--];
		
	}
	
	public char peek(){
		return this.isEmpty()?'\u0000':this.arr[this.top];
		
	}
	
	public void display(){
		
		for(char c:arr)
			System.out.print(" "+c);
	}
	
	public int size(){
		
		int i = arr.length;
		
		return i;
	}
	
	
}

public class StackUsingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack st = new Stack(10);
		st.push('a');
		st.push('b');
		st.push('c');
		st.push('d');
		
		//st.display();
		
//		System.out.println(st.peek());
//		
//		char arr[] = new char[st.size()];
//		
//		for(int i=0 ; i< st.size() ; i++){
//			
//			arr[i] = st.pop();
//		}
//		
//		System.out.println(String.valueOf(arr));
		
		for(int i = 0; i< st.size(); i++){
			
			System.out.print(" "+st.peek());
			st.pop();
		}
		
		
		

	}

}
