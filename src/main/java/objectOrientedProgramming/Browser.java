package objectOrientedProgramming;

public class Browser {
    public void navigate(String address) {
        String ip = fingIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private static String sendHttpRequest(String ip) {
        return ip;
    }

    private static String fingIpAddress(String address) {
        return "217.0.0.1";
    }
}
