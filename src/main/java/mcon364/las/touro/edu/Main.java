package mcon364.las.touro.edu;

import java.util.List;
import java.util.Optional;

public class Main {
    public static Optional<String> getUserName(String envVar) {
        var userName = System.getenv(envVar);
        return Optional.ofNullable(userName);
    }
    public static String getGreeting(String envVar) {
        var userNameOpt = getUserName(envVar);
        var builder = new StringBuilder("Hello, ");
        userNameOpt.ifPresentOrElse(
            name -> builder.append(name),
            () -> builder.append("Guest")
        );
        return builder.toString();
    }

    public static void processValues(List<List<Integer>> data){
        cont: for (List<Integer> li: data){
            for (Integer i : li){
                if (i == 0){
                    continue cont;
                }
                if (i == 99){
                    break cont;
                }

            }
        }
    }

    public static void main(String[] args) {
        getGreeting("USERNAME");
    }
}
