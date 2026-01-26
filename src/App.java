import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Bostad> bostäder = new ArrayList<>();
        ArrayList<Lagring> lagringsHus = new ArrayList<>();
        ArrayList<Bestallningar> beställningar = new ArrayList<>();

        int beställningsNum = 0; // Index för beställning i beställningar lista

        while (true) {

            int svar1 = 0;
            while (true) {
                System.out.println(
                        "Tryck 1 för att skapa en bostad, 2 för lagring, 3 för lägenhetshus, 4 för att lista dina skapade bostäder, 5 för dina skapade garager, 6 för att skapa en beställning"
                                + "7 för att lista beställningar, 8 för att redigera beställningar");
                try {
                    svar1 = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Ange snälla rätt värde");
                    scanner.nextLine();
                }
            }

            // Användaren valde att skapa en bostad
            switch (svar1) {
                case 1:
                    int svar2 = 0;
                    while (true) {
                        System.out
                                .println(
                                        "För Lägenhet tryck 1, 2 för radhus, 3 för villa, annat för att gå tillbaka");
                        try {
                            svar2 = scanner.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Ange snälla ett giltigt tal!");
                            scanner.nextLine();
                        }
                    }

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
                        case 4:
                            int i = 1; // En räknevariabel
                            for (Bostad b : bostäder) {
                                System.out.println(i + " " + b);
                                i++;
                            }
                            break;
                        case 5:
                            int j = 1; // En räknevariabel
                            for (Lagring b : lagringsHus) {
                                System.out.println(j + " " + b);
                                j++;
                            }
                            break;

                        default:
                            break;
                    }
                    break;
                // Användaren valde att skapa en garage
                case 2:
                    skapaGarage(scanner, lagringsHus);
                    break;
                // Case 3 gör jag senare
                case 4:
                    int i = 1;
                    for (Bostad b : bostäder) {
                        System.out.println(i + " " + b); // Kallar metoden b.toString() för varje enskild objekt i
                                                         // listan
                        i++;
                    }
                    break;
                case 5:
                    int j = 0;
                    for (Lagring lagring : lagringsHus) {
                        System.out.println(j + " " + lagring);
                        j++;
                    }
                    break;
                case 6:
                    beställningar.add(new Bestallningar());
                    for (Bostad b : bostäder) {
                        if (b instanceof Lagenhet) {
                            Lagenhet l = (Lagenhet) b;
                            beställningar.get(beställningsNum).lägg_till_lagenhet(l);

                        } else if (b instanceof Radhus) {
                            Radhus r = (Radhus) b;
                            beställningar.get(beställningsNum).lägg_till_radhus(r);
                        } else if (b instanceof Villa) {
                            Villa v = (Villa) b;
                            beställningar.get(beställningsNum).lägg_till_villa(v);
                        }
                    }
                    for (Lagring lagring : lagringsHus) {
                        if (lagring instanceof Garage) {
                            Garage g = (Garage) lagring;
                            beställningar.get(beställningsNum).lägg_till_garage(g);
                        }
                    }
                    System.out.println("Beställning lagd med nummer " + beställningsNum);

                    beställningsNum++;
                    break;
                case 7:
                    int numInput = 0;
                    while (true) {
                        System.out.println("Ange din beställningsnummer");
                        try {
                            numInput = scanner.nextInt();
                            if (numInput > beställningar.size() || numInput < 0) {
                                System.out.println("Beställningsnumret finns inte!");
                                continue;
                            }
                            break; // Gå ut från loopet om allt är ok
                        } catch (Exception e) {
                            System.out.println("Du skrev fel input");
                        }
                    }

                    beställningar.get(numInput).lista_beställningar();

                    System.out.println("Om du vill redigera beställningen, tryck vidare, annars skriv 'nej' ");
                    String redigeraInput = scanner.nextLine();
                    if (redigeraInput.toLowerCase() == "nej") {
                        break;
                    }
                    System.out.println("1. Ta bort hela beställningen 2. Ta bort en viss enhet");
                    int redigeraInput2 = scanner.nextInt();

                    if (redigeraInput2 == 1) {
                        beställningar.remove(numInput);
                    }else if (redigeraInput2 == 2) {
                        
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

    static void skapaGarage(Scanner scanner, ArrayList<Lagring> lagringsHus) {

        double parkeringArea;
        while (true) {
            System.out.print("Ange parkerings area: ");
            try {
                parkeringArea = scanner.nextDouble();
                if (parkeringArea <= 0) {
                    System.out.println("Arean måste vara över 0");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett giltigt tal.");
                scanner.nextLine();
            }
        }

        double förrådsArea;
        while (true) {
            System.out.print("Ange förrådsarea i kvm (1-150): ");
            try {
                förrådsArea = scanner.nextDouble();
                if (förrådsArea < 1 || förrådsArea > 150) {
                    System.out.println("Förrådsarea måste vara mellan 1 och 150 kvm.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett tal.");
                scanner.nextLine();
            }
        }

        double pris;
        while (true) {
            System.out.print("Ange pris i kr (1-500000): ");
            try {
                pris = scanner.nextDouble();
                if (pris < 1 || pris > 500000) {
                    System.out.println("Pris måste vara mellan 1 och 500000 kr.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ogiltigt värde. Ange ett tal.");
                scanner.nextLine();
            }
        }

        lagringsHus.add(new Garage(förrådsArea, pris, parkeringArea));

    }

}
