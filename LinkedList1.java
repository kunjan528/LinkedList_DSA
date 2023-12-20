
package LinkedList;
    
    class Node <T>{
        T data ;
        Node next ;
        
        Node(){};
       Node(T d)
        {
            data = d ;
        }
       void setNext(Node t)
       {
           next = t;
       }
       Node getNext()
       {
           return next;
       }
       T getData()
       {
           return data;
       }
       public String toString()
       {
           return data +" ";
       }
    }
    
    class LinkedList <T>
    {
        Node<T> first;
        void add(T x)
        {
            Node newnode = new Node(x);
            
            if(first == null)
            {
                first = newnode;
            }else{
                Node p = first;
                while(p.getNext() != null)
                {
                    p = p.getNext();
                }
                p.setNext(newnode);
            }
        }
        int Maximum() {
                if(first == null)
                {
                    return Integer.MIN_VALUE;
                }
                    int max = (Integer)first.getData();
		Node<Integer> p = first.getNext();
		//int max=0;
		max= p.getData();
		while(p!=null) {
			if(p.getData()>max) {
				max=p.getData();
			}
			p=p.getNext();
		}
		return max;
	}
         boolean delete (T d)
        {
            Node p = first,prev = null;
            while(p != null)
            {
                if(d.equals(p.getData()))
                
                    break;
                
                prev = p;
                p = p.getNext();
            }  
                if(p == null)
                {
                    return false;
                }if(prev == null)
                {
                    first = p.getNext();
                }else{
                    prev.setNext(p.getNext());
                }
            return true;
        }
                public String toString()
                {
                    String s = " ";
                    Node p = first;
                    while(p != null) {
                        s = s + p.getData() + " ";
                        p = p.getNext();
                    }
                    return s;
    
    }
        
        void addBeg(T val)
        {
            Node new_node1 = new Node(val );
            new_node1.data=val;
            new_node1.next = first;
            first = new_node1;
            //Node q = first;
        }
        int Count(Node n )
        {
            if(n == null)
            {
                return 0;
            }
            return 1 +Count(n.next);
        }
        public int count()  
        {
            return Count(first);
        }
        
        
        public void insertAt(T data ,int pos )
        {
            Node new_node3 = new Node(data ); 
            if(pos == 1)
            {
                new_node3.next = first;
                first = new_node3;
                return;
            }
            Node curt = first;
            for(int i =1 ;i<pos-1;i++)
            {
                curt = curt .next;
            }
            new_node3.next = curt.next;
            curt.next = new_node3;
            
             
        }
        public void deleteAt(int pos )
        {
            Node new_node3 = new Node(pos ); 
            if(pos == 1)
            {
               
                first = first.next;
                return;
            }
            Node curt = first;
            for(int i =1 ;i<pos-1;i++)
            {
                curt = curt .next;
            }
            
            curt.next = curt.next.next;
            
             
        }
        public void insertOrder(T data)
    {
        Node <T> newNode = new Node<> (data);
        if(first == null  || (((Integer)first.data).compareTo((Integer)data)>0))
        {
            newNode.next = first;
            first = newNode;
            return;
        }
        Node<T>current = first;
        while(current.next!=null && (((Integer)current.next.data).compareTo((Integer)data)<0))
        {
            current = current.next;
        }
        newNode.next = current.next;
        current.next=newNode;
    }
       
        
       
    }

    public class LinkedList1 
    { 
    public static void main(String args[])
    {
       LinkedList <Integer>x  = new LinkedList<>();
       x.add(10);
       x.add(20);
       x.add(30);
       x.add(40);
       x.add(50);
       
       System.out.println(x);
      
        x.delete(50);
        System.out.println("Delete the number :"+x);
        x.delete(10);
       System.out.println("Delete the number :"+x);
        x.add(90);
       System.out.println("Add the number:"+x);
        x.addBeg(15);
        System.out.println("Add a number in a beginning:"+x);
        x.addBeg(5);
        System.out.println("Add a number in a beginning:"+x);
         int ct =x.count();
        System.out.println("count:"+ct);
       
        x.insertAt(25,4);
         System.out.println("Inserted At the the Position :"+x);
         x.insertAt(2,1);
         System.out.println("Inserted At the the Position :"+x);
         x.deleteAt(3);
        System.out.println("Delete The position At :"+x);
        x.deleteAt(1);
        System.out.println("Delete The position At :"+x);
    
       x.insertOrder(27);
        System.out.println("insert the order at the Sorted list:"+x);  
        x.insertOrder(35);
        System.out.println("insert the order at the Sorted list:"+x);
         int m = Maximum();
       System.out.println(m);
    
    
    
    
     
     
     
    }
    
}
