import java.util.*;



class p1
{
    public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    char arr[][]=new char[3][3];int x,y;
    short n=0; 
    Random rand=new Random();
    while(true){

        System.out.println("enter row ");
        x=s.nextInt();
        System.out.println("enter column ");
        y=s.nextInt();
        placePiece(arr, x, y, 'X');
        x=rand.nextInt(3);
        y=rand.nextInt(3);
        placePiece(arr, x, y, 'O');
        display(arr);
        break;

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

    public static void placePiece(char [][]m, int x, int y, char g)
    {
        m[x][y]=g;

    }

}