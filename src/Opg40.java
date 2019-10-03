public class Opg40 {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int result;
        for (int x = 0; x<2000000; x++){
            result = (int)(Math.random()*2);
            if (result==0)
                heads++;
            else tails++;
        }
        System.out.println("Heads: "+heads+" and Tails: "+tails);
        System.out.println("Total flips: "+(heads+tails));
    }
}
