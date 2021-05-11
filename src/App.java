public class App {
    public static void main(String[] args) throws Exception {
        // for (int i = 0; i < 10; i++){
        //     System.out.println(findOpposite(10, i));
        // }
        System.out.println(merge("abcdef", "123"));
    }

    
    public static int findOpposite (int n, int input){        
        //cach 1
        return input + (n/2) * ((input >= n/2) ? (-1) : 1); 
        //cach 2
        // return ((input % (n/2)) * 2 + n/2) - input;
    }

    public static String merge (String a, String b){
        String result = "";
        int i = 0;
        while (i < a.length() || i < b.length()){
            result += ((i < a.length()) ? a.charAt(i) : "");
            result += ((i < b.length()) ? b.charAt(i) : "");
            i++;
        }
        return result;
    }
}

