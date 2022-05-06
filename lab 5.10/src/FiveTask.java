public class FiveTask {
    public static void main(String[] args) {
        int a, b, c, d;
        int num = 0 ;
        for (int i = 0; i <= 24; i++){
            a = i / 10;
            b = i % 10;
            for (int j = 0; j <= 59; j++){
                c = j / 10;
                d = j % 10;
                if(a == d & c == b){
                    System.out.println(a + "" + b + ":"+ c + "" + d);
                    num++;
                }
            }
        }
        System.out.println("Кількість співпадінь: " + num);
    }
}
