import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        while (!"end".equals(command = scanner.nextLine())){
            String[] commArr = command.split(":");
            validSongArtist(commArr);
        }
    }

    private static void validSongArtist(String[] commArr) {
        String regexArtist = "^[A-Z][a-z'\\s*]+$";
        Pattern patternArtist = Pattern.compile(regexArtist);
        Matcher matcherArtist = patternArtist.matcher(commArr[0]);
        String regexSong = "^[A-Z\\s*]+$";
        Pattern patternSong = Pattern.compile(regexSong);
        Matcher matcherSong = patternSong.matcher(commArr[1]);
        if (matcherArtist.find() && matcherSong.find()){
            int artistLength = matcherArtist.group().length();
            int songLength = matcherSong.group().length();
            StringBuilder artistEncrypted = new StringBuilder();
            char upper = matcherArtist.group().charAt(0);
            if ((upper + artistLength) > 90){
                upper = (char) ((char) ((upper + artistLength) - 90) + 64);
            }else {
                upper = (char) (upper + artistLength);
            }
            artistEncrypted.append(upper);
            for (int i = 1; i < artistLength; i++) {
              char lower = matcherArtist.group().charAt(i);
              if (Character.isWhitespace(lower) || lower == '\''){
                  artistEncrypted.append(lower);
                  continue;
              }

                if ((lower + artistLength) > 122){
                    lower = (char) ((char) ((lower + artistLength) - 122) + 96);
                }else {
                    lower = (char) (lower + artistLength);
                }
                artistEncrypted.append(lower);
            }
            StringBuilder songEncrypted = new StringBuilder();
            for (int i = 0; i < songLength; i++) {
                upper = matcherSong.group().charAt(i);
                if (Character.isWhitespace(upper)){
                    songEncrypted.append(upper);
                    continue;
                }
                if ((upper + artistLength) > 90){
                    upper = (char) ((char) ((upper + artistLength) - 90) + 64);
                }else {
                    upper = (char) (upper + artistLength);
                }
                songEncrypted.append(upper);
            }

            System.out.printf("Successful encryption: %s@%s%n",artistEncrypted,songEncrypted);
            return;
        }

        System.out.println("Invalid input!");
    }
}
