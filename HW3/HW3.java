
public class HW3 {

    public static void displayMatrix(int[][] a) {
    	for (int i = 0; i < a.length; i++)
	    {
	        for (int j = 0; j < a.length; j++)
		    {
		        System.out.print(a[i][j]+ " ");
		    }
	        System.out.println();
	    }
    }

    public static int[][] buildMatrix(int[] b) {
    	int[][] b2 = new int[3][3];
    	for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 3; j++)
		    {
		        if (i == 0) b2[i][j] = b[j];
		        else if (i == 1) b2[i][j] = b[j + 3];
		        else if (i == 2) b2[i][j] = b[j + 6];
		    }
	    }
	    return b2;
    }

    public static int[][] buildRandomMatrix() {
    	int[][] c3 = new int[3][3];
    	for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 3; j++)
		    {
		        c3[i][j] = (int)(Math.random()*10) + 1;
		    }
	    }
	    return c3;
    }

    public static int[][] buildVectorMatrix(int[] a, int[] b, int[] c) {
    	int[][] d4 = new int[3][3];
    	for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 3; j++)
		    {
		        if (i == 0) d4[i][j] = a[j];
		        else if (i == 1) d4[i][j] = b[j];
		        else if (i == 2) d4[i][j] = c[j];
		    }
	    }
	    return d4;
    }

    public static boolean compareMatrices(int[][] a, int[][] b) {
    	boolean e5 = true;
    	for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 3; j++)
		    {
		        if (a[i][j] == b[i][j]) e5 = true;
		        else {
		        	e5 = false;
		        	i = 3;
		        	j = 3;
		        }
		    }
	    }
	    return e5;
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
    	int[][] f6 = new int[3][3];
    	for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 3; j++)
		    {
		        f6[i][j] = a[i][j] + b[i][j];
		    }
	    }
	    return f6;
    }

    public static int[][] subtractMatrices(int[][] a, int[][]b) {
    	int[][] g7 = new int[3][3];
    	for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 3; j++)
		    {
		        g7[i][j] = b[i][j] - a[i][j];
		    }
	    }
	    return g7;
    }

    public static int[][] scalarProductMatrix(int[][] a, int b) {
    	int[][] h8 = new int[3][3];
    	for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 3; j++)
		    {
		        h8[i][j] = a[i][j] * b;
		    }
	    }
	    return h8;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
    	int[][] i9 = new int[3][3];
    	for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 3; j++)
		    {
		        for (int k = 0; k < 3; k++)
		        {
		        	i9[i][j] = i9[i][j] + a[i][k] * b[k][j]; 
		        }
		    }
	    }
	    return i9;
    }

    public static int[][] transposeMatrix(int[][] a) {
    	int[][] j1 = new int[3][3];
    	for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 3; j++)
		    {
		        j1[i][j] = a[j][i];
		    }
	    }
	    return j1;
    }

    public static boolean isSymmetricMatrix(int[][] a) {
    	int[][] k1 = transposeMatrix(a);
    	boolean k2 = true;
    	for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 3; j++)
		    {
		        if (k1[i][j] == a[i][j]) k2 = true;
		        else {
		        	k2 = false;
		        	i = 3;
		        	j = 3;
		        }
		    }
	    }
	    return k2;
    }

    public static int traceMatrix(int[][] a) {
    	int trace = 0;
    	for (int i = 0; i < 3; i++)
	    {
	        for (int j = 0; j < 3; j++)
		    {
		        if (i == j) trace = trace + a[i][j];
		    }
	    }
	    return trace;
    }

    public static int determinant3x3Matrix(int[][] a) {
    	int det = 0;
    	int d1 = a[0][0] * a[1][1] * a[2][2];
    	int d2 = a[0][1] * a[1][2] * a[2][0];
    	int d3 = a[0][2] * a[1][0] * a[2][1];
    	int d4 = a[0][2] * a[1][1] * a[2][0];
    	int d5 = a[0][1] * a[1][0] * a[2][2];
    	int d6 = a[0][0] * a[1][2] * a[2][1];
    	det = d1 + d2 + d3 - d4 - d5 - d6;
    	return det;
    }

    public static int[][] powerNMatrix(int[][] a, int b) {
    	int[][] l1 = multiplyMatrices(a,a);
    	for (int i = 0; i < b - 2; i++)
    	{
    		l1 = multiplyMatrices(l1,a);
    	}
    	return l1;
    }


    public static void main(String[] args) {
        //Task 1
        System.out.println("TASK 1");
        int[][] T1 = {{1,2,3},{4,5,6},{7,8,9}};
        displayMatrix(T1);
        System.out.println();
        
        //Task 2
        System.out.println("TASK 2");
        int[] V = {11,2,13,4,15,6,17,8,19};
        int[][] T2 = buildMatrix(V);
        displayMatrix(T2);
        System.out.println();

        //Task 3
        System.out.println("TASK 3");
        int[][] T3 = buildRandomMatrix();
        displayMatrix(T3);
        System.out.println();

        //Task 4
        System.out.println("TASK 4");
        int[] a = {10,20,30};
        int[] b = {11,21,31};
        int[] c = {12,22,32};
        int[][] T4 = buildVectorMatrix(a,b,c);
        displayMatrix(T4);
        System.out.println();

        //Task 5
        System.out.println("TASK 5");
        int[][] M = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] N = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] P = {{11,2,3},{4,5,6},{7,8,19}};
        boolean T51 = compareMatrices(M,N);
        boolean T52 = compareMatrices(M,P);
        System.out.println(T51);
        System.out.println(T52);
        System.out.println();

        //Task 6
        System.out.println("TASK 6");
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = {{10,20,30},{40,50,60},{70,80,90}};
        int[][] T6 = addMatrices(A,B);
        displayMatrix(T6);
        System.out.println();

        //Task 7
        System.out.println("TASK 7");
        int[][] C = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] D = {{10,20,30},{40,50,60},{70,80,90}};
        int[][] T7 = subtractMatrices(C,D);
        displayMatrix(T7);
        System.out.println();

        //Task 8
        System.out.println("TASK 8");
        int[][] E = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] T8 = scalarProductMatrix(E,10);
        displayMatrix(T8);
        System.out.println();

        //Task 9
        System.out.println("TASK 9");
        int[][] F = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] G = {{5,2,4},{4,6,6},{7,2,9}};
        int[][] T9 = multiplyMatrices(F,G);
        displayMatrix(T9);
        System.out.println();

        //Task 10
        System.out.println("TASK 10");
        int[][] H = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] T10 = transposeMatrix(H);
        displayMatrix(H);
        System.out.println();
        displayMatrix(T10);
        System.out.println();

        //Task 11
        System.out.println("TASK 11");
        int[][] I = {{1,7,3},{7,4,5},{3,5,6}};
        int[][] J = {{1,2,3},{4,5,6},{7,8,9}};
        boolean T11I = isSymmetricMatrix(I);
        System.out.println(T11I);
        boolean T11J = isSymmetricMatrix(J);
        System.out.println(T11J);
        System.out.println();

        //Task 12
        System.out.println("TASK 12");
        int[][] K = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(traceMatrix(K));
        System.out.println();

        //Task 13
        System.out.println("TASK 13");
        int[][] L = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(determinant3x3Matrix(L));
        System.out.println();

        //Task 14
        System.out.println("TASK 14");
        int[][] Q = {{1,2,3},{4,5,6},{7,8,9}};
        displayMatrix(powerNMatrix(Q,3));
        System.out.println();
    }
    
}
