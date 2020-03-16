package telephony;

import java.util.List;

public class Smartphone implements Callable,Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        String call = "Browsing: ";
        StringBuilder sb = new StringBuilder();
        for (String url : this.urls) {
            if (url.matches(".*\\d.*")){
                sb.append("Invalid URL!");
            }else {
                sb.append(call + url);
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public String call() {
        String call = "Calling... ";
        StringBuilder sb = new StringBuilder();
        for (String number : this.numbers) {
            if (number.matches(".*\\D.*")){
                sb.append("Invalid number!");
            }else {
                sb.append(call + number);
            }
            sb.append(System.lineSeparator());
        }
       return sb.toString();
    }
}
