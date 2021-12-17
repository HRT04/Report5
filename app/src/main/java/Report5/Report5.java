package Report5;

public class Report5 {
    public static void main(String[] args){
        try{
        String str = null;
        int s = str.length();
        System.out.println(s);
        }catch(NullPointerException e){
            System.out.println("--------------------------------------");
            System.out.println("例外「NullPointerException」発生");
            System.out.println(e.getMessage());
            System.out.println("--------------------------------------");
        }
        
    }
    
}
