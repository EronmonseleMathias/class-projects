package Chapter6Exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Nokia3310 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Nokia3310\n\n" +
                    "Press1: Phone book\nPress2: Message\nPr" +
                    "ess3: Chat\nPress4: Call register\nPres" +
                    "s5: Tones\nPress6: Settings\nPress7: Call divert\nPress8: Games\nPress9: Calculator\nPress10: Remainder\nPress11: Clock\nPress12: " +
                    "Profile\nPress13: SIM service");
int telecom = input.nextInt();

switch (telecom){

    case 1:
        System.out.println("  1. search\n  2. service nos\n  3. add number\n  4. erase" +
                "\n  5. edit\n  6. assign tone\n  7. send b'" +
                "card\n  8. options\n   1. type of view\n" +
                "   2. memory status\n  9. speed dials\n  10. voice tags\n\n" +
                "press 70 to continue\npress 60 to exit");
        int maths = input.nextInt();
        if ( maths == 70 ){
            continue;
        } else if (maths == 60) {
            break;
        }
            case 2:
                System.out.println("  1. write messages\n  2. inbox\n  3. outbox\n  4. pi" +
                        "cture messages\n  5. templates\n  6. smileys\n  7. message settings\n" +
                        "   1. set 1`2\n    1. messages sent as\n    2. message validity\n    3. message centre number\n" +
                        "   2. common`3\n    1. delivery reports\n    2. reply via same centre\n    3. character supp" +
                        "ort\n  8. info service\n  9. voice mail box number\n  10. service command editor1");
    case 3:

        System.out.println("chat");

    case 4:
        System.out.println("  1. missed calls\n  2. received calls\n  3. dialled numbers\n  4. erase recent calls lists\n  5. show call duration\n   1. " +
                "last call duration\n   2. all calls duration\n   3. received calls duration\n   4. dialled calls duration\n   5. clear timers\n  6. show call costs\n   1. last call cost\n   2. all call cost\n   3. clear counters\n  7. call cost settings" +
                "\n   1. call cost limit\n   2. show cost in\n  8. prepaid credit\n");

    case 5:
        System.out.println("  1. ringing tones\n  2. ringing volume  3. incoming call alert\n  4. composer\n  5. message alert tone\n" +
                "  6. keypad tones\n  7. warning and games tones\n  8. vibrating alert\n  9. screen saver");


    case 6:
        System.out.println(" 1. Call settings\n  1. automatic redial\n  2. speed dialling\n  3. call waiting options\n  4. own number sending\n" +
                "  5. phone line in use\n  6. automatic answer\n 2. phone settings\n  1. language\n  2. cell info display\n  " +
                "3. welcome note\n  4. network selection\n  5. lights\n  6. confirm SIM service actions\n 3. security setting\n  1. " +
                "PIN code request\n  2. call barring service\n  3. fixed dialling\n  4. close user group\n  5. phone security\n  6. change access codes" +
                "\n 4. Restore factory settings ");
    case 7:

        System.out.println("Call divert");

    case 8:
        System.out.println("Games");

    case 9:
        System.out.println("Calculator");

    case 10:
        System.out.println("Remainder");

    case 11:
        System.out.println("Clock\n  1. alarm clock\n  2. Clock settings\n  3. date settings\n  4. stop watch\n  5. count down timer\n" +
                "  6. auto update of date and time");

    case 12:
        System.out.println("Profile");

    case 13:
        System.out.println("SIM Service");


            }
        }

}


        }


