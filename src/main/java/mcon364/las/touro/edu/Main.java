package mcon364.las.touro.edu;

import java.util.List;
import java.util.Optional;

public class Main{
        public static Optional<String> getUserName(String envVarName) {
            return Optional.ofNullable(System.getenv(envVarName));
        }
    public static String getGreeting(String envVarName){
            var userName =  getUserName(envVarName);
            StringBuilder stringBuilder = new StringBuilder();
        if(userName.isPresent()){
                stringBuilder.append("Hi user: ");
                return stringBuilder.append(userName.get()).toString();
            }
            return stringBuilder.append("No user").toString();
    }
    public static int processValues(List<List<Integer>> data) {
        int ctr = 0;
        outer:
        for (List<Integer> row : data) {

            inner:
            for (int i = 0; i < row.size(); i++) {
                if (row.get(i) == 0) {
                    continue outer;
                }
                if (row.get(i) == 99) {
                    break outer;
                }

            }
            if (!row.contains(0)) {
                ctr++;
            }
        }
        return ctr;

    }
    public static void main(String[] args) {
        String userGreeting = getGreeting("USERNAME");
        String userNoGreeting = getGreeting("NO_SUCH_VAR");
        int counter = processValues(List.of(
                List.of(5, 10, 15),
                List.of(20, 0, 25),
                List.of(30, 35, 40),
                List.of(45, 99, 50),
                List.of(55, 60, 65)
        ));

    }
}