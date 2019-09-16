public class Math extends Subject {

    public int reverse(int num){
        String swapText= "";
        String swapTextNum = String.valueOf(num);
        int swapNum;

        if(swapTextNum.endsWith("0")){
            return 0;
        }else{
            while(num>0){
                swapNum = num%10;
                num = num/10;
                swapText += swapNum;
            }
            return Integer.parseInt(swapText);
        }

    }
}
