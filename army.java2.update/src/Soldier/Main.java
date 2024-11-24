package Soldier;
import Soldier.Defender;
import Soldier.Soldier;
import Soldier.Attacker;

class Main {
    public static void main (String[] args) {
        Soldier[] soldiers = new Soldier[6];

        soldiers[0] = new Attacker(" Jozef ", 80);
        soldiers[1] = new Attacker(" Peter ", 80);
        soldiers[2] = new Attacker(" John ", 100);
        soldiers[3] = new Defender(" Alice ", 90);
        soldiers[4] = new Defender(" Laura ", 70);
        soldiers[5] = new Defender(" Martin ", 90);

        for (Soldier soldier : soldiers) {
            soldier.action();
        }
        Attacker attacker1 = (Attacker) soldiers[0];
        Defender defender1 = (Defender) soldiers[3];

        attacker1.attack(defender1);
        System.out.println(defender1);
    }
}



