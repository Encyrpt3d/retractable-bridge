import java.util.Scanner;

public class RetractableBridge {
    private static boolean isBridgeOpen = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("🚧 Retractable Bridge Simulation 🚧");
        System.out.println("Commands: open | close | boat | exit");

        while (true) {
            System.out.print("\n> Command: ");
            input = scanner.nextLine().toLowerCase();

            switch (input) {
                case "open":
                    if (!isBridgeOpen) {
                        isBridgeOpen = true;
                        System.out.println("🔓 The bridge is now OPEN.");
                    } else {
                        System.out.println("Bridge is already open.");
                    }
                    break;
                case "close":
                    if (isBridgeOpen) {
                        isBridgeOpen = false;
                        System.out.println("🔒 The bridge is now CLOSED.");
                    } else {
                        System.out.println("Bridge is already closed.");
                    }
                    break;
                case "boat":
                    if (isBridgeOpen) {
                        System.out.println("🚤 The boat passes through safely!");
                    } else {
                        System.out.println("❌ The boat cannot pass. The bridge is closed!");
                    }
                    break;
                case "exit":
                    System.out.println("Simulation ended.");
                    return;
                default:
                    System.out.println("❓ Unknown command. Try: open, close, boat, exit.");
                    break;
            }
        }
    }
}

