// initialization
// localization

public class 71A{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int  n = Scanner.nextInt();

    for(int i=0; i<n; i++){
      String word =scanner.next();
      if(word.length>10){
        char first = word.charAt(0);
        char last = word.length() -1;
        char middlelen = word.length()-2;
        System.out.println(first + String.vlaueof(middlelen) + last);
      }else{
        System.out.print(word);
      }
    }
    scanner.close();
  }
}