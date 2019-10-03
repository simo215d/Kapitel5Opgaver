public class Opg12 {
    public static void main(String[] args) {
        int n = 0;
        while (Math.pow(n,3)<12000){
            n++;
        }
        //nearing the end: n^3 is still less that 12000. 1 more. n^3 is now more than 12000 so we print n.
        System.out.println(n);
    }
}
