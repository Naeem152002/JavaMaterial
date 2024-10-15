import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        YoutubeChannel y = new YoutubeChannel();

        Subscriber s = new Subscriber("Aman");
        y.subscribe(s);
        Subscriber s1 = new Subscriber("Raman");
        y.subscribe(s1);
        y.newVedioUploaded("Learn code with naeem");
        y.newVedioUploaded("Angular post");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 create new Subscriber");
            System.out.println("Press 3 to exit");

            int c = Integer.parseInt(br.readLine());

            if (c == 1) {
                // new video upload code
                System.out.println("Enter video title");
                String video = br.readLine();
                y.newVedioUploaded(video);
            } else if (c == 2) {
                // create new subscribe
                System.out.println("Enter name of subscriber");
                String subName = br.readLine();
                y.newVedioUploaded(subName);
            } else if (c == 3) {
                // exit
                System.out.println("ThankYou for using app");
                break;
            } else {
                // wrong input
                System.out.println("Thankyou for using app");

            }
        }

    }

}
