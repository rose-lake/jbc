import java.text.NumberFormat;
import java.util.*;

public class BurritoPlusWrapping {
    public static ArrayList<String> ingredients = new ArrayList<>();
    public static NumberFormat currency = NumberFormat.getCurrencyInstance();
    public static void main(String[] args) {
        System.out.println("Price guide: base burrito is $3.00, EACH additional item is $0.50.\nFor more than one item per category (e.g. \"white & brown rice\"), you will be charged individually for each item ($1.00).\n");
        String[] burritos = new String[25];
        String[] burritoList = new String[25];
        String burritoOrder = "";
        for (int i=0; i<25; i++) {
            burritos[i] = "Burrito " + (i+1) + ": "+ burritoMaker() + "\n";
        }
        for (int i=0; i<25; i++) {
            System.out.println(burritos[i]);
        }
        int whiterice = 0, brownrice = 0, chicken = 0, steak = 0, sofritas = 0, chorizo =0, carnitas = 0, veggies = 0, blackbeans = 0, pintobeans = 0,
                mildsalsa = 0, medsalsa = 0, hotsalsa = 0, lettuce = 0, fajitas = 0, cheese = 0, guac = 0, queso = 0, sourCream = 0;
        for(String x: ingredients) {
            switch (x){
                case "white rice":
                    whiterice++;
                    break;
                case "brown rice":
                    brownrice++;
                    break;
                case "white & brown rice":
                    whiterice++;
                    brownrice++;
                    break;
                case "chicken":
                    chicken++;
                    break;
                case "steak":
                    steak++;
                    break;
                case "sofritas":
                    sofritas++;
                    break;
                case "chorizo":
                    chorizo++;
                    break;
                case "carnitas":
                    carnitas++;
                    break;
                case "veggies":
                    veggies++;
                case "chk, stk, crn, chz, sfr, vggs":
                    chicken++; steak++; carnitas++; chorizo++; sofritas++; veggies++;
                case "black beans":
                    blackbeans++;
                    break;
                case "pinto beans":
                    pintobeans++;
                    break;
                case "pinto & black beans":
                    pintobeans++;
                    blackbeans++;
                    break;
                case "mild, medium and hot salsa":
                    mildsalsa++; medsalsa++; hotsalsa++;
                    break;
                case "mild salsa":
                    mildsalsa++;
                    break;
                case "medium salsa":
                    medsalsa++;
                    break;
                case "hot salsa":
                    hotsalsa++;
                    break;
                case "fajita veggies":
                    fajitas++;
                    break;
                case "lettuce":
                    lettuce++;
                    break;
                case "lettuce and f.veggies":
                    fajitas++;
                    lettuce++;
                    break;
                case "cheese":
                    cheese++;
                    break;
                case "guac":
                    guac++;
                    break;
                case "queso":
                    queso++;
                    break;
                case "sour cream":
                    sourCream++;
                    break;

            }

        }
        String orderList = "This order has " + whiterice + " white rice, " + brownrice + " brown rice, " + chicken
                + " chicken," + steak + " steak, " + carnitas + " carnitas, "+chorizo+ " chorizo, " + sofritas + " sofritas, "
                + veggies + " veggies(as meat option), " + blackbeans + " black beans, " + pintobeans + " pinto beans, "
                + mildsalsa + " mild salsa, " + medsalsa + " med salsa, " + hotsalsa + " hot salsa, " + fajitas + " fajitas, "
                + lettuce + " lettuce, " + cheese + " cheese, " + guac  + " guac, " + queso + " queso, " + sourCream + " sour cream, "
                + "and the sum is " + currency.format(priceCalculator(ingredients));
        //WAY 1 to do easy 50 characters
        ArrayList<String> wordwrapped = new ArrayList<>();
        int x = 50;
            for (int i = 0; i < orderList.length(); i=i+50) {
                wordwrapped.add(orderList.substring(i,x));
                x = x + 50;
                if( x > orderList.length()){
                    x = orderList.length()-1;
                }

        }
        for (String sentence : wordwrapped){
            System.out.println(sentence);
        }
        System.out.println();
        System.out.println();
        //Way 2
        String[] wordwrapped2=orderList.split(" ");
        int charlength = 50;
        String newSentence = "";
        ArrayList<String> print = new ArrayList<>();
        for(int i= 0; i < wordwrapped2.length;i++){
            if((newSentence.length()+wordwrapped2[i].length()) <= 50 && i == wordwrapped2.length-1){
                newSentence = newSentence + wordwrapped2[i] + " ";
                print.add(newSentence);
            }
            else if((newSentence.length()+wordwrapped2[i].length()) <= 50){
                newSentence = newSentence + wordwrapped2[i] + " ";
            }
            else {
                i--;
                print.add(newSentence);
                newSentence="";
            }
        }
        for (String word : print){
            System.out.println(word);
        }

    }
    public static String burritoMaker() {
        String rice = ricePicker();
        String meat = meatPicker();
        String beans = beanPicker();
        String salsa = salsaPicker();
        String veggies = veggiePicker();
        String cheese = cheesePicker();
        String guac = guacPicker();
        String queso = quesoPicker();
        String sourCream = sourCreamPicker();
        ArrayList<String> burritoIngredients = new ArrayList<>();
        Collections.addAll(burritoIngredients,rice,meat,beans,salsa,veggies,cheese,guac,queso,sourCream);


        double price = priceCalculator(burritoIngredients);



        String burrito = rice + ", " + meat + ", " + beans + ", " + salsa + ", " + veggies + ", "
                + cheese + ", " + guac + ", " + queso + ", " + sourCream + "\tPrice: " + currency.format(price);

        // polishing the output so the yes or no options are not displayed for "no"
        if (burrito.contains("no cheese,")) {
            burrito = burrito.replace(" no cheese,", "");
        }
        if (burrito.contains("no guac,")) {
            burrito = burrito.replace(" no guac,", "");
        }
        if (burrito.contains("sin queso,")) {
            burrito = burrito.replace(" sin queso,", "");
        } if (burrito.contains("no sour cream")) {
            burrito = burrito.replace(", no sour cream", "");
        }
        return burrito;
    }

