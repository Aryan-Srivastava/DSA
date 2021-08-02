package Questions;

class twoStacks{
	private int arr[];
	private int top1, top2;
	private int size;
	twoStacks(int n){
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
	}

	void push1(int num){
		if(top1 < top2-1){
			arr[++top1] = num;
		}else{
			throw new StackOverflowError();
		}
	}

	void push2(int num){
		if(top1 < top2-1){
			arr[--top2] = num;
		}else{
			throw new StackOverflowError();
		}
	}

	int pop1(){
		if(top1 == -1){
			System.out.println("Stack underflow");
			System.exit(-1);
		}else{
			return arr[top1--];
		}
		return 0;
	}

	int pop2(){
		if(top2  < size){
			return arr[top2++];
		}else{
			System.out.println("Stack underflow");
			System.exit(-1);
		}
		return 0;
	}

	public static void main(String[] args) {
		twoStacks ts = new twoStacks(6);
		ts.push1(1);
		ts.push2(6);
		ts.push1(2);
		ts.push2(5);
		System.out.println(ts.pop1());
		ts.push1(3);
		ts.push2(4);

		System.out.println(ts.pop1());
		System.out.println(ts.pop2());
	}
}