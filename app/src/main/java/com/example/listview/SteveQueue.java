package com.example.listview;

public class SteveQueue {
    //instance variables
    private SteveNode head;
    private SteveNode tail;
    private static int count;


    //constructors
    public SteveQueue()
    {
        head = null;
        //tail = head;
        count = 0;
    }

    //brain methods
    public void addToBack(String info)
    {

        //head.setsLinkPrev(head);
        if(count == 0)
        {
            head = new SteveNode(info , head);//first node in the queue
            //head.getsLink().setsLink(head);
            tail = new SteveNode(head);
        }//the head will stay still
        else
        {
            head = new SteveNode(info , head);
            head.getsLink().setsLink(head);
//            tail = new SteveNode(info , tail);
//            tail.setsLink(tail.getsLink());
        }//the tail will grow
//        else
//        {
//            tail = new SteveNode(info, tail);
//
//        }

        count++;
    }

    public void removeFromFront()
    {
//        while(head !=null)
//        {
//            head.getsLink();
//        }
        if(head != null)
        {

            tail = tail.getsLink();
        }
        else
        {
            System.out.println("Delete from an empty list?");
            System.exit(0);
        }
        count--;
    }

    public String[] toArray()
    {
        String[] QArray = new String[count];



            SteveNode position  = tail.getsLink();
            //System.out.println(head.getsData());
            //System.out.println(tail.getsLink().getsData());
            for(int i = 0; i < count; i++)
            {
//            System.out.println(position.getsData());
//            System.out.println("-");
                QArray[i] = position.getsData();
                position = position.getsLink();
            }



        return QArray;
    }

    public String printOut()
    {
        String ans = "";
        if(count == 0)
        {
            ans = "Empty List!";
        }
        else
        {
            SteveNode position  = tail.getsLink();
            //System.out.println(head.getsData());
            //System.out.println(tail.getsLink().getsData());
            for(int i = 0; i < count; i++)
            {
//            System.out.println(position.getsData());
//            System.out.println("-");
                ans+= position.getsData() + "\n-\n";
                position = position.getsLink();
            }
        }


        return ans;
    }//this method will printout the entire current queue list

    public int length()
    {
        return count;
    }

    private class SteveNode{
        //instance variables
        private String sData;
        private SteveNode sLink;
        //private SteveNode sLinkPrev;

        //Constructors
        public SteveNode(String sData, SteveNode sLink)
        {
            this.sData = sData;
            this.sLink = sLink;
        }

        public SteveNode(SteveNode sLink)
        {
            this.sLink = sLink;
        }

        //getters and setters
        public String getsData() {
            return sData;
        }

        public SteveNode getsLink() {
            return sLink;
        }

        //public SteveNode getsLinkPrev()
        //{
        //    return sLinkPrev;
        //}

        public void setsLink(SteveNode sLink)
        {
            this.sLink = sLink;
        }

        //public void setsLinkPrev(int data ,SteveNode sLinkPrev)
        //{
        //    this.sLinkPrev = sLinkPrev;
        //}

        //toString
        public String toString()
        {
            return "data: " + sData + " links to " + sLink;
        }
    }//end inner class node
}
