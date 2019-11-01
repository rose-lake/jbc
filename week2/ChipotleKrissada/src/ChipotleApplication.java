
import java.util.*;

public class ChipotleApplication {

    static final int C_RICE = 0;
    static final int C_MEAT = 1;
    static final int C_BEANS = 2;
    static final int C_SALSA = 3;
    static final int C_VEGGIES = 4;
    static final int C_CHEESE = 5;
    static final int C_GUAC = 6;
    static final int C_QUESO = 7;
    static final int C_SOURCREAM = 8;

    static final int C_MIN = 0;
    static final int C_MAX = 8;

    static final int NO_RICE = 10;
    static final int WHITE = 11;
    static final int BROWN = 12;

    static final int NO_MEAT = 20;
    static final int CHICKEN = 21;
    static final int STEAK = 22;
    static final int CARNIDAS = 23;
    static final int CHORIZO = 24;
    static final int SOFRITAS = 25;
    static final int VEGGIES = 26;

    static final int NO_BEANS = 30;
    static final int PINTO = 31;
    static final int BLACK = 32;

    static final int NO_SALSA = 40;
    static final int MILD = 41;
    static final int MEDIUM = 42 ;
    static final int HOT = 43;

    static final int NO_VEGGIES = 50;
    static final int LETTUCE = 51;
    static final int FAJITA = 52;

    static final int NO_CHEESE = 60;
    static final int CHEESE = 61;

    static final int NO_GUAC = 70;
    static final int GUAC = 71;

    static final int NO_QUESO = 80;
    static final int QUESO = 81;

    static final int NO_SOURCREAM = 90;
    static final int SOURCREAM = 91;

    private static Float pricePerBurrito = 3.00f;
    private static Float pricePerIngredient = 0.50f;

    private static HashMap<Integer,ArrayList<Integer>> Ingredient = new HashMap<>();
    private static HashMap<Integer,ArrayList<Integer>> AllBurrito = new HashMap<>();

    private static Random rand = new Random();

    public static void main(String[] args) {
        init();
        for (int burritoNumber = 1; burritoNumber <= 25; burritoNumber++) {

            AllBurrito.put(burritoNumber, getBurrito(new ArrayList<>()));
            System.out.printf("Burrito %d: %s\n", burritoNumber, getBurritoAsString(AllBurrito.get(burritoNumber)));


        }
        System.out.println("----!----1----!----2----!----3----!----4----!----5");
        System.out.println(stringWrapper("123 567 90 2345 7890123456 890 2345678901 34567890 234567 90 2345 7890123456 890 2345678901 34567890123",50));
        System.out.println("\n"+stringWrapper((String.format("This order has %s", getSummrize(AllBurrito))), 50));


    }

    public static String getBurritoAsString(ArrayList<Integer> burrito) {
        HashMap<Integer,Integer> counter = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int ingredientCounter = 0;
        Float price = 0f;

        for (int category = 0; category < C_MAX+1; category++) {
            counter.put(category,0);
        }

        int currentCategory = 0;

        Collections.sort(burrito);


        for (Integer ingredient : burrito) {
            int category = Math.round(ingredient / 10)-1;
            counter.put(category,counter.get(category)+1);
            ++ingredientCounter;
        }

        price = pricePerBurrito+ (ingredientCounter+pricePerIngredient);

        for (int category = C_MIN; category < C_MAX+1; category++) {
            if (0==counter.get(category))
                burrito.add((category+1)*10);
        }
        Collections.sort(burrito);

        for (Integer ingredient : burrito) {
            sb.append(", "+getIngredientAsString(ingredient));
        }
        sb.append(String.format("%5s $%.2f","",price));
        //sb.append(String.format("%5s $%.2f + (%d x $%.2f) = $%.2f","",pricePerBurrito,ingredientCounter,pricePerIngredient,price));


        return sb.substring(2);
    }

    public static String getSummrize(HashMap<Integer,ArrayList<Integer>> AllBurrito) {
        HashMap<Integer,Integer> ingredientCounter = new HashMap<>();
        int allIngredientCounter = 0;
        int allBurritoCounter = AllBurrito.size();
        for (ArrayList<Integer> burrito : AllBurrito.values()) {

            for (Integer ingredient : burrito) {
                if ((ingredient % 10) == 0) continue;
                ++allIngredientCounter;
                if (ingredientCounter.containsKey(ingredient)) {
                    ingredientCounter.replace(ingredient, 1+ingredientCounter.get(ingredient));
                }
                else {
                    ingredientCounter.put(ingredient,1);
                }

            }
        }

        ArrayList<Integer> allIngredient = new ArrayList(ingredientCounter.keySet());

        Collections.sort(allIngredient);

        StringBuilder sb = new StringBuilder();

        for (Integer ingredient : allIngredient) {
            sb.append(String.format(", %d %s",ingredientCounter.get(ingredient),getIngredientAsString(ingredient)));
            switch(ingredient) {

                case VEGGIES:   sb.append("(as meat option)");
                                break;
            }
        }

        sb.append(String.format(", and the sum is $%.2f",(pricePerIngredient*allIngredientCounter) + (pricePerBurrito*allBurritoCounter)));
        return sb.substring(2);


    }

