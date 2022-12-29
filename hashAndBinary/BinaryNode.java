package hashAndBinary;

public class BinaryNode {
    private String key; //word
    private String value;//meaning
    private BinaryNode leftChild;
    private BinaryNode rightChild;
    public BinaryNode(String key, String value){
        this.key = key;
        this.value = value;
        leftChild = null;
        rightChild =null;


    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BinaryNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryNode rightChild) {
        this.rightChild = rightChild;
    }
}
