package com.cyl.algorithm.ibf.l23;

public class MyInThreadBiTree extends MyThreadBiTree {
	public MyInThreadBiTree() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createMyThreadBiTree() {
		create(head, null);
	}

	@Override
	public void initMyBiTree() {
		// TODO Auto-generated method stub
		super.initMyBiTree();
	}

	private MyBiTreeNode create(MyBiTreeNode curNode, MyBiTreeNode preNode) {
		if (curNode != null) {
			MyBiTreeNode tempNode = create(curNode.getLeftNode(), preNode);

			if ((!curNode.getLeftFlag()) && (curNode.getLeftNode() == null)) {
				curNode.setLeftFlag(true);
				curNode.setLeftNode(preNode);
			} // end of if

			preNode = tempNode;

			if ((preNode != null) && (preNode.getRightNode() == null)) {
				preNode.setRightFlag(true);
				preNode.setRightNode(curNode);
			} // end of if

			preNode = curNode;
			preNode = create(curNode.getRightNode(), preNode);
			return preNode;
		}
		return preNode;
	}

	@Override
	public void traversal() {
		MyBiTreeNode walker = this.head;

		if (this.head != null) {
			while (!walker.getLeftFlag())
				walker = walker.getLeftNode();

			System.out.print(walker.getData() + " ");

			while (walker.getRightNode() != null) {
				if (walker.getRightFlag())
					walker = walker.getRightNode();
				else {
					walker = walker.getRightNode();
					while ((walker.getLeftNode() != null)
							&& (!walker.getLeftFlag()))
						walker = walker.getLeftNode();
				} // end of else

				System.out.print(walker.getData() + " ");
			} // end of while
		} // end of if
	}

}
