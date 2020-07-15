package linklist;

public class LinkListInsertionTwo
{

    Node head = null;
    Node tail = null;                                                                                           // created new node


    public void insertAtEnd(int data)
        {

            Node newnode = new Node(data);
                                                                                                      //now checking wether node has value or not

            if(head==null)                                                                           //if it is beggn. of first node and its value #empty h agr
            {
                head = newnode;                                                                      //initailixing the value to head
                tail = newnode;
            }
                                                      // as tail has got the first value if it was empty now for second element the further code is

            else
                {

                    tail.next = newnode;                          //giving address of the newnode to current tail as it was tal so no add was there first
                    tail = newnode;                               // mking the newnode the last node i.e. tail
            }
        }

        public void display()
    {
        Node temp = head;
         if(head==null)
         {
             System.out.println("it is empty");
         }

         while(temp!=null)
         {
             System.out.println(temp.data + "");
             temp = temp.next;
         }
    }

    public static void main(String[] args)
    {
        LinkListInsertionTwo sList = new LinkListInsertionTwo();

        //Adding 1 to the list
        sList.insertAtEnd(1);
       // sList.display();

        //Adding 2 to the list
        sList.insertAtEnd(10);
       // sList.display();

        //Adding 3 to the list
        sList.insertAtEnd(100);
        //sList.display();

        //Adding 4 to the list
        sList.insertAtEnd(1000);
        sList.display();
    }


}
