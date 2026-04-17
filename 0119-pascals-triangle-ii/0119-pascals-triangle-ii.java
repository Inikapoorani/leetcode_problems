class Solution {
    public List<Integer> getRow(int rowIndex) {
        int i=0,j=0;
        List<List<Integer>> arrlist=new ArrayList<>();
        for( i=0;i<=rowIndex;i++){
            List<Integer> innerlist=new ArrayList<Integer>();
            for(j=0;j<=i;j++){
                if(j==0 ||j==i){
                    innerlist.add(1);
                }
                else{
                    int a=arrlist.get(i-1).get(j-1);
                    int b=arrlist.get(i-1).get(j);
                    innerlist.add(a+b);
                }

            }
            arrlist.add(innerlist);
        }
         return arrlist.get(rowIndex);
    }
}