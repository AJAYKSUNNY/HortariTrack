package hortaritrack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Election{
    public static void main(String [] args) {
        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-----ELECTION----------");
        System.out.println("ENTER THE NAME OF TWO CONTESTANTS:");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        ArrayList<String> li=new ArrayList<String>();
        System.out.println("\n FOR VOTING ENTER THE NUMBER ASSIGNED TO CONTESTANTS");
        System.out.println("\n1."+s1+"\n2."+s2);
        System.out.println("\n--------------------------------------");
        do{
            System.out.println("CAST YOUR VOTE:");
            int n=sc.nextInt();
            if(n==1)
            {
                li.add(s1);
            }
            else if(n==2){
                li.add(s2);
            }
            else
            {
                System.out.println("YOUR VOTE IS DISMISSED");
            }
            System.out.println("PRESS\n 1.VOTING OVER   2.VOTE CONTINUE ");
            int r=sc.nextInt();
            if(r==1)
                flag=1;
            else
                flag=0;
        }while(flag==0);
        int j=0,p=0;
        System.out.println("WINNER:");
        Iterator itr=li.iterator();
        while(itr.hasNext()){
            if(itr.next()==s1)
            {
                j++;
            }
            else
            {
                p++;
            }

        }
        System.out.println("\n--------------------------------------");
        if(j>p)
        {
            System.out.print(s1);
        }
        else if(p>j)
        {
            System.out.print(s2);
        }
        else if(p==j)
        {
              int result=s1.compareTo(s2);
              if(result>0)
                    System.out.print(" "+s1);
              else
                    System.out.print(" "+s2);
        }
        System.out.println("\n--------------------------------------");
    }

}
