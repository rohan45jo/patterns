class pattern{


  public static void main(String[] arg){
    int i,j; 
    for(i=5;i>=1;i--){
      for(j=i;j>=1;j--){

        if(j == i-i+1){
          System.out.print(i+" ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
