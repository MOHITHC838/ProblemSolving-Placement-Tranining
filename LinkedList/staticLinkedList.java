package LinkedList;
class Nodes{
    int data;
    Nodes address;


    Nodes(int data,Nodes address){
        this.data = data;
        this.address = address;

    }
}
public class staticLinkedList {
    static void main() {
        Nodes obj1 = new Nodes(10,null);
        Nodes head = obj1;
        Nodes obj2 = new Nodes(20,null);
//        Nodes.address = obj2;
        Nodes obj3 = new Nodes(30,null);
        obj2.address = obj3;



    }
}