    public static String ricePicker () {
        Random r = new Random();
        ArrayList<String> riceOptions = new ArrayList<>();
        riceOptions.add("white rice");
        riceOptions.add("brown rice");
        riceOptions.add("no rice");
        riceOptions.add("white & brown rice");
        String x = riceOptions.get(r.nextInt(riceOptions.size()));
        ingredients.add(x);
        return x;
    }

    public static String meatPicker () {
        Random r = new Random();
        ArrayList<String> meatOptions = new ArrayList<>();
        meatOptions.add("chicken");
        meatOptions.add("steak");
        meatOptions.add("carnitas");
        meatOptions.add("chorizo");
        meatOptions.add("sofritas");
        meatOptions.add("veggies");
        meatOptions.add("no meat");
        meatOptions.add("chk, stk, crn, chz, sfr, vggs");
        String x = meatOptions.get(r.nextInt(meatOptions.size()));
        ingredients.add(x);
        return x;
    }

    public static String beanPicker () {
        Random r = new Random();
        ArrayList<String> beanOptions = new ArrayList<>();
        beanOptions.add("pinto beans");
        beanOptions.add("black beans");
        beanOptions.add("no beans");
        beanOptions.add("pinto & black beans");
        String x = beanOptions.get(r.nextInt(beanOptions.size()));
        ingredients.add(x);
        return x;
    }

    public static String salsaPicker () {
        Random r = new Random();
        ArrayList<String> salsaOptions = new ArrayList<>();
        salsaOptions.add("mild salsa");
        salsaOptions.add("medium salsa");
        salsaOptions.add("hot salsa");
        salsaOptions.add("no salsa");
        salsaOptions.add("mild, medium and hot salsa");
        String x = salsaOptions.get(r.nextInt(salsaOptions.size()));
        ingredients.add(x);
        return x;
    }

    public static String veggiePicker () {
        Random r = new Random();
        ArrayList<String> veggieOptions = new ArrayList<>();
        veggieOptions.add("lettuce");
        veggieOptions.add("fajita veggies");
        veggieOptions.add("no veggies");
        veggieOptions.add("lettuce and f.veggies");
        String x = veggieOptions.get(r.nextInt(veggieOptions.size()));
        ingredients.add(x);
        return x;
    }

    public static String cheesePicker () {
        Random r = new Random();
        String [] cheese = new String[2];
        cheese[0] = "cheese";
        cheese[1] = "no cheese";
        String x = cheese[r.nextInt(cheese.length)];
        ingredients.add(x);
        return x;
    }

    public static String guacPicker () {
        Random r = new Random();
        String [] guac = new String[2];
        guac[0] = "guac";
        guac[1] = "no guac";
        String x = guac[r.nextInt(guac.length)];
        ingredients.add(x);
        return x;
    }

    public static String quesoPicker () {
        Random r = new Random();
        String [] queso = new String[2];
        queso[0] = "queso";
        queso[1] = "sin queso";
        String x = queso[r.nextInt(queso.length)];
        ingredients.add(x);
        return x;
    }

    public static String sourCreamPicker () {
        Random r = new Random();
        String [] sourCream = new String[2];
        sourCream[0] = "sour cream";
        sourCream[1] = "no sour cream";
        String x = sourCream[r.nextInt(sourCream.length)];
        ingredients.add(x);
        return x;
    }
    public static double priceCalculator(ArrayList<String> arrayList){
        double price = 3.0;

        // price controller
        for (String item:arrayList) {
            if (item.equals("white rice") || item.equals("brown rice")) {
                price += .5;
            }
            if (item.equals("white & brown rice")) {
                price += 1.0;
            }
            if (item.equals("chicken") || item.equals("steak") || item.equals("carnitas") || item.equals("chorizo")
                    || item.equals("sofritas") || item.equals("veggies")) {
                price += .5;
            }
            if (item.equals("chk, stk, crn, chz, sfr, vggs")) {
                price += 3.0;
            }
            if (item.equals("pinto beans") || item.equals("black beans")) {
                price += .5;
            }
            if (item.equals("mild salsa") || item.equals("medium salsa") || item.equals("hot salsa")) {
                price += .5;
            }
            if (item.equals("mild, medium and hot salsa")) {
                price += 1.5;
            }
            if (item.equals("lettuce") || item.equals("fajita veggies")) {
                price += .5;
            }
            if (item.equals("lettuce and f.veggies")) {
                price += 1.0;
            }
            if (item.equals("cheese")) {
                price += .5;
            }
            if (item.equals("guac")) {
                price += .5;
            }
            if (item.equals("queso")) {
                price += .5;
            }
            if (item.equals("sour cream")) {
                price += .5;
            }
        }
        return price;
    }
}

