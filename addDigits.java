public class addDigits {
    public int addDigits(int num) {
        return getNum(num);
    }
    public int getNum(int num){
        int sum = 0;
        if(num<10){
            return num;
        }
        else{
            while(num>0){
                sum+=num%10;
                num/=10;
            }
        }
        return getNum(sum);
    }
}
