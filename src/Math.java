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

    public boolean primeNum(int num){
        int sucet = 0;
        int sameNum =num;

        if(num <= 2 || num%2 == 0 ){
            return false;
        }else {
            while(sameNum!=0){
                int swapNum = sameNum%10;
                sameNum = sameNum/10;
                sucet +=swapNum;
            }
            if(sucet%3 == 0){
                return  false;
            }
            if(num % 5 != 0){
                if( num %11 != 0 && num % 13 != 0){
                    return true;
                }
            }

        }
        return false;
    }
}
