package com.example.deliciasweb;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        TextView tvCountry = findViewById(R.id.tvCountry);
        ImageView imgRecipe1 = findViewById(R.id.imgRecipe1);
        TextView tvRecipe1 = findViewById(R.id.tvRecipe1);
        ImageView imgRecipe2 = findViewById(R.id.imgRecipe2);
        TextView tvRecipe2 = findViewById(R.id.tvRecipe2);
        ImageView imgRecipe3 = findViewById(R.id.imgRecipe3);
        TextView tvRecipe3 = findViewById(R.id.tvRecipe3);
        ImageView imgDessert1 = findViewById(R.id.imgDessert1);
        TextView tvDessert1 = findViewById(R.id.tvDessert1);
        ImageView imgDessert2 = findViewById(R.id.imgDessert2);
        TextView tvDessert2 = findViewById(R.id.tvDessert2);
        Button btnBack = findViewById(R.id.btnBack);

        String country = getIntent().getStringExtra("country");
        tvCountry.setText("Recetas de " + country);

        switch (country) {
            case "Bolivia":
                loadBoliviaRecipes(imgRecipe1, tvRecipe1, imgRecipe2, tvRecipe2, imgRecipe3, tvRecipe3, imgDessert1, tvDessert1, imgDessert2, tvDessert2);
                break;
            case "India":
                loadIndiaRecipes(imgRecipe1, tvRecipe1, imgRecipe2, tvRecipe2, imgRecipe3, tvRecipe3, imgDessert1, tvDessert1, imgDessert2, tvDessert2);
                break;
            case "Italia":
                loadItalyRecipes(imgRecipe1, tvRecipe1, imgRecipe2, tvRecipe2, imgRecipe3, tvRecipe3, imgDessert1, tvDessert1, imgDessert2, tvDessert2);
                break;
            case "Japon":
                loadJapanRecipes(imgRecipe1, tvRecipe1, imgRecipe2, tvRecipe2, imgRecipe3, tvRecipe3, imgDessert1, tvDessert1, imgDessert2, tvDessert2);
                break;
            case "Mexico":
                loadMexicoRecipes(imgRecipe1, tvRecipe1, imgRecipe2, tvRecipe2, imgRecipe3, tvRecipe3, imgDessert1, tvDessert1, imgDessert2, tvDessert2);
                break;
        }

        btnBack.setOnClickListener(v -> finish());
    }

    private void loadBoliviaRecipes(ImageView imgRecipe1, TextView tvRecipe1, ImageView imgRecipe2, TextView tvRecipe2, ImageView imgRecipe3, TextView tvRecipe3, ImageView imgDessert1, TextView tvDessert1, ImageView imgDessert2, TextView tvDessert2) {
        imgRecipe1.setImageResource(R.drawable.pique_macho);
        tvRecipe1.setText(formatText(
                "Pique Macho\n\n",
                "El Pique Macho es un plato cochabambino que se ha vuelto muy popular en todo Bolivia por su sabor picante.\n\n",
                "Ingredientes para 8 personas:\n",
                "1. 1 kilogramo de Lomo\n2. ½ kilogramo de Salchichas\n3. 8 Papas medianas\n4. 4 Cebollas grandes\n5. 2 Tomates medianos\n6. 8 Locotos\n7. Aceite\n8. Pimienta molida\n9. Comino\n10. Ajo molido\n11. 1 pizca de Sal\n\n",
                "Elaboración:\n",
                "1. Corta la carne en pedazos pequeños y condiméntala con sal, el ajo, la pimienta y el comino a gusto.\n\n" +
                        "2. Pica el locoto en cuadraditos pequeños y saltea en la sartén con un poco de aceite caliente, con la cebolla picada en pluma, el tomate en cuadraditos y una pizca de sal.\n\n" +
                        "3. Aparte, fríe la carne tapándola para obtener una carne jugosa.\n\n" +
                        "4. Dora las papas en aceite, córtalas en pedazos largos.\n\n" +
                        "5. Mezcla todo y agrega las salchichas picadas en rodajas y las papas fritas.\n\n" +
                        "6. Sirve adornando con trozos de locoto crudo picado en tiras largas."
        ));

        imgRecipe2.setImageResource(R.drawable.majadito);
        tvRecipe2.setText(formatText(
                "Majadito\n\n",
                "Majadito camba, un plato tradicional lleno de sabores auténticos.\n\n",
                "Ingredientes para 4 personas:\n",
                "1. 5 tazas de agua\n2. 1/2 kilo de charque\n3. 1 taza de arroz\n4. 1/2 taza de cebolla picada fina\n5. 1/2 taza de tomate pelado y picado fino\n6. 1 cucharilla de sal\n7. ½ Cubito Maggi de Carne\n8. 1/2 taza de aceite\n9. 4 semillas de urucú/achiote remojadas en 1/2 taza de agua\n10. 1/2 taza de agua o fondo\n11. 2 plátanos de freír\n12. 8 tajadas de yuca cocida y frita\n13. 4 huevos fritos\n\n",
                "Elaboración:\n",
                "1. Poner en una olla las cinco tazas de agua, cuando esté hirviendo agregar el charque y dejar cocer hasta que esté suave, sacar, martajar y desmenuzar.\n\n" +
                        "2. Al agua donde hirvió el charque, disolver medio cubito Maggi de Carne, añadir el arroz y la sal, dejar cocer a fuego medio por treinta minutos.\n\n" +
                        "3. Freír el charque desmenuzado hasta que esté dorado.\n\n" +
                        "4. Sofreír la cebolla, añadir el tomate, urucú colado, agua o caldo y la sal.\n\n" +
                        "5. Poner el charque frito, mezclar y agregar al arroz."
        ));

        imgRecipe3.setImageResource(R.drawable.sopa_de_mani);
        tvRecipe3.setText(formatText(
                "Sopa de Maní\n\n",
                "Este caldo ligero es muy versátil.\n\n",
                "Ingredientes para 6 personas:\n",
                "1. 1 kilo de carne de res cortada en trozos\n2. 1 taza de maní\n3. 5 papas cortadas en cuatro\n4. 2 cebollas picadas\n5. 1 tomate pelado y picado\n6. 1 pimentón verde picado\n7. 2 dientes de ajo\n8. 2 zanahorias picadas\n9. 1 taza de fideos retostada\n10. 1 taza de arvejas\n11. 1 taza de aceite\n12. 1/2 cucharilla de palillo\n13. Sal y pimienta\n14. 2 papas en corte paja o bastones\n15. Perejil picado\n16. Orégano\n\n",
                "Elaboración:\n",
                "1. Licuar el maní con un poco de agua.\n\n" +
                        "2. Cocinar la carne en agua con sal y reservar el caldo.\n\n" +
                        "3. Sofreír la cebolla y los ajos, agregar el tomate, perejil, palillo, orégano, maní licuado, zanahorias, papas, arvejas, pimentón y salpimentar.\n\n" +
                        "4. Incorporar el caldo de carne y cocinar por 40 minutos.\n\n" +
                        "5. Preparar papas fritas.\n\n" +
                        "6. Agregar la carne cocida, huevos, fideos retostados y cocinar 15 minutos.\n\n" +
                        "7. Servir con orégano, papas fritas y perejil picado."
        ));

        imgDessert1.setImageResource(R.drawable.som_);
        tvDessert1.setText(formatText(
                "Somó\n\n",
                "Descubre el Somó, una refrescante y nutritiva bebida típica de Santa Cruz, Bolivia.\n\n",
                "Ingredientes:\n",
                "1. 10 litros de agua\n2. 1 kilogramo de maíz frangollo especial para somó\n3. ¼ kilogramo de harina de maíz\n4. Clavo de olor\n5. 2 palitos de canela\n6. Azúcar al gusto\n\n",
                "Elaboración:\n",
                "1. Remojar el frangollo en agua.\n\n" +
                        "2. Hervir 10 litros de agua, agregar el maíz remojado, clavos de olor y canela.\n\n" +
                        "3. Cocinar a fuego lento hasta que el maíz se ablande.\n\n" +
                        "4. Diluye la harina de maíz en agua fría, agregar a la olla, revolver.\n\n" +
                        "5. Servir con azúcar al gusto."
        ));

        imgDessert2.setImageResource(R.drawable.helado_de_canela);
        tvDessert2.setText(formatText(
                "Helados de Canela\n\n",
                "Canela, azúcar, hielo y algunos “secretos” son los ingredientes indispensables para la elaboración de los helados de canela artesanales.\n\n",
                "Ingredientes para 8 personas:\n",
                "1. 5 tazas de agua\n2. 5 palitos de canela (de los que pintan)\n3. Azúcar a gusto\n4. 1 cucharilla de airampo (colorante natural)\n5. Hielo necesario para batir el helado\n6. Sal gruesa\n\n",
                "Elaboración:\n",
                "1. Hervir agua con canela, añadir 1 taza de agua fría.\n\n" +
                        "2. Añadir airampo y azúcar, dejar enfriar.\n\n" +
                        "3. Colar y vaciar en envase de acero inoxidable.\n\n" +
                        "4. Batir hasta que congele.\n\n" +
                        "5. Servir con empanadas si gusta."
        ));
    }



    private void loadIndiaRecipes(ImageView imgRecipe1, TextView tvRecipe1, ImageView imgRecipe2, TextView tvRecipe2, ImageView imgRecipe3, TextView tvRecipe3, ImageView imgDessert1, TextView tvDessert1, ImageView imgDessert2, TextView tvDessert2) {
        imgRecipe1.setImageResource(R.drawable.chicken_tikka_masala);
        tvRecipe1.setText(formatText(
                "Chicken Tikka Masala\n\n",
                "Aprenderemos a preparar un delicioso pollo tikka masala.\n\n",
                "Ingredientes para 4 personas:\n",
                "1. 500 g de pechuga de pollo, cortada en cubos\n" +
                        "2. 200 ml de yogur natural\n" +
                        "3. 2 cucharadas de garam masala\n" +
                        "4. 1 cucharadita de cúrcuma en polvo\n" +
                        "5. 1 cucharadita de comino molido\n" +
                        "6. 2 cucharadas de jengibre fresco rallado\n" +
                        "7. 3 dientes de ajo, finamente picados\n" +
                        "8. 400 g de tomate triturado\n" +
                        "9. 200 ml de crema para cocinar\n" +
                        "10. Sal y pimienta al gusto\n\n",
                "Elaboración:\n",
                "1. Marinar el pollo con yogur, garam masala, cúrcuma, comino, jengibre y ajo durante al menos 2 horas en refrigeración.\n\n" +
                        "2. Cocinar el pollo marinado hasta que esté bien dorado. Retirar y reservar.\n\n" +
                        "3. Añadir tomate triturado y cocinar hasta que la salsa se espese, aproximadamente 10 minutos.\n\n" +
                        "4. Incorporar la crema para cocinar, ajustar de sal y pimienta, y cocinar a fuego lento durante otros 10 minutos.\n\n" +
                        "5. Añadir el pollo, mezclar bien y cocinar por 5 minutos más.\n\n" +
                        "6. Servir con arroz basmati "
        ));

        imgRecipe2.setImageResource(R.drawable.chole__garbanzos_al_curry_);
        tvRecipe2.setText(formatText(
                "Chole (Garbanzos al Curry)\n\n",
                "La chana masala es un plato típico de la cocina del norte de la India.\n\n",
                "Ingredientes para 4 personas:\n",
                "1. 500 g de garbanzos cocidos\n" +
                        "2. 2 cebollas picadas\n" +
                        "3. 2 tomates picados\n" +
                        "4. 1 cucharada de pasta de jengibre y ajo\n" +
                        "5. 2 cucharaditas de garam masala\n" +
                        "6. 1 cucharadita de cúrcuma\n" +
                        "7. 1 cucharadita de comino molido\n" +
                        "8. 1 cucharadita de cilantro molido\n" +
                        "9. Aceite\n" +
                        "10. Sal y pimienta al gusto\n\n",
                "Elaboración:\n",
                "1. Sofreír cebollas en aceite hasta doradas. Añadir la pasta de jengibre y ajo, cocinar por 2 minutos.\n\n" +
                        "2. Incorporar tomates, garam masala, cúrcuma, comino y cilantro. Cocinar hasta que los tomates se deshagan.\n\n" +
                        "3. Agregar garbanzos, sal y pimienta. Cocinar a fuego lento por 20 minutos."
        ));

        imgRecipe3.setImageResource(R.drawable.palak_paneer);
        tvRecipe3.setText(formatText(
                "Palak Paneer\n\n",
                "Esta receta combina la espinaca (palak) y el paneer, un queso blanco prensado típico de la India.\n\n",
                "Ingredientes para 4 personas:\n",
                "1. 500 g de espinacas frescas\n" +
                        "2. 200 g de paneer (queso indio), cortado en cubos\n" +
                        "3. 1 cebolla grande, picada\n" +
                        "4. 2 tomates, picados\n" +
                        "5. 1 cucharadita de semillas de comino\n" +
                        "6. 1 cucharadita de garam masala\n" +
                        "7. 1/2 cucharadita de cúrcuma\n" +
                        "8. 2 dientes de ajo, picados\n" +
                        "9. 1 cucharada de jengibre fresco, rallado\n" +
                        "10. Aceite\n" +
                        "11. Sal al gusto\n\n",
                "Elaboración:\n",
                "1. Blanquear las espinacas en agua hirviendo por 2 minutos, escurrir y hacer puré. Reservar.\n\n" +
                        "2. En una sartén, calentar aceite y freír el paneer hasta que esté dorado. Reservar.\n\n" +
                        "3. En la misma sartén, añadir más aceite si es necesario y sofreír la cebolla, ajo y jengibre hasta que estén dorados.\n\n" +
                        "4. Añadir comino, garam masala y cúrcuma, cocinar por un minuto.\n\n" +
                        "5. Incorporar los tomates y cocinar hasta que se deshagan.\n\n" +
                        "6. Agregar el puré de espinacas y sal, cocinar por 10 minutos.\n\n" +
                        "7. Añadir el paneer, mezclar bien y cocinar por otros 5 minutos."
        ));

        imgDessert1.setImageResource(R.drawable.gulab_jamun);
        tvDessert1.setText(formatText(
                "Gulab Jamun\n\n",
                "El gulab jamun es un dulce de la cocina india y pakistaní.\n\n",
                "Ingredientes:\n",
                "1. 200 g de leche en polvo\n" +
                        "2. 100 g de harina de trigo\n" +
                        "3. 1 cucharadita de polvo para hornear\n" +
                        "4. 2 cucharadas de ghee (mantequilla clarificada)\n" +
                        "5. 150 ml de leche\n" +
                        "6. 300 g de azúcar\n" +
                        "7. 300 ml de agua\n" +
                        "8. 5-6 vainas de cardamomo\n" +
                        "9. Aceite vegetal para freír\n\n",
                "Elaboración:\n",
                "1. Mezclar la leche en polvo, la harina y el polvo para hornear.\n\n" +
                        "2. Añadir el ghee y mezclar bien. Agregar gradualmente la leche hasta formar una masa suave y homogénea.\n\n" +
                        "3. Formar pequeñas bolitas con la masa, asegurándose de que no tengan grietas.\n\n" +
                        "4. Calentar aceite en una sartén a fuego medio-bajo y freír las bolitas hasta que estén uniformemente doradas y cocidas por dentro.\n\n" +
                        "5. Para el almíbar, hervir el agua con el azúcar y el cardamomo hasta que se forme un almíbar ligeramente espeso. Retirar las vainas de cardamomo.\n\n" +
                        "6. Sumergir las bolitas calientes en el almíbar y dejar reposar al menos durante 2 horas antes de servir."
        ));

        imgDessert2.setImageResource(R.drawable.kheer);
        tvDessert2.setText(formatText(
                "Kheer\n\n",
                "El arroz con leche es un postre delicioso, muy popular en La India y Bangladesh.\n\n",
                "Ingredientes para 6 personas:\n",
                "1. 100 g de arroz basmati\n" +
                        "2. 1 litro de leche entera\n" +
                        "3. 150 g de azúcar\n" +
                        "4. 1 cucharadita de cardamomo molido\n" +
                        "5. 50 g de pasas\n" +
                        "6. 50 g de almendras laminadas\n\n",
                "Elaboración:\n",
                "1. Lavar el arroz y dejarlo en remojo durante 30 minutos. Escurrir.\n\n" +
                        "2. En una olla grande, llevar la leche a ebullición. Añadir el arroz y reducir el fuego.\n\n" +
                        "3. Cocinar a fuego lento, revolviendo ocasionalmente, hasta que el arroz esté cocido y la mezcla se haya espesado.\n\n" +
                        "4. Agregar el azúcar, el cardamomo, las pasas y la mitad de las almendras. Cocinar durante 5 minutos más.\n\n" +
                        "5. Servir caliente o frío, decorado con el resto de las almendras."
        ));
    }

    private void loadItalyRecipes(ImageView imgRecipe1, TextView tvRecipe1, ImageView imgRecipe2, TextView tvRecipe2, ImageView imgRecipe3, TextView tvRecipe3, ImageView imgDessert1, TextView tvDessert1, ImageView imgDessert2, TextView tvDessert2) {
        imgRecipe1.setImageResource(R.drawable.pasta);
        tvRecipe1.setText(formatText(
                "Pasta Carbonara\n\n",
                "La Pasta Carbonara es un plato italiano clásico hecho con pasta, huevo, queso Pecorino Romano, panceta y pimienta negra.\n\n",
                "Ingredientes para 4 personas:\n",
                "1. 400 g de pasta (spaghetti o rigatoni)\n" +
                        "2. 150 g de panceta\n" +
                        "3. 3 yemas de huevo\n" +
                        "4. 100 g de queso Pecorino Romano rallado\n" +
                        "5. Pimienta negra al gusto\n\n",
                "Elaboración:\n",
                "1. Cocinar la pasta al dente según las instrucciones del paquete.\n\n" +
                        "2. Dorar la panceta en una sartén hasta que esté crujiente.\n\n" +
                        "3. En un tazón aparte, mezclar las yemas de huevo con el queso rallado.\n\n" +
                        "4. Escurrir la pasta y mezclar con la panceta dorada. Luego agregar la mezcla de huevo y queso, revolviendo rápidamente.\n\n" +
                        "5. Agregar pimienta negra al gusto y servir caliente."
        ));

        imgRecipe2.setImageResource(R.drawable.rissoto);
        tvRecipe2.setText(formatText(
                "Risotto alla Milanese\n\n",
                "El Risotto alla Milanese es un delicioso plato italiano a base de arroz, azafrán, vino blanco y caldo de pollo.\n\n",
                "Ingredientes para 4 personas:\n",
                "1. 300 g de arroz Arborio\n" +
                        "2. 1 cucharadita de azafrán\n" +
                        "3. 1 cebolla picada\n" +
                        "4. 1 vaso de vino blanco seco\n" +
                        "5. 1.5 litros de caldo de pollo caliente\n" +
                        "6. 50 g de mantequilla\n" +
                        "7. 50 g de queso Parmesano rallado\n" +
                        "8. Sal y pimienta al gusto\n\n",
                "Elaboración:\n",
                "1. En una sartén grande, saltear la cebolla en mantequilla hasta que esté transparente.\n\n" +
                        "2. Añadir el arroz y tostarlo ligeramente. Agregar el vino blanco y dejar que se evapore.\n\n" +
                        "3. Disolver el azafrán en un poco de caldo caliente y agregar al arroz.\n\n" +
                        "4. Ir agregando caldo caliente poco a poco, revolviendo constantemente, hasta que el arroz esté cocido al dente.\n\n" +
                        "5. Añadir queso Parmesano rallado, sal y pimienta al gusto. Servir caliente."
        ));

        imgRecipe3.setImageResource(R.drawable.pizzamargarita);
        tvRecipe3.setText(formatText(
                "Pizza Margherita\n\n",
                "La Pizza Margherita es una pizza clásica italiana con tomate, mozzarella fresca, albahaca y aceite de oliva.\n\n",
                "Ingredientes para 2 pizzas:\n",
                "1. 500 g de masa para pizza\n" +
                        "2. 200 g de mozzarella fresca\n" +
                        "3. 4 tomates maduros\n" +
                        "4. Hojas de albahaca fresca\n" +
                        "5. Aceite de oliva virgen extra\n" +
                        "6. Sal y pimienta al gusto\n\n",
                "Elaboración:\n",
                "1. Estirar la masa para pizza en dos bases finas.\n\n" +
                        "2. Cubrir cada base con rodajas de tomate y mozzarella fresca.\n\n" +
                        "3. Agregar hojas de albahaca fresca.\n\n" +
                        "4. Salpimentar al gusto y rociar con aceite de oliva.\n\n" +
                        "5. Hornear en horno precalentado a 220°C hasta que la masa esté dorada y el queso burbujeante.\n\n" +
                        "6. Servir caliente."
        ));

        imgDessert1.setImageResource(R.drawable.tiramisu);
        tvDessert1.setText(formatText(
                "Tiramisú\n\n",
                "El Tiramisú es un postre italiano clásico hecho con capas de bizcocho empapado en café, mascarpone y cacao en polvo.\n\n",
                "Ingredientes para 6 personas:\n",
                "1. 4 yemas de huevo\n" +
                        "2. 150 g de azúcar\n" +
                        "3. 500 g de mascarpone\n" +
                        "4. 1 taza de café fuerte, enfriado\n" +
                        "5. 200 g de bizcochos de soletilla\n" +
                        "6. Cacao en polvo para espolvorear\n\n",
                "Elaboración:\n",
                "1. Batir las yemas con el azúcar hasta obtener una mezcla cremosa. Agregar el mascarpone y mezclar bien.\n\n" +
                        "2. Sumergir brevemente los bizcochos de soletilla en el café y colocar una capa en el fondo de un recipiente para servir.\n\n" +
                        "3. Cubrir con una capa de la mezcla de mascarpone.\n\n" +
                        "4. Repetir las capas hasta terminar con una capa de mascarpone.\n\n" +
                        "5. Refrigerar durante al menos 4 horas o toda la noche.\n\n" +
                        "6. Antes de servir, espolvorear con cacao en polvo."
        ));

        imgDessert2.setImageResource(R.drawable.pannacota);
        tvDessert2.setText(formatText(
                "Panna Cotta\n\n",
                "La Panna Cotta es un postre italiano de crema batida, azúcar y gelatina, servido con salsa de frutas o caramelo.\n\n",
                "Ingredientes para 4 personas:\n",
                "1. 500 ml de crema de leche\n" +
                        "2. 100 g de azúcar\n" +
                        "3. 1 vaina de vainilla (o esencia de vainilla)\n" +
                        "4. 4 hojas de gelatina\n" +
                        "5. Salsa de frutas o caramelo para servir\n\n",
                "Elaboración:\n",
                "1. En una cacerola, calentar la crema de leche con el azúcar y la vainilla hasta que esté caliente pero no hirviendo.\n\n" +
                        "2. Remojar las hojas de gelatina en agua fría, escurrir y añadir a la mezcla caliente, revolviendo hasta que se disuelvan.\n\n" +
                        "3. Verter la mezcla en moldes individuales y refrigerar durante al menos 4 horas o hasta que cuaje.\n\n" +
                        "4. Desmoldar y servir con salsa de frutas o caramelo."
        ));
    }

    private void loadJapanRecipes(ImageView imgRecipe1, TextView tvRecipe1, ImageView imgRecipe2, TextView tvRecipe2, ImageView imgRecipe3, TextView tvRecipe3, ImageView imgDessert1, TextView tvDessert1, ImageView imgDessert2, TextView tvDessert2) {
        imgRecipe1.setImageResource(R.drawable.sushi_roll);
        tvRecipe1.setText(formatText(
                "Sushi\n\n",
                "Llegar a ser una estrella del sushi es algo que requiere muchos años de aprendizaje. Lo cierto es que se puede hacer un sushi casero muy apañado desde la primera vez que nos pongamos a ello.\n\n",
                "Ingredientes para 4 personas:\n",
                "1. 4 hojas de alga nori\n" +
                        "2. 2 tazas de arroz para sushi\n" +
                        "3. 3 cucharadas de vinagre de arroz\n" +
                        "4. 2 cucharadas de azúcar\n" +
                        "5. 1 cucharadita de sal\n" +
                        "6. 200 g de pescado fresco (atún, salmón, etc.)\n" +
                        "7. 1 pepino\n" +
                        "8. 1 aguacate\n" +
                        "9. Salsa de soja para servir\n" +
                        "10. Wasabi y jengibre encurtido (opcional)\n\n",
                "Elaboración:\n",
                "1. Cocinar el arroz y mezclar con vinagre de arroz, azúcar y sal.\n\n" +
                        "2. Cortar el pescado, el pepino y el aguacate en tiras.\n\n" +
                        "3. Colocar una hoja de nori sobre una esterilla de sushi, extender una capa de arroz.\n\n" +
                        "4. Colocar el pescado y las verduras sobre el arroz y enrollar firmemente.\n\n" +
                        "5. Cortar el rollo en piezas de 2 cm y servir con salsa de soja, wasabi y jengibre encurtido."
        ));

        imgRecipe2.setImageResource(R.drawable.ramen);
        tvRecipe2.setText(formatText(
                "Ramen\n\n",
                "Después del sushi, el ramen es el plato japonés más omnipresente del mundo. Prepararlo en casa no exige mucho conocimiento, pero sí paciencia.\n\n",
                "Ingredientes para 4 personas:\n",
                "1. 4 porciones de fideos ramen\n" +
                        "2. 1 litro de caldo de pollo\n" +
                        "3. 2 dientes de ajo picados\n" +
                        "4. 1 trozo de jengibre\n" +
                        "5. 4 cucharadas de salsa de soja\n" +
                        "6. 2 cucharadas de mirin\n" +
                        "7. 4 huevos\n" +
                        "8. 200 g de espinacas frescas\n" +
                        "9. 200 g de carne de cerdo o pollo\n" +
                        "10. Cebolla verde picada para decorar\n\n",
                "Elaboración:\n",
                "1. Cocinar los fideos ramen según las instrucciones del paquete. Escurrir y reservar.\n\n" +
                        "2. En una olla, calentar el caldo de pollo con ajo, jengibre, salsa de soja y mirin.\n\n" +
                        "3. Cocinar los huevos a baja temperatura para obtener yemas cremosas.\n\n" +
                        "4. Saltear la carne y cocinar las espinacas en una sartén.\n\n" +
                        "5. Armar los tazones de ramen con fideos, caldo, huevo, carne, espinacas y cebolla verde."
        ));

        imgRecipe3.setImageResource(R.drawable.tempura);
        tvRecipe3.setText(formatText(
                "Tempura\n\n",
                "La tempura es una fritura ligera y crujiente que se ha convertido en un plato popular en Japón. Se puede hacer con una variedad de ingredientes, desde verduras hasta mariscos.\n\n",
                "Ingredientes para 4 personas:\n",
                "1. 1 taza de harina de tempura\n" +
                        "2. 1 huevo\n" +
                        "3. Agua fría\n" +
                        "4. Verduras y mariscos variados (calabacín, zanahorias, langostinos, etc.)\n" +
                        "5. Aceite para freír\n" +
                        "6. Salsa de soja para servir\n\n",
                "Elaboración:\n",
                "1. En un tazón, mezclar la harina de tempura con el huevo y agregar agua fría hasta obtener una masa ligera.\n\n" +
                        "2. Cortar las verduras y mariscos en trozos pequeños y sumergir en la masa de tempura.\n\n" +
                        "3. Calentar el aceite en una sartén a 180°C y freír los ingredientes hasta que estén dorados y crujientes.\n\n" +
                        "4. Escurrir en papel absorbente y servir con salsa de soja."
        ));

        imgDessert1.setImageResource(R.drawable.dorayaki);
        tvDessert1.setText(formatText(
                "Dorayaki\n\n",
                "El dorayaki es un postre japonés clásico que consiste en dos panqueques esponjosos rellenos de anko, una pasta dulce de judías azuki.\n\n",
                "Ingredientes:\n",
                "1. 1 taza de harina de trigo\n" +
                        "2. 1 cucharadita de polvo de hornear\n" +
                        "3. 2 huevos\n" +
                        "4. 1/2 taza de azúcar\n" +
                        "5. 2 cucharadas de miel\n" +
                        "6. 1 cucharadita de esencia de vainilla\n" +
                        "7. Anko (pasta de judías azuki) para el relleno\n\n",
                "Elaboración:\n",
                "1. En un tazón, mezclar la harina y el polvo de hornear.\n\n" +
                        "2. En otro tazón, batir los huevos y agregar el azúcar, la miel y la esencia de vainilla.\n\n" +
                        "3. Combinar las mezclas secas y húmedas hasta obtener una masa suave.\n\n" +
                        "4. Cocinar pequeñas porciones de masa en una sartén a fuego medio para hacer los panqueques.\n\n" +
                        "5. Rellenar los panqueques con anko y unirlos para formar los dorayaki."
        ));

        imgDessert2.setImageResource(R.drawable.mochi);
        tvDessert2.setText(formatText(
                "Mochi\n\n",
                "El mochi es un dulce japonés hecho de arroz glutinoso. Puede tener diferentes rellenos, como anko, frutas o helado.\n\n",
                "Ingredientes:\n",
                "1. 2 tazas de harina de arroz glutinoso\n" +
                        "2. 1/2 taza de azúcar\n" +
                        "3. Agua\n" +
                        "4. Relleno de tu elección (anko, frutas, helado)\n\n",
                "Elaboración:\n",
                "1. Mezclar la harina de arroz glutinoso con azúcar y agregar agua gradualmente hasta obtener una masa suave.\n\n" +
                        "2. Hervir agua en una vaporera.\n\n" +
                        "3. Dividir la masa en porciones pequeñas y formar discos.\n\n" +
                        "4. Colocar el relleno en el centro de cada disco y cerrar, formando bolas de mochi.\n\n" +
                        "5. Colocar las bolas en la vaporera y cocinar al vapor durante 15-20 minutos."
        ));
    }

    private void loadMexicoRecipes(ImageView imgRecipe1, TextView tvRecipe1, ImageView imgRecipe2, TextView tvRecipe2, ImageView imgRecipe3, TextView tvRecipe3, ImageView imgDessert1, TextView tvDessert1, ImageView imgDessert2, TextView tvDessert2) {
        imgRecipe1.setImageResource(R.drawable.tacos);
        tvRecipe1.setText(formatText(
                "Tacos al Pastor\n\n",
                "Los tacos al pastor son un platillo tradicional de la comida mexicana. Se caracterizan por la carne de cerdo adobada y cocinada en un trompo vertical.\n\n",
                "Ingredientes para 4 personas:\n",
                "1. 1 kg de carne de cerdo\n" +
                        "2. Adobo de achiote\n" +
                        "3. Tortillas de maíz\n" +
                        "4. Cilantro picado\n" +
                        "5. Cebolla picada\n" +
                        "6. Piña en trozos\n" +
                        "7. Salsa taquera\n\n",
                "Elaboración:\n",
                "1. Marinar la carne de cerdo con el adobo de achiote durante al menos 2 horas.\n\n" +
                        "2. Cocinar la carne en un trompo vertical o en el horno.\n\n" +
                        "3. Calentar las tortillas y armar los tacos con la carne, cilantro, cebolla, piña y salsa taquera."
        ));

        imgRecipe2.setImageResource(R.drawable.pozole);
        tvRecipe2.setText(formatText(
                "Pozole\n\n",
                "El pozole es un platillo tradicional mexicano, especialmente popular en celebraciones. Se prepara con maíz hominy y carne, generalmente de cerdo o pollo, y se sirve con diversos acompañamientos.\n\n",
                "Ingredientes para 4 personas:\n",
                "1. 1 taza de maíz hominy\n" +
                        "2. 500 g de carne de cerdo o pollo\n" +
                        "3. 1 cebolla\n" +
                        "4. 2 dientes de ajo\n" +
                        "5. 2 chiles secos\n" +
                        "6. 1 hoja de laurel\n" +
                        "7. Caldo de pollo\n" +
                        "8. Repollo, rábanos, cebolla y limón para acompañar\n\n",
                "Elaboración:\n",
                "1. Cocinar el maíz hominy en agua con cal hasta que se ablande.\n\n" +
                        "2. Cocinar la carne con cebolla, ajo, chiles secos y laurel.\n\n" +
                        "3. Agregar el maíz hominy cocido y caldo de pollo al gusto.\n\n" +
                        "4. Servir caliente con repollo, rábanos, cebolla y limón."
        ));

        imgRecipe3.setImageResource(R.drawable.enchiladas);
        tvRecipe3.setText(formatText(
                "Enchiladas Rojas\n\n",
                "Las enchiladas rojas son un platillo tradicional de la cocina mexicana que consiste en tortillas de maíz rellenas de carne (generalmente pollo, res o cerdo), enrolladas y cubiertas con una salsa roja picante.\n\n",
                "Ingredientes para 4 personas:\n",
                "1. 12 tortillas de maíz\n" +
                        "2. 500 g de pollo desmenuzado\n" +
                        "3. 1 cebolla picada\n" +
                        "4. 2 dientes de ajo picados\n" +
                        "5. Salsa de chile rojo\n" +
                        "6. Queso rallado\n" +
                        "7. Crema y aguacate para servir\n\n",
                "Elaboración:\n",
                "1. Saltear la cebolla y el ajo, agregar el pollo desmenuzado y cocinar por unos minutos.\n\n" +
                        "2. Rellenar las tortillas con la mezcla de pollo y enrollar.\n\n" +
                        "3. Colocar las enchiladas en una fuente, bañar con salsa de chile rojo y espolvorear queso rallado.\n\n" +
                        "4. Gratinar en el horno hasta que el queso se derrita.\n\n" +
                        "5. Servir con crema y aguacate."
        ));

        imgDessert1.setImageResource(R.drawable.alegrias);
        tvDessert1.setText(formatText(
                "Alegrías Mexicanas\n\n",
                "Las alegrías mexicanas son un dulce tradicional hecho con amaranto y miel. Son nutritivas y deliciosas, además de ser parte de la cultura mexicana.\n\n",
                "Ingredientes:\n",
                "1. 1 taza de amaranto\n" +
                        "2. 1/2 taza de miel\n" +
                        "3. Frutas secas al gusto (opcional)\n\n",
                "Elaboración:\n",
                "1. En una sartén, tostar el amaranto a fuego medio hasta que comience a oler y se dore ligeramente.\n\n" +
                        "2. Calentar la miel a fuego lento hasta que se vuelva líquida.\n\n" +
                        "3. Mezclar el amaranto tostado con la miel y las frutas secas si se desea.\n\n" +
                        "4. Extender la mezcla en un molde y presionar para compactarla.\n\n" +
                        "5. Dejar enfriar y cortar en porciones."
        ));

        imgDessert2.setImageResource(R.drawable.cajeta);
        tvDessert2.setText(formatText(
                "Cajetas Mexicanas\n\n",
                "La cajeta es un dulce típico mexicano elaborado a base de leche de cabra o de vaca. Es similar al caramelo, pero con un sabor distintivo y delicioso.\n\n",
                "Ingredientes:\n",
                "1. 1 litro de leche de cabra o de vaca\n" +
                        "2. 2 tazas de azúcar\n" +
                        "3. 1 rama de canela (opcional)\n" +
                        "4. 1 cucharadita de vainilla (opcional)\n\n",
                "Elaboración:\n",
                "1. En una cacerola grande, calentar la leche con el azúcar a fuego medio-bajo.\n\n" +
                        "2. Revolver constantemente hasta que la mezcla espese y tome un color dorado.\n\n" +
                        "3. Si se desea, agregar la rama de canela y la vainilla.\n\n" +
                        "4. Continuar cocinando hasta obtener la consistencia deseada.\n\n" +
                        "5. Dejar enfriar y transferir a frascos para almacenar."
        ));

























    }
    private SpannableString formatText(String title, String description, String ingredientsTitle, String ingredients, String preparationTitle, String preparation) {
        String fullText = title + description + ingredientsTitle + ingredients + preparationTitle + preparation;
        SpannableString spannableString = new SpannableString(fullText);


        spannableString.setSpan(new RelativeSizeSpan(1.5f), 0, title.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new ForegroundColorSpan(Color.RED), 0, title.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        int descStart = title.length();
        int descEnd = descStart + description.length();

        spannableString.setSpan(new RelativeSizeSpan(1.2f), descStart, descEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        int ingTitleStart = descEnd;
        int ingTitleEnd = ingTitleStart + ingredientsTitle.length();
        // Apply styles to the ingredients title
        spannableString.setSpan(new RelativeSizeSpan(1.3f), ingTitleStart, ingTitleEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new ForegroundColorSpan(Color.BLUE), ingTitleStart, ingTitleEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        int ingStart = ingTitleEnd;
        int ingEnd = ingStart + ingredients.length();

        spannableString.setSpan(new RelativeSizeSpan(1.0f), ingStart, ingEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        int prepTitleStart = ingEnd;
        int prepTitleEnd = prepTitleStart + preparationTitle.length();
        // Apply styles to the preparation title
        spannableString.setSpan(new RelativeSizeSpan(1.3f), prepTitleStart, prepTitleEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new ForegroundColorSpan(Color.BLUE), prepTitleStart, prepTitleEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        int prepStart = prepTitleEnd;
        int prepEnd = prepStart + preparation.length();

        spannableString.setSpan(new RelativeSizeSpan(1.0f), prepStart, prepEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }
}
