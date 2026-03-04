public class DelStrBuf {
    public static void main(String[] args) {
        StringBuilder S=new StringBuilder("Full Stack Developer");
        S.delete(5, 10);
        System.out.println(S);
    }
}
