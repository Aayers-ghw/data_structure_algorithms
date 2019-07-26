package algo.stack;

/**
 * 使用前后栈实现浏览器的前进后退。
 */
public class SampleBrowser {

	public static void main(String[] args) {
		SampleBrowser browser = new SampleBrowser();
        browser.open("http://www.baidu.com");
        browser.open("http://news.baidu.com/");
        browser.open("http://news.baidu.com/ent");
        browser.goBack();
        browser.goBack();
        browser.goForward();
        browser.open("http://www.qq.com");
        browser.goForward();
        browser.goBack();
        browser.goForward();
        browser.goBack();
        browser.goBack();
        browser.goBack();
        browser.goBack();
        browser.checkCurrentPage();
	}
	
	private String currentPage;
    private LinkedListBasedStack backStack;
    private LinkedListBasedStack forwardStack;
    
    public SampleBrowser() {
    	this.backStack = new LinkedListBasedStack();
    	this.forwardStack = new LinkedListBasedStack();
    }
    
    public void open(String url) {
    	if(this.currentPage != null) {
    		backStack.push(this.currentPage);
    		forwardStack.clear();
    	}
    	showUrl(url, "Open");
    }
    
    public boolean canGoBack() {
    	return this.backStack.size > 0;
    }
    
    public boolean canGoForward() {
    	return this.forwardStack.size > 0;
    }
    
    public String goBack() {
    	if(this.canGoBack()) {
    		forwardStack.push(this.currentPage);
    		String backUrl = this.currentPage = backStack.pop();
    		showUrl(backUrl, "Back");
    		return backUrl;
    	}else {
    		System.out.println("* Cannot go back, no pages behind.");
    		return null;
    	}
    }
    
    public String goForward() {
    	if(this.canGoForward()) {
    		backStack.push(this.currentPage);
    		String forwardUrl = forwardStack.pop();
    		showUrl(forwardUrl, "Forward");
    		return forwardUrl;
    	}else {
    		 System.out.println("** Cannot go forward, no pages ahead.");
    	     return null;
    	}
    }
    
    public void showUrl(String url, String prefix) {
    	this.currentPage = url;
    	System.out.println(prefix + " Page == " + url);
    }
    
    public void checkCurrentPage() {
        System.out.println("Current page is: " + this.currentPage);
    }
    
    public static class LinkedListBasedStack {
    	
//      public static void main(String[] args) {
//	      LinkedListBasedStack algo.stack = new LinkedListBasedStack();
//	      algo.stack.push("A");
//	      algo.stack.push("B");
//	      algo.stack.push("C");
//	      algo.stack.pop();
//	      algo.stack.push("D");
//	      algo.stack.push("E");
//	      algo.stack.pop();
//	      algo.stack.push("F");
//	      algo.stack.print();
//	
//		  String data = algo.stack.getTopData();
//		  System.out.println("Top data == " + data);
//  }
    	
    	private int size;
    	private Node top;
    	
    	static Node createNode(String data, Node next) {
    		return new Node(data, next);
    	}
    	
    	public void clear() {
    		this.top = null;
    		this.size = 0;
    	}
    	
    	public void push(String data) {
    		Node node = new Node(data, this.top);
    		this.top = node;
    		this.size++;
    	}
    	
    	public String pop() {
    		Node popNode = top;
    		if(popNode == null) {
    			System.out.println("Stack is empty.");
    		}else {
    			this.top = this.top.next;
//    			this.top = popNode.next;
    			if(this.size > 0) {
    				this.size--;
    			}
    		}
    		
    		return popNode.data;
    	}
    	
    	public String getTopData() {
    		if(this.top == null) {
    			return null;
    		}else {
    			return this.top.data;
    		}
    	}
    	
    	public int size() {
    		return this.size;
    	}
    	
    	public void print() {
    		System.out.println("Print algo.stack.");
    		Node currentNode = this.top;
    		while(currentNode != null) {
    			String data = currentNode.getData();
    			System.out.print(data + "\n");
    			currentNode = currentNode.next;
    		}
    	}
    	
    	
    }
    
    public static class Node{
    	
    	private String data;
    	private Node next;
    	
    	public Node(String data) {
    		this(data, null);
    	}
    	
    	public Node(String data, Node next) {
    		this.data = data;
    		this.next = next;
    	}
    	
    	public void setData(String data) {
    		this.data = data;
    	}
    	
    	public String getData() {
    		return this.data;
    	}
    	
    	public void setNext(Node next) {
    		this.next = next;
    	}

    	public Node getNext() {
    		return this.next;
    	}
    }
    
}
