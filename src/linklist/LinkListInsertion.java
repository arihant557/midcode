package linklist;

public class LinkListInsertion
{
    Node head;
    Node tail;

    public void insertAtStart(int data)
    {
        Node temp=new Node(data);      //new node
        temp.next=head;               //link bana rha hai kuki hume aaage print krna h likh 4 to 5 print ho 5 4
        head=temp;                    //dobara head ka naame fresh krne ke lie
    }

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

    public static void insertAtMid()
    {
        // ye delh sai hogya   dekha?? ha
        // bc ye sai chat k lia :) aur bhai kam ki bat krte h aise // isse yaad aya tu insta dekh skta h aise laptop se
    }



    public void display()
    {
        Node temp1=head;
        while(temp1!=null)
        {
            System.out.print(temp1.data+" ");
            temp1=temp1.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        LinkListInsertion lli=new LinkListInsertion();
        lli.insertAtStart(1);
        lli.insertAtStart(2);
        lli.insertAtStart(3);
        lli.insertAtStart(4);
        lli.insertAtStart(5);
        lli.insertAtStart(6);
        /*lli.insertAtEnd(1);
        lli.insertAtEnd(2);
        lli.insertAtEnd(3);
        lli.insertAtEnd(4);
        lli.insertAtEnd(5);*/
        lli.display();

    }
}

//sare insertion vale ek hi class me likh lia kar bad me asani hogi


