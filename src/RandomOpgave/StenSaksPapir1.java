package RandomOpgave;

import java.util.Scanner;

public class StenSaksPapir1 {
    static void result(String player, String pc){
        if (player.equals(pc))
            System.out.println("I valgte det samme: uafgjort");
        else if (player.equals("sten")&&pc.equals("saks") || player.equals("saks")&&pc.equals("papir") || player.equals("papir")&&pc.equals("sten"))
            System.out.println("Mennesket vandt");
        else if (pc.equals("sten")&&player.equals("saks") || pc.equals("saks")&&player.equals("papir") || pc.equals("papir")&&player.equals("sten"))
            System.out.println("pc vandt");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv sten, saks eller papir:");
        String player = input.next();
        String pc;
        int pcInt = (int)(Math.random()*3);
        if (pcInt == 0)
            pc="sten";
        else if (pcInt == 1)
            pc="saks";
        else
            pc = "papir";
        System.out.println("pc: "+pc);
        result(player,pc);
    }
}
