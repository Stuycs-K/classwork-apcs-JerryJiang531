public class Driver{
    public static void main(String[] args){
        makeBorder();
    }
    public static void makeBorder(){

        System.out.println();

        String border = "";
        String filler = "";
        for (int i = 0 ; i < 80; i++){
            border += ".";
            filler += " ";
        }
        Text.color(Text.BLUE);
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