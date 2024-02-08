public class PlayListTester {
    private static PlayList playList; // Initialize in the main method or reset method

    public static void main(String[] args) {
        // Check minimum requirement for arguments
        if (args.length < 1) {
            printUsage();
            return;
        }

        // Reset playlist for each run to ensure a clean state
        resetPlaylist();

        String functionName = args[0];

        switch (functionName) {
            case "addTrack":
                if (args.length < 4) {
                    System.out.println("Insufficient arguments for addTrack.");
                } else {
                    testAddTrack(args[1], args[2], Integer.parseInt(args[3]));
                }
                break;
            case "getSize":
                testGetSize();
                break;
            case "removeLast":
                testRemoveLast();
                break;
            case "totalDuration":
                testTotalDuration();
                break;
            case "indexOf":
                if (args.length < 2) {
                    System.out.println("Insufficient arguments for indexOf.");
                } else {
                    testIndexOf(args[1]);
                }
                break;
            case "addAtIndex":
                if (args.length < 5) {
                    System.out.println("Insufficient arguments for addAtIndex.");
                } else {
                    testAddAtIndex(Integer.parseInt(args[1]), args[2], args[3], Integer.parseInt(args[4]));
                }
                break;
            case "removeAtIndex":
                if (args.length < 2) {
                    System.out.println("Insufficient arguments for removeAtIndex.");
                } else {
                    testRemoveAtIndex(Integer.parseInt(args[1]));
                }
                break;
            case "titleOfShortestTrack":
                testTitleOfShortestTrack();
                break;
            case "sortedInPlace":
                testSortedInPlace();
                break;
            default:
                System.out.println("Invalid function name. Please review the usage instructions:");
                printUsage();
        }
    }

    private static void resetPlaylist() {
        playList = new PlayList(5); // Resetting playlist to its default state
        System.out.println("Playlist has been reset.");
    }

    private static void printUsage() {
        System.out.println("Usage: java PlayListTester <function_name> [parameters...]");
        System.out.println("Available functions:");
        System.out.println("\taddTrack <title> <artist> <duration>");
        System.out.println("\tgetSize");
        System.out.println("\tremoveLast");
        System.out.println("\ttotalDuration");
        System.out.println("\tindexOf <title>");
        System.out.println("\taddAtIndex <index> <title> <artist> <duration>");
        System.out.println("\tremoveAtIndex <index>");
        System.out.println("\ttitleOfShortestTrack");
        System.out.println("\tsortedInPlace");
        System.out.println("Example: java PlayListTester addTrack \"Imagine\" \"John Lennon\" 183");
    }

    // Example test method
    private static void testAddTrack(String title, String artist, int duration) {
        Track track = new Track(title, artist, duration);
        boolean result = playList.add(track);
        System.out.println("Track added: " + result);
    }

        // Continue from the previous methods...

        private static void testGetSize() {
            System.out.println("Playlist Size: " + playList.getSize());
        }
    
        private static void testRemoveLast() {
            playList.removeLast();
            System.out.println("Last track removed. Current Size: " + playList.getSize());
        }
    
        private static void testTotalDuration() {
            System.out.println("Total Duration: " + playList.totalDuration() + " seconds");
        }
    
        private static void testIndexOf(String title) {
            int index = playList.indexOf(title);
            System.out.println("Index of \"" + title + "\": " + index);
        }
    
        private static void testAddAtIndex(int index, String title, String artist, int duration) {
            Track track = new Track(title, artist, duration);
            boolean result = playList.add(index, track);
            System.out.println("Track \"" + title + "\" added at index " + index + ": " + result);
        }
    
        private static void testRemoveAtIndex(int index) {
            playList.remove(index);
            System.out.println("Track at index " + index + " removed.");
        }
    
        private static void testTitleOfShortestTrack() {
            String title = playList.titleOfShortestTrack();
            if (title == null) {
                System.out.println("The playlist is empty or an error occurred.");
            } else {
                System.out.println("Title of the shortest track: " + title);
            }
        }
    
        private static void testSortedInPlace() {
            playList.sortedInPlace();
            System.out.println("Playlist sorted by increasing duration. Playlist order:");
            // Assuming PlayList.toString() is overridden to print track details in order
            System.out.println(playList);
        }
    
}
