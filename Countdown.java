class Countdown {
  public static void main(String[] args) {
    int x = 99;
    countDown(x);
}
  public static void countDown(int x) {
    if (x == 0){
     System.out.println(" ");
    } else{
     System.out.println(x);
     countDown(x-1);
  }
 }
}
