package benchmark;


import org.openjdk.jmh.Main;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BenchMarkApp {

//    public static void main(String[] args) throws UnknownHostException {
//        System.setProperty("hostName", InetAddress.getLocalHost().getHostName());
//        System.setProperty("applicationName", "BenchMarkApp");
//        SpringApplication.run(BenchMarkApp.class, args);
//    }

    public static void main(String[] args) throws Exception {
        Main.main(args);
    }

}
