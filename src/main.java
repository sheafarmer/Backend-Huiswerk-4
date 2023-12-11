import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        FirePokemon fp1 = new FirePokemon("Charizard","Fire",32,0,100,3,3,3,3,3,"Groooww");
        WaterPokemon wp1 = new WaterPokemon( "Blastois","Water",32,0,100,3,3,3,3,3,"Blasst");
        GrassPokemon gp1 = new GrassPokemon("Venasaur","Grass",32,0,100,3,3,3,3,3,"Fenaa");
        ElectricPokemon ep1 = new ElectricPokemon("Pikachu","Electric",100,0,100,300,300,300,300,0.3,"Pikaaa");

        System.out.println("Choose Your Pokemon and see their stats");
        System.out.println("Charizard, Blastois, Venasaur, Pikachu");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        boolean loop = true;

//        Sadly I couldn't finish the project as I wanted it, but it should have everything necessary now
//        Would have like to implement attacks and conditions if attacks where stronger or not stronger


        while (loop) {


//               CHARIZARD
            if (choice.equals("Charizard") || choice.equals("charizard")) {
                fp1.choice();
                System.out.println(fp1);
                System.out.println(" ");
                System.out.println("Would you like you see Charizards special attack?");
                System.out.println(" ");
                System.out.println("Yes/No");
                String charchoice = input.nextLine();
                if (charchoice.equals("yes") || charchoice.equals("Yes")) {
                    System.out.println(" ");
                    fp1.specialattack();
                    System.out.println(" ");
                    System.out.println("Would you also like to know Charizards favorite food?");
                    System.out.println(" ");
                    System.out.println("Yes/No");
                    String ffood = input.nextLine();
                    if (ffood.equals("yes") || ffood.equals("Yes")) {
                        System.out.println(" ");
                        fp1.favoritefood();
                        loop = false;
                    } else if (ffood.equals("no") || ffood.equals("No")) {
                        System.out.println(" ");
                        System.out.println("END");
                        loop = false;
                    }
                } else if (charchoice.equals("no") || charchoice.equals("No")) {
                    System.out.println(" ");
                    System.out.println("Would like to see favorite food then?");
                    System.out.println("Yes/No");
                    String ffood = input.nextLine();
                    if (ffood.equals("yes") || ffood.equals("Yes")) {
                        System.out.println(" ");
                        fp1.favoritefood();
                        loop = false;
                    } else if (ffood.equals("no") || ffood.equals("No")) {
                        System.out.println(" ");
                        System.out.println("END");
                        loop = false;
                    }
                }


//                BLASTOIS


            } else if (choice.equals("Blastois") || choice.equals("blastois")) {
                wp1.choice();
                System.out.println(wp1);
                System.out.println(" ");
                System.out.println("Would you like you see Blastois special attack?");
                System.out.println("Yes/No");
                String blachoice = input.nextLine();
                if (blachoice.equals("yes") || blachoice.equals("Yes")) {
                    System.out.println(" ");
                    wp1.specialattack();
                    System.out.println(" ");
                    System.out.println("Would you also like to know Blastois favorite food?");
                    System.out.println("Yes/No");
                    String wfood = input.nextLine();
                    if (wfood.equals("yes") || wfood.equals("Yes")) {
                        System.out.println(" ");
                        wp1.favoritefood();
                        loop = false;
                    } else if (wfood.equals("no") || wfood.equals("No")) {
                        System.out.println(" ");
                        System.out.println("END");
                        loop = false;
                    }
                } else if (blachoice.equals("no") || blachoice.equals("No")) {
                    System.out.println("Would like to see favorite food then?");
                    System.out.println("Yes/No");
                    String wfood = input.nextLine();
                    if (wfood.equals("yes") || wfood.equals("Yes")) {
                        System.out.println(" ");
                        wp1.favoritefood();
                        loop = false;
                    } else if (wfood.equals("no") || wfood.equals("No")) {
                        System.out.println(" ");
                        System.out.println("END");
                        loop = false;
                    }
                }


//                VENASAUR


            } else if (choice.equals("Venasaur") || choice.equals("venasaur")) {
                gp1.choice();
                System.out.println(gp1);
                System.out.println(" ");
                System.out.println("Would you like you see Venasaur special attack?");
                System.out.println("Yes/No");
                String venchoice = input.nextLine();
                if (venchoice.equals("yes") || venchoice.equals("Yes")) {
                    System.out.println(" ");
                    gp1.specialattack();
                    System.out.println(" ");
                    System.out.println("Would you also like to know Venasaurs favorite food?");
                    System.out.println("Yes/No");
                    String gfood = input.nextLine();
                    if (gfood.equals("yes") || gfood.equals("Yes")) {
                        System.out.println(" ");
                        gp1.favoritefood();
                        loop = false;
                    } else if (gfood.equals("no") || gfood.equals("No")) {
                        System.out.println(" ");
                        System.out.println("END");
                        loop = false;
                    }
                } else if (venchoice.equals("no") || venchoice.equals("No")) {
                    System.out.println("Would like to see favorite food then?");
                    System.out.println("Yes/No");
                    String gfood = input.nextLine();
                    if (gfood.equals("yes") || gfood.equals("Yes")) {
                        System.out.println(" ");
                        gp1.favoritefood();
                        loop = false;
                    } else if (gfood.equals("no") || gfood.equals("No")) {
                        System.out.println(" ");
                        System.out.println("END");
                        loop = false;
                    }
                }


//                PIKACHU


            } else if (choice.equals("Pikachu") || choice.equals("pikachu")) {
                ep1.choice();
                System.out.println(ep1);
                System.out.println(" ");
                System.out.println("Would you like you see Pikachu's special attack?");
                System.out.println("Yes/No");
                String pikchoice = input.nextLine();
                if (pikchoice.equals("yes") || pikchoice.equals("Yes")) {
                    System.out.println(" ");
                    ep1.specialattack();
                    System.out.println(" ");
                    System.out.println("Would you also like to know Pikachu's favorite food?");
                    System.out.println("Yes/No");
                    String efood = input.nextLine();
                    if (efood.equals("yes") || efood.equals("Yes")) {
                        System.out.println(" ");
                        ep1.favoritefood();
                        loop = false;
                    } else if (efood.equals("no") || efood.equals("No")) {
                        System.out.println(" ");
                        System.out.println("END");
                        loop = false;
                    }
                } else if (pikchoice.equals("no") || pikchoice.equals("No")) {
                    System.out.println("Would like to see favorite food then?");
                    System.out.println("Yes/No");
                    String efood = input.nextLine();
                    if (efood.equals("yes") || efood.equals("Yes")) {
                        System.out.println(" ");
                        ep1.favoritefood();
                        loop = false;
                    } else if (efood.equals("no") || efood.equals("No")) {
                        System.out.println(" ");
                        System.out.println("END");
                        loop = false;
                    }
                }
            }
        }


    }
}