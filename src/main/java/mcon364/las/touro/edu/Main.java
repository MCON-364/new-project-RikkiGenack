import java.util.Optional;

public class Main{
        public static Optional<String> getUserName(String envVarName) {
            return Optional.of(System.getenv(envVarName));
        }
    public static String getGreeting(String envVarName){
            var userName =  getUserName(envVarName);
            StringBuilder sb
            String greeting = switch (userName){
                yield greeting = userName.isPresent() ?
            }

    }
}