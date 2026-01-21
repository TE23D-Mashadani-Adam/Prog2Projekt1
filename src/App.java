import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Bostad> bostäder = new ArrayList<>();
        while (true) {
            System.out.println("Tryck 1 för att skapa en bostad, 2 för lagring, 3 för lägenhetshus");
            int svar1 = 0;
            try{
                svar1 = scanner.nextInt();
            }catch(Exception e){
                System.out.println("Ange snälla rätt värde");
            }
            switch (svar1) {
                case 1:
                    System.out.println("För Lägenhet tryck 1, 2 för radhus, 3 för villa, annat för att gå tillbaka");
                    int svar2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (svar2) {
                        case 1:
                            skapaLägenhet(scanner, bostäder);
                            break;
                        case 2:
                            skapaRadhus(scanner, bostäder);
                            break;
                        case 3:
                            skapaVilla(scanner, bostäder);
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
        }

    }

    static void skapaLägenhet(Scanner scanner, ArrayList<Bostad> bostäder) {
        int antalRum;
        while (true) {
            System.out.print("Ange antal rum (1-10): ");
            try {
                antalRum = scanner.nextInt();
                if (antalRum < 1 || antalRum > 10) {
                    System.out.println("Antal rum måste vara mellan 1 och 10. Försök igen.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett heltal.");
                scanner.nextLine();
            }
        }

        double area;
        while (true) {
            System.out.print("Ange area i kvm (1-700): ");
            try {
                area = scanner.nextDouble();
                if (area <= 0 || area > 700) {
                    System.out.println("Area måste vara mellan 1 och 700 kvm. Försök igen.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett tal.");
                scanner.nextLine();
            }
        }

        int antalBadRum;
        while (true) {
            System.out.print("Ange antal badrum (1-4): ");
            try {
                antalBadRum = scanner.nextInt();
                if (antalBadRum <= 0 || antalBadRum > 4) {
                    System.out.println("Antal badrum måste vara mellan 1 och 4. Försök igen.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett heltal.");
                scanner.nextLine();
            }
        }

        int antalKök;
        while (true) {
            System.out.print("Ange antal kök (1-3): ");
            try {
                antalKök = scanner.nextInt();
                if (antalKök <= 0 || antalKök > 3) {
                    System.out.println("Antal kök måste vara mellan 1 och 3. Försök igen.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett heltal.");
                scanner.nextLine();
            }
        }

        double pris;
        while (true) {
            System.out.print("Ange pris i kr (1-15000000): ");
            try {
                pris = scanner.nextDouble();
                if (pris <= 0 || pris > 15000000) {
                    System.out.println("Pris måste vara mellan 1 kr och 15 000 000 kr. Försök igen.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett tal.");
                scanner.nextLine();
            }
        }

        double månadsAvgift;
        while (true) {
            System.out.print("Ange månadsavgift i kr (1-4000): ");
            try {
                månadsAvgift = scanner.nextDouble();
                if (månadsAvgift <= 0 || månadsAvgift > 4000) {
                    System.out.println("Månadsavgift måste vara mellan 1 och 4000 kr. Försök igen.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett tal.");
                scanner.nextLine();
            }
        }

        double hyraPris;
        while (true) {
            System.out.print("Ange hyrespris i kr (1-15000): ");
            try {
                hyraPris = scanner.nextDouble();
                if (hyraPris <= 0 || hyraPris > 15000) {
                    System.out.println("Hyrespris måste vara mellan 1 och 15000 kr. Försök igen.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett tal.");
                scanner.nextLine();
            }
        }
        bostäder.add(new Lagenhet(antalRum, area, antalBadRum, antalKök, pris, månadsAvgift, hyraPris));
        System.out.println("Lägenhet skapad");
    }

    static void skapaRadhus(Scanner scanner, ArrayList<Bostad> bostäder) {

        int antalRum;
        while (true) {
            System.out.print("Ange antal rum (1-10): ");
            try {
                antalRum = scanner.nextInt();
                if (antalRum < 1 || antalRum > 10) {
                    System.out.println("Antal rum måste vara mellan 1 och 10.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett heltal.");
                scanner.nextLine();
            }
        }

        double area;
        while (true) {
            System.out.print("Ange area i kvm (1-700): ");
            try {
                area = scanner.nextDouble();
                if (area < 1 || area > 700) {
                    System.out.println("Area måste vara mellan 1 och 700 kvm.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett tal.");
                scanner.nextLine();
            }
        }

        int antalBadRum;
        while (true) {
            System.out.print("Ange antal badrum (1-4): ");
            try {
                antalBadRum = scanner.nextInt();
                if (antalBadRum < 1 || antalBadRum > 4) {
                    System.out.println("Antal badrum måste vara mellan 1 och 4.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett heltal.");
                scanner.nextLine();
            }
        }

        int antalKök;
        while (true) {
            System.out.print("Ange antal kök (1-3): ");
            try {
                antalKök = scanner.nextInt();
                if (antalKök < 1 || antalKök > 3) {
                    System.out.println("Antal kök måste vara mellan 1 och 3.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett heltal.");
                scanner.nextLine();
            }
        }

        double pris;
        while (true) {
            System.out.print("Ange pris i kr (1-15000000): ");
            try {
                pris = scanner.nextDouble();
                if (pris < 1 || pris > 15000000) {
                    System.out.println("Pris måste vara mellan 1 och 15000000.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett tal.");
                scanner.nextLine();
            }
        }

        double tomtArea;
        while (true) {
            System.out.print("Ange tomtarea i kvm (min 1): ");
            try {
                tomtArea = scanner.nextDouble();
                if (tomtArea < 1) {
                    System.out.println("Tomtarea måste vara minst 1 kvm.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett tal.");
                scanner.nextLine();
            }
        }

        int antalVåningar;
        while (true) {
            System.out.print("Ange antal våningar (min 1): ");
            try {
                antalVåningar = scanner.nextInt();
                if (antalVåningar < 1) {
                    System.out.println("Antal våningar måste vara minst 1.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett heltal.");
                scanner.nextLine();
            }
        }

        double altanArea;
        while (true) {
            System.out.print("Ange altanarea i kvm (min 1): ");
            try {
                altanArea = scanner.nextDouble();
                if (altanArea < 1) {
                    System.out.println("Altanarea måste vara minst 1 kvm.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett tal.");
                scanner.nextLine();
            }
        }

        bostäder.add(new Radhus(antalRum, area, antalBadRum, antalKök, pris, tomtArea, antalVåningar, altanArea));
    }

    static void skapaVilla(Scanner scanner, ArrayList<Bostad> bostäder) {

        int antalRum;
        while (true) {
            System.out.print("Ange antal rum (1-10): ");
            try {
                antalRum = scanner.nextInt();
                if (antalRum < 1 || antalRum > 10) {
                    System.out.println("Antal rum måste vara mellan 1 och 10.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett heltal.");
                scanner.nextLine();
            }
        }

        double area;
        while (true) {
            System.out.print("Ange area i kvm (1-700): ");
            try {
                area = scanner.nextDouble();
                if (area < 1 || area > 700) {
                    System.out.println("Area måste vara mellan 1 och 700 kvm.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett tal.");
                scanner.nextLine();
            }
        }

        int antalBadRum;
        while (true) {
            System.out.print("Ange antal badrum (1-4): ");
            try {
                antalBadRum = scanner.nextInt();
                if (antalBadRum < 1 || antalBadRum > 4) {
                    System.out.println("Antal badrum måste vara mellan 1 och 4.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett heltal.");
                scanner.nextLine();
            }
        }

        int antalKök;
        while (true) {
            System.out.print("Ange antal kök (1-3): ");
            try {
                antalKök = scanner.nextInt();
                if (antalKök < 1 || antalKök > 3) {
                    System.out.println("Antal kök måste vara mellan 1 och 3.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett heltal.");
                scanner.nextLine();
            }
        }

        double pris;
        while (true) {
            System.out.print("Ange pris i kr (1-15000000): ");
            try {
                pris = scanner.nextDouble();
                if (pris < 1 || pris > 15000000) {
                    System.out.println("Pris måste vara mellan 1 och 15000000.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett tal.");
                scanner.nextLine();
            }
        }

        double tomtArea;
        while (true) {
            System.out.print("Ange tomtarea i kvm (min 1): ");
            try {
                tomtArea = scanner.nextDouble();
                if (tomtArea < 1) {
                    System.out.println("Tomtarea måste vara minst 1 kvm.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett tal.");
                scanner.nextLine();
            }
        }

        int antalBassänger;
        while (true) {
            System.out.print("Ange antal bassänger (min 1): ");
            try {
                antalBassänger = scanner.nextInt();
                if (antalBassänger < 1) {
                    System.out.println("Antal bassänger måste vara minst 1.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett heltal.");
                scanner.nextLine();
            }
        }

        bostäder.add(new Villa(antalRum, area, antalBadRum, antalKök, pris, tomtArea, antalBassänger));
    }

}
