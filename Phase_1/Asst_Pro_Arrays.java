class Arrays {
    public static void main(String[] args) {
    	// One-dimensional array
    	int[] age = {12, 4, 5};
    	System.out.println("onedimensional array:");
    	for(int i = 0; i < age.length; i++) {
    	    System.out.println(age[i]);
    	}
    	// Multidimensional array
        int[][] a = {
            {1, -2, 3}, 
            {-4, -5, 6, 9}, 
            {7}, 
        };
        System.out.println("multidimensional array:");
        for (int j = 0; j < a.length; ++j) {
            for(int k = 0; k < a[j].length; ++k) {
                System.out.println(a[j][k]);
            }
        }
    }
}
