import java.util.Scanner;

public class GettingInputs {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over from nextInt()

        System.out.print("Enter the genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter the album: ");
        String album = scanner.nextLine();

        System.out.print("Enter the song title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the artist: ");
        String artist = scanner.nextLine();

        // Print out the entered song details
        System.out.println("--------------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("--------------------------------");
        System.out.println("Year Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
    }
}
