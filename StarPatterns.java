/**
 * This program makes little pictures using stars. These methods
 * are so much fun to write.
 *
 * (Look in the StarInstructions.txt file to see what each method
 *  should draw.)
 *
 * @author  [Casey Groves] <-- you
 * @version [January 14, 2019] <-- today
 */


class StarPatterns 
{
    public static void starGrid(int h, int w)
    {           
        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {               
                System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starBox(int h, int w)
    {
        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {   
                if (row==0 || row==h-1 || col==0 || col==w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }   
    }

    public static void starX(int h)
    {
        int w = h;

        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row==col || row+col==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starZ(int h)
    {
        int w = h;

        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row==0 || row == h-1 || row+col==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starXBox(int h){
       int w = h;

        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row==0 || row == h-1 || col==0 || col==h-1 || 
                row == col || row+col==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }    
    }
    
    public static void twoStarBoxes(int h, int w){
        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row < h/2 && col < w/2 || row >= h/2 && col >= w/2) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }    
    }
    
    public static void starTriangle(int h){
       int w = h;

        for (int row=0; row<h; row++)
        {
            for (int col=0; col<=row; col++)
            {
                if (col<=row) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }    
    }
    
    public static void emptyTriangle(int h){
       int w = h;

        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row==col || row == h-1 || col == 0) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }    
    }

    public static void starTriangleUR(int h){
       int w = h;

        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row<= col) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }    
    }
    
    public static void isoscelesStarTriangle(int h){
        int w = 2 * h;
        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row+col>h-2 && col-row<h) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }    
    }
    
    public static void checkerBoard(int h, int w){
        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row%2 != col%2) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }    
    }
    
    public static void biggerCheckerBoard(int h, int w, int size){
        for (int row=0; row<h*size; row++)
        {
            int groupRow = row/size;
            for (int col=0; col<w*size; col++)
            {
                int groupCol = col/size;
                if (groupRow%2 == groupCol%2) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
                
            }
            System.out.println();
        }    
    }
    
    public static void upsideDownCheckeredTriangle(int h)
    {
        int w = h * 2 - 1;
        for (int row=0; row<h; row++)
        {
            for (int col=0; col<w; col++)
            {
                if (row%2 == col%2 && Math.abs(col-(w/2)) <= Math.abs(row-(w/2))) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }    
    }
    
    public static void primeStars(int h)
    {
        int before = 0;
        int twoBefore = 0;
        int current = 1;
        for (int row=0; row<h; row++)
        {
            for (int col=0; col<current; col++)
            {
                System.out.print("*");
                //System.out.print(row + "" + col + " ");
            }
            twoBefore = before;
            before = current;
            current = before+twoBefore;
            System.out.println();
        }    
    }
    
    public static void fibonacciStars(int h)
    {
        int before = 0;
        int twoBefore = 0;
        int current = 1;
        for (int row=0; row<h; row++)
        {
            for (int col=0; col<current; col++)
            {
                System.out.print("*");
                //System.out.print(row + "" + col + " ");
            }
            twoBefore = before;
            before = current;
            current = before+twoBefore;
            System.out.println();
        }    
    }
    
    public static void starFlag()
    {
        for (int row=0; row<13; row++)
        {
            for (int col=0; col<37; col++)
            {
                if (row<7 && col<17)  System.out.print("*");
                else if (row % 2 == 0) System.out.print("R");
                else System.out.print(" ");
                //System.out.print(row + "" + col + " ");
            }
            
            System.out.println();
        }    
    }
    
    public static void main(String[] args) 
    {
        starGrid(6, 11);
        System.out.println();

        //starBox(7, 9);
        //System.out.println();
        
        //starX(7);
        //System.out.println();
        
        //starZ(7);
        //System.out.println();
            
    }
     
}