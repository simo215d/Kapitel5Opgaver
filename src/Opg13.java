public class Opg13 {
    public static void main(String[] args) {
        int n = 0;
        while (Math.pow(n,2)<12000){
            n++;
        }
        //nearing the end: is this n^2<12000? no? then print n. But the n did not work, so we have to go back 1 before that worked.
        n--;
        System.out.println(n);
    }
}
