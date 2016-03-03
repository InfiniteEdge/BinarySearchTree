
public class Node 
{
	private int payload;
	private Node leftChild;
	private Node rightChild;
	
	public Node(int payload)
	{
		this.setPayload(payload);
		this.setLeftChild(null);
		this.setRightChild(null);
	}

	public String toString()
	{
		return " " + payload;
	}
	
	public int getPayload() {
		return payload;
	}

	public void setPayload(int payload) {
		this.payload = payload;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	
}
