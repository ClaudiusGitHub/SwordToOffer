package rebuildBinaryTree;

public class Tree{
	private int m_value;
	private Tree m_pLeft;
	private Tree m_pRight;
	public int  getValue() {
		return m_value;
	}
	public void setValue(int value) {
		m_value=value;
	}
	public Tree  getLeft() {
		return m_pLeft;
	}
	public void setLeft(Tree  Left) {
		m_pLeft=Left;
	}
	public Tree  getRight() {
		return m_pRight;
	}
	public void setRight(Tree Right) {
		m_pRight=Right;
	}
}