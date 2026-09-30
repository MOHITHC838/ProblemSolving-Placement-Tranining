package LinkedList;






import java.util.*;

class ListNode{
    static ListNode head=null,prev=null;
    Student stuData;
    ListNode next;
    ListNode(){}

    ListNode(Student stuData,ListNode next){
        this.stuData = stuData;
        this.next = next;
    }
    void display(){
        ListNode temp =  ListNode.head;
        while (temp != null){
            System.out.println("----------------------------");
            System.out.println(temp.stuData.stuId);
            System.out.println(temp.stuData.name);
            System.out.println(temp.stuData.sec);
            temp = temp.next;
        }
    }



}
class Student{
    int stuId;
    String name;
    String sec;
    Student(){}

    Student(int stuId,String name,String sec){
        this.stuId  = stuId;
        this.name=name;
        this.sec = sec;
    }
    void addStudent(Scanner sc){
        System.out.println("enter a ID: ");
        int id  = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a Name: ");
        String name = sc.nextLine();
        System.out.println("Enter a sec: ");
        String sec = sc.nextLine();
        Student obj  = new Student(id,name,sec);

        ListNode nodeObj = new ListNode(obj,null);

        if(ListNode.head == null){
            ListNode.head = nodeObj;
            ListNode.prev = nodeObj;
        }else{
            ListNode.prev.next =nodeObj;
            ListNode.prev = nodeObj;

        }

    }
}
public class studentWithLInkedList
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a how many Student To enter:");
        int n = sc.nextInt();
        Student stdObj = new Student();
        for(int i=0;i<n;i++){
            stdObj.addStudent(sc);
        }
        ListNode obj = new ListNode();
        obj.display();


    }
}
