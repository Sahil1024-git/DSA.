import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<String> arr=new ArrayList<String>(n);
    for(int i=0;i<n;i++){
        String s=sc.next();
        int len=s.length();
        if(len<=10){
            arr.add(s);
        }else{
            String abbreviation = "" + s.charAt(0) + (len - 2) + s.charAt(len - 1);
            arr.add(abbreviation);
        }
    }
    for(int i=0;i<arr.size();i++){
        System.out.println(arr.get(i));
    }
    sc.close();
}
}
