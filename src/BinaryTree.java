
public class BinaryTree  
{
	public static void main(String[] args)
	{
		BinaryTree newTree = new BinaryTree();
		newTree.addValue(3);
		newTree.addValue(8);
		newTree.addValue(98);
		newTree.addValue(65);
		newTree.addValue(76);
		newTree.addValue(2);
		newTree.display(newTree.root);
	}
	
	Node root;
	public void addValue(int payload)
	{
		Node newNode = new Node(payload);
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			Node currNode = root;
			Node parent;
			
			while(true)
			{
				parent = currNode;
				if(payload <= currNode.getPayload())
				{
					currNode = currNode.getLeftChild();
					if(currNode == null)
					{
						parent.setLeftChild(newNode);
						return;
					}
				}
				else
				{
					currNode = currNode.getRightChild();
					if(currNode == null)
					{
						parent.setRightChild(newNode);
						return;
					}
				}
			}
		}
	}
	
	public void display(Node currNode)
	{
		if(currNode != null)
		{
			display(currNode.getLeftChild());
			System.out.println(currNode);
			
			display(currNode.getRightChild());
		}
	}
}

