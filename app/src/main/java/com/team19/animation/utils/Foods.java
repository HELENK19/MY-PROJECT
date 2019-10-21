package com.team19.animation.utils;

import com.team19.animation.R;
import com.team19.animation.models.Food;

public class Foods {

    //Main_dishes
    public Food[] mainDishes = {

            Mustard_stuffed_chicken, Spicy_root_and_lentil_casserole, Chicken_biryani, chicken_chasseur
            , Oven_baked_risotto, Veggie_shepherds_pie, Hearty_pasta_soup, Crispy_Greek_style_pie
            , paella, salmon_with_roast_asparagus
    };

    public static Food Mustard_stuffed_chicken = new Food("Mustard-stuffed chicken"
            ,"This is so good we'd be surprised if this chicken fillet recipe doesn't become a firm favourite. Save it to your My Good Food collection and enjoy"
            ,3340
            ,"Main Meal"
            , R.drawable.mustard);
    public static Food Spicy_root_and_lentil_casserole = new Food("Spicy root & lentil casserole"
            ,"The potatoes in this recipe take on the spicy flavours beautifully - our idea of the perfect veggie supper"
            ,4675
            ,"Main Meal"
            , R.drawable.spicyroot);
    public static Food Chicken_biryani = new Food("Chicken biryani"
            ,"A great one-pot rice dish that can still be served up a few days later, perfect for leftovers"
            ,3380
            ,"Main Meal"
            , R.drawable.chickenbiryani);
    public static Food chicken_chasseur = new Food("One-pot chicken chasseur"
            ,"This French bistro classic is easy to make at home and fabulous with creamy mash or crusty bread"
            ,2098
            ,"Main Meal"
            , R.drawable.onepot);
    public static Food Oven_baked_risotto = new Food("Oven-baked risotto"
            ,"Cook this simple storecupboard risotto in the oven while you get on with something else – the result is still wonderfully creamy"
            ,215
            ,"Main Meal"
            , R.drawable.ovenbaked);
    public static Food Veggie_shepherds_pie = new Food("Veggie shepherd's pie with sweet potato mash"
            ,"The secret to this shepherd's pie’s filling is to choose big carrots so they don’t lose their texture when cooked.."
            ,1926
            ,"Main Meal"
            , R.drawable.veggie);

    public static Food Hearty_pasta_soup = new Food("Hearty pasta soup"
            ,"Do something different with a pack of tortellini. This filling soup is full of fibre, low fat and full of veg. The perfect lunch or supper"
            ,1598
            ,"Main Meal"
            , R.drawable.pastasoup);

    public static Food Crispy_Greek_style_pie = new Food("Crispy Greek-style pie"
            ,"A crispy pie that you can adapt for your needs, add chicken or keep it veggie. A good fail-safe for your repertoire"
            ,3344
            ,"Main Meal"
            , R.drawable.crispypie);
    public static Food paella = new Food("Easiest ever paella"
            ,"Think paella's too much of a challenge? Think again, this easy recipe makes it foolproof and is full of fantastic flavour..."
            ,4089
            ,"Main Meal"
            , R.drawable.paella);
    public static Food salmon_with_roast_asparagus = new Food("One-pan salmon with roast asparagus"
            ,"For an easy side dish to complement a spring roast, just cook this recipe without the salmon"
            ,276
            ,"Main Meal"
            , R.drawable.lasagne);


    //    //Desserts

    public Food[] desserts = {


            Profiterolesalted_toffee_ice_cream_sandwiches,Ultimate_lemon_meringue_pie
            ,Matcha_mousse_cake,No_cook_chocolate_tart,Strawberry_cheesecake,Almond_and_apple_tart
            ,Lavender_poached_pear_with_Poire_Williams_pudding,Pear_and_hazelnut_dartois
            ,Ultimate_crème_brûlée,Champagne_raspberry_possets
    };

    public static Food Profiterolesalted_toffee_ice_cream_sandwiches = new Food("Profiterole & salted toffee ice cream sandwiches"
            ,"Drizzle these fresh choux buns with plenty of hot toffee sauce and top with whatever you like – try homemade honeycomb, chopped nuts or your favourite chocolate bar..."
            ,447
            ,"Dessert"
            ,R.drawable.profiterole);

    public static Food Ultimate_lemon_meringue_pie = new Food("Ultimate lemon meringue pie"
            ,"You can't go wrong with one of Angela Nilsen's ultimates and this is no exception"
            ,1810
            ,"Dessert"
            ,R.drawable.ultimate);

    public static Food  Matcha_mousse_cake= new Food("Matcha mousse cake"
            ,"A popular ingredient in Asian desserts, matcha powder is made from finely ground green tea leaves. This pretty cake with white chocolate glaze and cherries is a bit of a challenge but worth it"
            ,428
            ,"Dessert"
            ,R.drawable.matcha);

