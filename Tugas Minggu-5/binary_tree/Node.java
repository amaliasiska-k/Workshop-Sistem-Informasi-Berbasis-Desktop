package binary_tree;

/**
 * NAMA : AMALIA SISKA KURNIAWATI
 * NIM  : E41201005
 * GOL  : A - BONDOWOSO
 */

public class Node {
    public int id;
    public String data;
    public Node leftChild;
    public Node rightChild;
    
    public void displayNode(){
        System.out.print(" { " + id + " " + data + " } ");
    }
}  