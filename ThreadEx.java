import java.util.*;


class TableFind extends Thread{
    int num;
    public TableFind(int val)
    {
        this.num = val;
    }

    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println(num + "M" + num*i);
            try{
                sleep(1000);
            }
            catch(Exception e)
            {}
        }
    }
}


public class ThreadEx {
    public static void main(String args[])
    {
        TableFind O1 = new TableFind(2);
        TableFind O2 = new TableFind(4);

        O1.start();
        O2.start();


    }
}
