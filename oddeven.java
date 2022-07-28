public class oddeven {

    public String solution(int num) {
        String answer = "";
        int a=num%2;

        if(a==0){
            return "Even";
        }
        else if(a!=0){
            return "Odd";
        }

        return answer;
    }
}

