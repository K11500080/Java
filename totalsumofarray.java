class totalsumofarray{
    public static void main(String[] args) {
        int []array = {1,2,6,12,156,54,35};
        int n = array.length;
        int sum =0;
        for (int i=0; i<=n-1; i++){
            
            sum =sum +array[i];
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
}