class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;

        for (int i = 0; i <= code.length() -1; i++) {
            char c = code.charAt(i);

            if (mode == 0) {
                if (c != '1') {
                    if (i % 2 == 0)
                        answer = answer + c;
                } else mode = 1;

            } else {
                if (c != '1') {
                    if (i % 2 != 0)
                        answer = answer + c;
                } else mode = 0;
            }
        }
        if (answer == "") {
            answer = "EMPTY";
        }

        return answer;


    }
}