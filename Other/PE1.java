
public class PE1 {
    
    //Task 0
    //overloading methods
    //display an int array
    public static void display1DArray(int[] v) {
        for (int item:v)
        {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    //display a double array
    public static void display1DArray(double[] v) {
        for (double item:v)
        {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    //display a char array
    public static void display1DArray(char[] v) {
        for (char item:v)
        {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    //display a string array
    public static void display1DArray(String[] v) {
        for (String item:v)
        {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    //display a boolean array
    public static void display1DArray(boolean[] v) {
        for (boolean item:v)
        {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    
    //Task 1
    //a boolean method to distinguish the array
    public static boolean search1DArray(int[] m) {
        for(int item:m)
        {
            if (item != 1 && item != 0 && item != -1) return false;
        }
        return true;
    }
    //to create a y-sized char array to store the input chars
    public static char[] fillArray(char x, int y) {
        char[] h = new char[y];
        for(int i = 0; i < y; i++)
        {
            h[i] = x;
        }
        return h;
    }
    
    //Task 2
    public static char[] convertXYZCode(int[] n) {
        char[] newarray = new char[n.length];
        if (search1DArray(n))
        {
            for (int p = 0; p < n.length; p++)
            {
                switch(n[p])
                {
                    case 1:
                        newarray[p] = 'X';
                        break;
                    case 0:
                        newarray[p] = 'Y';
                        break;
                    case -1:
                        newarray[p] = 'Z';
                        break;
                    default:
                        break;   
                }
            }
        }
        else if(search1DArray(n) == false)
        {
            for(int l = 0; l < n.length; l++)
            {
                if (n[l] % 2 == 0) newarray[l] = 'e';
                else if(n[l] % 2 != 0) newarray[l] = 'f';
            }
        }
        return newarray;
    }
    
    //Task 3
    public static boolean[] oddNot5(int[] q) {
        boolean[] t3 = new boolean [q.length];
        int w = 0;
        while (w < q.length)
        {
            if (q[w] <= 72)
            {
                if (q[w] % 5 == 0) t3[w] = false;
                else
                {
                    if (q[w] % 2 == 0) t3[w] = true;
                }
                if (q[w] % 2 != 0) t3[w] = false;
            }
            if (q[w] > 72) 
            {
                w = q.length;
                t3[0] = false;
                t3[1] = false;
                t3[2] = false;
                t3[3] = false;
                t3[4] = false;
            }
            else 
  
            w++;
        }
        return t3;
    }
    
    //Task 4
    public static double addMultiplyUs(boolean r, int...s) {
        double z = 0;
        if (r)
        {
            for (int item:s)
            {
                z = z + item;
            }
        }
        else if(!r)
        {
            z = 1;
            for (int item:s)
            {
                z = z * item;
            }
        }
        return z;
    }
    
    public static void main(String[] args) {
        //Task 0
        int[] a = {1,2,3,4,5};
        double[] b = {1.1,2.2,3.3,4.4,5.5};
        char[] c = {'B','a','b','y','Y','o','d','a'};
        String[] d = {"XWing Fighter","TIE Fighter"};
        
        display1DArray(a);
        display1DArray(b);
        display1DArray(c);
        display1DArray(d);
        System.out.println();
        
        //Task 1
        int[] e = {1,0,-1,0,1};
        int[] f = {1,3,-1,0,1};
        
        System.out.println(search1DArray(e));
        display1DArray(fillArray('x',5));
        System.out.println();
        
        //Task 2
        display1DArray(convertXYZCode(e));
        display1DArray(convertXYZCode(f));
        System.out.println();
        
        //Task 3
        int[] g = {1,2,3,4,5};
        int[] h = {1,2,3,4,73};
        display1DArray(oddNot5(g));
        display1DArray(oddNot5(h));
        System.out.println();
        
        //Task 4
        System.out.println(addMultiplyUs(true,1,2,3,4,5));
        System.out.println(addMultiplyUs(false,1,2,3,4,5));
    }
    
}
