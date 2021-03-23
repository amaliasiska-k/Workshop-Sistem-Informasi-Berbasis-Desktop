package amaliasiskakurniawati;
/**
 *
 * @author AMALIA SISKA KURNIAWATI | E41201005
 */
public class Test_OutputString {
    public static void main(String[] args) {

        String s1 = "ABC";
        String s2 = new String ("DEF");
        String s3 = "AB"+"C";
        
        System.out.println("Perbandingan s1 dan s2 : " + s1.compareTo(s2));
        System.out.println("s2 equals to s3 : " + s2.equals(s3));
        System.out.println("s3 sama dengan s1: " + s3 == s1);
        System.out.println("Perbandingan s2 dan s3 : " + s2.compareTo(s3));
        System.out.println("s3 equals to s1 :  " + s3.equals(s1));
        
    }
}