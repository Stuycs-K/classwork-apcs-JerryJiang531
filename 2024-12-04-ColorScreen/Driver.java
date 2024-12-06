public class Driver{
    public static void main(String[] args){
        makeBorder();
        int[] rand = new int[3];
        for (int i = 0; i < 3; i++){
            rand[i] = (int)(Math.random() *100);
        }
        int inc = 20;
        for (int j = 0; j < 3; j++){
            if (rand[j] < 25){
                Text.color(Text.BRIGHT, Text.RED);
            }else if (rand[j] > 75){
                Text.color(Text.BRIGHT, Text.RED);
            }else{
                Text.color(Text.WHITE);
            }
            Text.go(2,inc);
            inc += 20;
            System.out.println(rand[j]);
        }
        System.out.println(Text.RESET);
        Text.go(31,0);
    }
    public static void makeBorder(){

        System.out.println();

        String border = "";

        for (int i = 0 ; i < 80; i++){
            border += ".";
            for (int j = 0; j < 30; j++){
                Text.erase(j,i,1);
            }
        }
        Text.color(Text.BLUE, Text.background(Text.YELLOW));
        Text.go(0,0);
        System.out.print(border);

        for (int i = 0 ; i < 30; i++){
            Text.go(i, 0);
            System.out.print(".");
            Text.go(i, 80);
            System.out.println(".");
        }
//        Text.go(30, 0);
        System.out.print(border);
        System.out.println(Text.RESET);
    }
}