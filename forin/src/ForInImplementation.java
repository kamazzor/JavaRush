/**
 * Created by Arsen on 15.02.2017.
 * Реализация цикла for/in
 */
public class ForInImplementation {
    public static void main(String[] args){
        int count = 1;
        int masnum[][] = new int[3][3];
        for (int x[] : masnum){
            for (int y : x){
                x[y] = count++;
                System.out.print(x[y] + " ");
            }
            System.out.println();
        }
    }
}
