package hashAndBinary;



public class HashTable {
    BinaryNode hashtable[];
    private final int size;
    public HashTable(int size){
        this.size = size ;
        hashtable = new BinaryNode[size];

    }
    public void add(String key, String value) {
        int hashedValue =myHashCOde(key);
        BinaryNode root = hashtable[hashedValue];
        if( root == null){
            hashtable[hashedValue] = new BinaryNode(key,value);
            return;
        }

        while(true){
            if(key.length() < root.getKey().length()){
                if(root.getLeftChild()== null){
                        root.setLeftChild(new BinaryNode(key, value));
                        break;
                }
                root = root.getLeftChild();
            }
            else{
                if(root.getRightChild() == null){
                        root.setRightChild(new BinaryNode(key, value));
                        break;
                }
                root = root.getRightChild();
            }
        }





    }
    private int myHashCOde(String key){
        int hashedValue = 0;
        for(int i= 0; i< key.length() -1; i++){
            hashedValue +=  i * key.charAt(i)+ i;

        }
        return hashedValue % size;

    }
    public void print(){
        for(BinaryNode i:hashtable) {
            if (i != null){
                inOrder(i);
            System.out.println();
            }
            else{
                System.out.println("null");
            }
        }


    }
    public void search(String key){
        System.out.print(find(key).getKey() + ":");
        System.out.println(find(key).getValue());

    }
    private BinaryNode find(String key){   //private
        int hashedValue = myHashCOde(key);
        BinaryNode root = hashtable[hashedValue];
         if(root == null){
             return  null;
         }

         while( root != null){
             if (key.equals(root.getKey()))
                 return root;
             else if  (key.length() < root.getKey().length())
                 root = root.getLeftChild();
             else
                 root = root.getRightChild();
         }
         return null;

    }
    private void inOrder(BinaryNode root){
        if(root== null){

            return;
        }


        inOrder( root.getLeftChild());
        System.out.print( root.getKey() + " " );
        inOrder( root.getRightChild());


    }
}
