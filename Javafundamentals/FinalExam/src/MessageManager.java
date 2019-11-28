import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageManager {
    public static class Message{
        private String name;
        private int sent;
        private  int received;

        public Message(String name, int sent, int received) {
            this.name = name;
            this.sent = sent;
            this.received = received;
        }

        public String getName() {
            return name;
        }

        public int getSent() {
            return sent;
        }

        public int getReceived() {
            return received;
        }

        public void setSent(int sent) {
            this.sent = sent;
        }

        public void setReceived(int received) {
            this.received = received;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        List<Message> messages = new ArrayList<>();
        String command;
        while (!"Statistics".equals(command = scanner.nextLine())){
            String[] arr = command.split("=");

            switch (arr[0]){
                case "Add":
                    String name = arr[1];
                    Message exist = findUser(name,messages);
                    if (exist == null){
                        messages.add(new Message(name,Integer.parseInt(arr[2]),Integer.parseInt(arr[3])));
                    }
                    break;
                case "Message":
                    String sender = arr[1];
                    String receiver = arr[2];
                    Message findSender = findUser(sender,messages);
                    Message findReceiver = findUser(receiver,messages);
                    if (findSender != null && findReceiver != null){
                        findSender.setSent(findSender.getSent() + 1);
                        if ((findSender.getSent() + findSender.getReceived()) >= capacity){
                            System.out.printf("%s reached the capacity!%n",findSender.getName());
                            messages.remove(findSender);
                        }
                        findReceiver.setReceived(findReceiver.getReceived() + 1);
                        if ((findReceiver.getReceived() + findReceiver.getSent()) >= capacity){
                            System.out.printf("%s reached the capacity!%n",findReceiver.getName());
                            messages.remove(findReceiver);
                        }

                    }
                    break;
                case "Empty":
                    if (arr[1].equals("All")){
                        messages = new ArrayList<>();
                    }else {
                        String toDel = arr[1];
                        Message delUser = findUser(toDel,messages);
                        if (delUser != null) {
                            messages.remove(delUser);
                        }
                    }
                    break;
            }

        }
        System.out.println("Users count: " + messages.size());
        messages.stream().sorted((o1,o2) -> {
            int res = Integer.compare(o2.getReceived(),o1.getReceived());
            if (res == 0){
                res = o1.getName().compareTo(o2.getName());
            }

            return res;
        }).forEach(x -> System.out.printf("%s - %d%n",x.getName(),(x.getReceived() + x.getSent())));
    }

    private static Message findUser(String name, List<Message> messages) {
        for (Message message : messages) {
            if (message.getName().equals(name)){
                return message;
            }
        }

        return null;
    }
}
