//문제 설명
//정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.

//제한사항
//-50000 ≤ num1 ≤ 50000
//-50000 ≤ num2 ≤ 50000*/

public class 두_수의_차 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if((num1 >= -50000 && num1 <= 50000) && (num2 >= -50000 && num2 <= 50000))
            answer = num1 - num2;
        return answer;
    }
}
