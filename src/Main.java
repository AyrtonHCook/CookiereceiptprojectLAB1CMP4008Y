import java.util.Scanner;
public class Main {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of batches(12 per batch):");
        int batches = scanner.nextInt();

        System.out.printf("Recipe : Chocolate chip cookies (makes "+batches*12+" cookies)`\n\n"
        +"Ingredients: "+ batches* 4 +"oz sugar\n"
        +"-            "+ batches* 4 +"oz butter\n"
        +"-            "+ batches* 8 +"oz self raising flower\n"
        +"-            "+ batches +"vanilla essenece\n\n"
        +"-            "+batches*4+"oz chocolate chips\n\n"
        +"step 1 Mix sugar, butter and self raising flour thoroughly\n"
        +"step 2 : Stir in egg, a few drops of vanilla essence and chocolate"
        +" chips.\n"
        +"step 3 : Roll out mixture and cut out cookies.\n"
        +"step4 : Bake in hot oven (Gas Mark 6) for 10-12 minutes.");
    }
}