    public static Food  No_cook_chocolate_tart= new Food("No-cook chocolate tart"
            ,"You can make it up to two days ahead. Any leftovers will make a welcome treat with a cup of coffee the next day"
            ,288
            ,"Dessert"
            ,R.drawable.nocook);

    public static Food  Strawberry_cheesecake= new Food("Strawberry cheesecake"
            ,"Follow our step-by-step recipe for this easy no-cook cheesecake – a delicious summer dessert for all occasions..."
            ,1457
            ,"Dessert"
            ,R.drawable.strawberry);

    public static Food  Almond_and_apple_tart = new Food("Almond & apple tart"
            ,"This autumnal tart has a delicate, sweet flavour and nutty frangipane filling. Serve with a dollop of Calvados Chantilly cream"
            ,345
            ,"Dessert"
            ,R.drawable.almondjpg);

    public static Food  Lavender_poached_pear_with_Poire_Williams_pudding = new Food("Lavender poached pear with Poire Williams pudding"
            ,"This make ahead dessert of pear liqueur-soaked sponge pudding with tender poached pears and a dollop of Chantilly cream is ideal for an autumn dinner party"
            ,1690
            ,"Dessert"
            ,R.drawable.lavender);

    public static Food  Pear_and_hazelnut_dartois = new Food("Pear & hazelnut dartois"
            ,"A dartois is a delicate puff pastry tart, filled with frangipane and fresh fruit - a winning dessert if you're entertaining guests..."
            ,1346
            ,"Dessert"
            ,R.drawable.pear);

    public static Food  Ultimate_crème_brûlée = new Food("Ultimate crème brûlée"
            ,"Our professional tips will help you to create this crunchy-and-custardy delight"
            ,1774
            ,"Dessert"
            ,R.drawable.ultimatecreamjpg);

    public static Food  Champagne_raspberry_possets = new Food("Champagne & raspberry possets"
            ,"The dryness of your chosen fizz works well with the delicate sweetness of this impressive posset"
            ,949
            ,"Dessert"
            ,R.drawable.champagne);








    //Drinks

    public Food[] drinks = {
            Old_Fashioned, Margarita, Cosmopolitan, Negroni, Moscow_Mule, Mojito, Whiskey_sour, Manhattan
            , Mimosa, Gimlet
    };

    public static Food  Old_Fashioned = new Food("Old Fashioned"
            ,"There may be no better test of a bartender's mettle than ordering an Old Fashioned"
            ,1358
            ,"Drink"
            ,R.drawable.old);

    public static Food  Margarita = new Food("Margarita"
            ,"Cloyingly sweet margarita mixes have given this drink a bad name. A well-made version is a fresh mix of lime juice and tequila, with a hint of sweetener"
            ,752
            ,"Drink"
            ,R.drawable.old);

    public static Food  Cosmopolitan = new Food("Cosmopolitan"
            ,"The cosmo became almost ubiquitous in the '90s thanks to the TV show Sex and the City, but this spin on the martini remains just as tasty today as when Carrie Bradshaw made it famous."
            ,522
            ,"Drink"
            ,R.drawable.cosmo);

    public static Food  Negroni = new Food("Negroni"
            ,"A favorite of bartenders all over the world, the Negroni is a simple three-ingredient cocktail"
            ,1087
            ,"Drink"
            ,R.drawable.cosmo);

    public static Food  Moscow_Mule = new Food("Moscow Mule"
            ,"Popular for good reason, the Moscow Mule is one of the most refreshing things to sip on a hot summer day. Its suggested vessel, a copper mug, also just looks sharp."
            ,183
            ,"Drink"
            ,R.drawable.moscow);

    public static Food  Mojito = new Food("Mojito"
            ,"Originating in Cuba, this refreshing rum-based sip is filled with mint and lime—a perfectly tropical combination for sipping by the pool or beach"
            ,368
            ,"Drink"
            ,R.drawable.mohito);

    public static Food  Whiskey_sour = new Food("Whiskey Sour"
            ,"Perhaps the most refreshing whiskey cocktail, this is an old reliable favorite."
            ,763
            ,"Drink"
            ,R.drawable.whiskey);

    public static Food  Manhattan = new Food("Manhattan"
            ,"Created sometime in the mid-1800s, the Manhattan is one of the booziest classic drink recipes."
            ,908
            ,"Drink"
            ,R.drawable.manhattan);

    public static Food  Mimosa = new Food("Mimosa"
            ,"We'd like to salute Frank Meier, the bartender at the Ritz Paris who in 1925 reportedly served the first mimosa. The recipe just might be the simplest cocktail ever created."
            ,1280
            ,"Drink"
            ,R.drawable.mimosa);

    public static Food  Gimlet = new Food("Gimlet"
            ,"The classic recipe calls for gin, but this drink is just as tasty if you substitute vodka instead."
            ,1002
            ,"Drink"
            ,R.drawable.gimlet);









}