    public static String stringWrapper(String s, int size) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> AllTokens = new ArrayList<String>(Arrays.asList(s.split(" ")));
        StringBuilder l = new StringBuilder();
        for (String token : AllTokens) {
            //System.err.printf("%s, l = %d, t = %d\n", token, l.length(), token.length());
            if (size < (l.length()+token.length()) )  {
                l.append("\n");
                sb.append(l.substring(1));
                l = new StringBuilder();
            }
            l.append(" ").append(token);

        }
        sb.append(l.substring(1));
        return sb.toString();

    }

    public static String getIngredientAsString(int ingredient) {
        switch (ingredient) {
            case C_RICE: return "rice";
            case C_MEAT: return "meat";
            case C_BEANS: return "beans";
            case C_SALSA: return "salsa";
            case C_VEGGIES: return "veggies";
            case C_CHEESE: return "cheese";
            case C_GUAC: return "guac";
            case C_QUESO: return "queso";
            case C_SOURCREAM: return "sour cream";

            case NO_RICE: return "no rice";
            case WHITE: return "white rice";
            case BROWN: return "brown rice";

            case NO_MEAT: return "no meat";
            case CHICKEN: return "chicken";
            case STEAK: return "steak";
            case CARNIDAS: return "carnidas";
            case CHORIZO: return "chorizo";
            case SOFRITAS: return  "sofritas";
            case VEGGIES: return "veggies";

            case NO_BEANS: return "no beans";
            case PINTO: return "pinto beans";
            case BLACK: return "black beans";

            case NO_SALSA: return "no salsa";
            case MILD: return "mild salsa";
            case MEDIUM: return "medium salsa";
            case HOT: return "hot salsa";

            case NO_VEGGIES: return "no veggies";
            case LETTUCE: return "lettuce";
            case FAJITA: return "fajita veggies";

            case NO_CHEESE: return "no cheese";
            case CHEESE: return "cheese";

            case NO_GUAC: return "no guac";
            case GUAC: return "guac";

            case NO_QUESO: return "no queso";
            case QUESO: return "queso";

            case NO_SOURCREAM: return "no sour cream";
            case SOURCREAM: return "sour cream";

            default: return "unknown("+ingredient+")";
        }
    }


    public static void init() {
        initCategory();
    }

    public static void initCategory() {
        Ingredient.put(C_RICE, new ArrayList<Integer>() {{
            add(WHITE);
            add(BROWN);
        }});
        Ingredient.put(C_MEAT, new ArrayList<Integer>() {{
            add(CHICKEN);
            add(STEAK);
            add(CARNIDAS);
            add(CHORIZO);
            add(SOFRITAS);
            add(VEGGIES) ;
        }});
        Ingredient.put(C_BEANS, new ArrayList<Integer>() {{
            add(PINTO);
            add(BLACK);
        }});
        Ingredient.put(C_SALSA, new ArrayList<Integer>() {{
            add(MILD);
            add(MEDIUM);
            add(HOT);
        }});
        Ingredient.put(C_VEGGIES, new ArrayList<Integer>() {{
            add(LETTUCE);
            add(FAJITA);
        }});
        Ingredient.put(C_CHEESE, new ArrayList<Integer>() {{
            add(CHEESE);
        }});
        Ingredient.put(C_GUAC, new ArrayList<Integer>() {{
            add(GUAC);
        }});
        Ingredient.put(C_QUESO, new ArrayList<Integer>() {{
            add(QUESO);
        }});
        Ingredient.put(C_SOURCREAM, new ArrayList<Integer>() {{
            add(SOURCREAM);
        }});
    }

    public static int r(int bound) {
        return rand.nextInt(Integer.MAX_VALUE)%bound;
    }

    public static ArrayList<Integer> getBurrito(ArrayList<Integer> burrito) {
        int ingredient;
        ArrayList<Integer> requiredCategory = getRequiredCategory(new ArrayList<Integer>(),(5+r(5)));

        for (Integer category : requiredCategory) {
            ingredient = getIngredient(category);
            burrito.add(ingredient);
        }

        for (int i = burrito.size(); i < (burrito.size()+r( 10-burrito.size())); i++) {
            int category = r(C_MAX);
            ingredient = getIngredient(category);
            if (burrito.contains(ingredient))
                i--;
            else
                burrito.add(getIngredient(category));
        }

        return burrito;

    }

    public static ArrayList<Integer> getRequiredCategory(ArrayList<Integer> requiredCategory, int size) {
        if (requiredCategory.size() >= size) return requiredCategory;
        int category = getCategory();

        if (!requiredCategory.contains(category))
            requiredCategory.add(category);

        return getRequiredCategory(requiredCategory,size);


    }

    public static int getIngredient(int category) {

         ArrayList<Integer> selection = Ingredient.get(category);

        if (selection == null) {
            System.err.printf("L 210 %s\n", getIngredientAsString(category));
        }
        return  selection.get(r(selection.size()));
    }

    public static int getCategory() {
        return r(C_MAX+1);
    }

}
