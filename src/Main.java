import hotel.controller.HotelController;
import hotel.view.HotelView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelView view = new HotelView(scanner);
        HotelController controller = new HotelController(view);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    int roomNumberToAdd = view.promptForRoomNumberToAdd();
                    controller.addRoom(roomNumberToAdd);
                    break;
                case 2:
                    int roomNumberToBook = view.promptForRoomNumberToBook();
                    String guestName = view.promptForGuestName();
                    controller.bookRoom(roomNumberToBook, guestName);
                    break;
                case 3:
                    int roomNumberToCancel = view.promptForRoomNumberToCancelBooking();
                    controller.cancelBooking(roomNumberToCancel);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add Room");
        System.out.println("2. Book Room");
        System.out.println("3. Cancel Booking");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }
}

