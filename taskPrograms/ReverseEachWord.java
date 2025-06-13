package taskPrograms;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "HELLO NITISH GOOD MORNING";
        
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            String s1 = a[i];
            String s2 = "";
            for (int j = s1.length() - 1; j >= 0; j--) {
                s2 = s2 + s1.charAt(j);
            }
            a[i] = s2;
        }
        
        String result = String.join(" ", a);
        System.out.println(result);  
    }
}

