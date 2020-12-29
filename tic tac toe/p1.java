import java.util.*;





class p1
{
    static ArrayList<Integer>  player=new ArrayList<Integer>();
    static ArrayList<Integer>  cpu=new ArrayList<Integer>();
    public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    char arr[][]=new char[3][3];
    int x;
    int n=0; 
    Random rand=new Random();
    System.out.println(player.contains(0));
    while(true){

        do{
        System.out.println("enter pos ");
        x=s.nextInt();
        if(!player.contains(x) && !cpu.contains(x))
            {player.add(x);break;}
        }
        while(true);
        
            player.add(x);
        placePiece(arr, x ,'X');
//the winner code can be sent to the method as well.
        n=winner();
        if(n==3)
        {
            System.out.println("draw!");
            break;
        }

        else if(n==1)
        {
            System.out.println("player wins!");
            break;
        }
        else if(n==2)
        {
            System.out.println("cpu wins!");
            break;
        }
        do{
            x=rand.nextInt(9)+1;
            if(!player.contains(x) && !cpu.contains(x))
            {cpu.add(x);break;}}
            while(true);
            
        
        cpu.add(x);
        placePiece(arr, x, 'O');
        
        n=winner();
        if(n==3)
        {
            System.out.println("draw!");
            break;
        }

        else if(n==1)
        {
            System.out.println("player wins!");
            break;
        }
        else if(n==2)
        {
            System.out.println("cpu wins!");
            break;
        }
        

    }

    
    s.close();
    }



    public static void display(char [][] m)
    {
        for(int i=0;i<3;i++)
        {
            System.out.print("|");
            for(int j=0;j<3;j++)
            {
                System.out.print(m[i][j]+"|");
            }
            System.out.println();
            System.out.println("-------");
        }
    }


    public static int winner()
    {
        List top = Arrays.asList(1,2,3);
        List mid = Arrays.asList(4,5,6);
        List bottom = Arrays.asList(7,8,9);
        List left = Arrays.asList(1,4,7);
        List center = Arrays.asList(2,5,8);
        List right = Arrays.asList(3,6,9);
        List dia1 = Arrays.asList(1,5,9);
        List dia2 = Arrays.asList(3,5,7);

        List<List> cond =new ArrayList<List>();
        cond.add(top);
        cond.add(mid);
        cond.add(bottom);
        cond.add(left);
        cond.add(right);
        cond.add(center);
        cond.add(dia1);
        cond.add(dia2);

        for(List l: cond)
        {
            if(player.containsAll(l))
            {
                return 1;}
            else if(cpu.containsAll(l))
            {
                return 2;}
            else if(player.size()+cpu.size()==9)
            {
                return 3;}

        }
        return 0;

    }
    public static void placePiece(char [][]m, int x, char g)
    {
        switch(x)
        {
            case 1:
            m[0][0]=g;
            break;

            case 2:
            m[0][1]=g;
            break;

            case 3:
            m[0][2]=g;
            break;


            case 4:
            m[1][0]=g;
            break;


            case 5:
            m[1][1]=g;
            break;


            case 6:
            m[1][2]=g;
            break;


            case 7:
            m[2][0]=g;
            break;

            case 8:
            m[2][1]=g;
            break;

            case 9:
            m[2][2]=g;
            break;

            default:
            break;



        }
        display(m);
        System.out.println();
    }

}