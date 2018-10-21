package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class recipes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cases; i++) {
            String[] inputs = scanner.nextLine().split("\\s");
            int nrIngredients = Integer.parseInt(inputs[0]);
            float multiplier = Float.parseFloat(inputs[2]) / Float.parseFloat(inputs[1]);

            ArrayList<String[]> ingredients = new ArrayList<>();

            for (int j = 0; j < nrIngredients; j++) {
                ingredients.add(scanner.nextLine().split("\\s"));
            }

            System.out.printf("Recipe # %d%n", (i+1));
            for (String[] s : ingredients) {
                if (Float.parseFloat(s[2]) == 100.0) {
                    float weight = Float.parseFloat(s[1]) * multiplier;
                    for (String[] ingredientsPar : ingredients) {
                        System.out.printf("%s %.1f%n", ingredientsPar[0], (weight * (Float.parseFloat(ingredientsPar[2]) / 100.0)));
                    }
                    break;
                }
            }

            for (int j = 0; j < 40; j++) {
                System.out.print('-');
            }
            System.out.print("\n");
        }
    }

}
