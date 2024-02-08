public class PlayListMethodTester {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please specify the method to test.");
            return;
        }

        switch (args[0]) {
            case "add":
                testAdd();
                break;
            case "removeLast":
                testRemoveLast();
                break;
            case "totalDuration":
                testTotalDuration();
                break;
            case "indexOf":
                testIndexOf();
                break;
            case "addAtIndex":
                testAddAtIndex();
                break;
            case "removeAtIndex":
                testRemoveAtIndex();
                break;
            case "sortedInPlace":
                testSortedInPlace();
                break;
            case "titleOfShortestTrack":
                testTitleOfShortestTrack();
                break;
            default:
                System.out.println("Unknown method to test.");
        }
    }

    private static void testAdd() {
        PlayList playList = new PlayList(5); // Adjusted capacity for all tracks
        boolean result1 = playList.add(new Track("Fernando", "ABBA", 354));
        boolean result2 = playList.add(new Track("Imagine", "John Lennon", 187));

        if (result1 && result2 && playList.getSize() == 2) {
            System.out.println("testAdd: PASS");
        } else {
            System.out.println("testAdd: FAIL");
        }
    }


    private static void testRemoveLast() {
        PlayList playList = new PlayList(5);
        playList.add(new Track("Fernando", "ABBA", 354));
        playList.add(new Track("Imagine", "John Lennon", 187));
    
        playList.removeLast(); // Should remove "Imagine"
    
        if (playList.getSize() == 1 && playList.indexOf("Imagine") == -1) {
            System.out.println("testRemoveLast: PASS");
        } else {
            System.out.println("testRemoveLast: FAIL");
        }
    }

    private static void testTotalDuration() {
        PlayList playList = new PlayList(5);
        playList.add(new Track("Thriller", "Michael Jackson", 222));
        playList.add(new Track("Yesterday", "The Beatles", 125)); // Total should be 347

        int totalDuration = playList.totalDuration();

        if (totalDuration == 347) {
            System.out.println("testTotalDuration: PASS");
        } else {
            System.out.println("testTotalDuration: FAIL. Expected 347, got " + totalDuration);
        }
    }

    private static void testIndexOf() {
        PlayList playList = new PlayList(5);
        playList.add(new Track("Fernando", "ABBA", 354));
        playList.add(new Track("Imagine", "John Lennon", 187));
        playList.add(new Track("Creep", "Radiohead", 369));
    
        int index = playList.indexOf("Imagine");
    
        if (index == 1) {
            System.out.println("testIndexOf: PASS");
        } else {
            System.out.println("testIndexOf: FAIL. Expected 1, got " + index);
        }
    }

    private static void testAddAtIndex() {
        PlayList playList = new PlayList(5);
        playList.add(new Track("Fernando", "ABBA", 354)); // Initial add to ensure the list isn't empty

        boolean result = playList.add(0, new Track("Yesterday", "The Beatles", 125)); // Add at the beginning
        
        if (result && "Yesterday".equals(playList.getTrack(0).getTitle())) {
            System.out.println("testAddAtIndex: PASS");
        } else {
            System.out.println("testAddAtIndex: FAIL");
        }
    }

    private static void testRemoveAtIndex() {
        PlayList playList = new PlayList(5);
        playList.add(new Track("Fernando", "ABBA", 354));
        playList.add(new Track("Imagine", "John Lennon", 187));
        playList.add(new Track("Creep", "Radiohead", 369)); // Added to be removed

        playList.remove(2); // Remove "Creep"

        if (playList.getSize() == 2 && playList.indexOf("Creep") == -1) {
            System.out.println("testRemoveAtIndex: PASS");
        } else {
            System.out.println("testRemoveAtIndex: FAIL");
        }
    }

    private static void testSortedInPlace() {
        PlayList playList = new PlayList(5);
        playList.add(new Track("Creep", "Radiohead", 369));
        playList.add(new Track("Yesterday", "The Beatles", 125)); // This should be the first after sorting
        playList.add(new Track("Fernando", "ABBA", 354));
    
        playList.sortedInPlace();
    
        // Assuming a method or approach to verify the order post-sort is implemented
        String firstTrackTitle = playList.getTrack(0).getTitle();

        if ("Yesterday".equals(firstTrackTitle)) {
            System.out.println("testSortedInPlace: PASS");
        } else {
            System.out.println("testSortedInPlace: FAIL. Expected 'Yesterday' to be first.");
        }
    }
    

    private static void testTitleOfShortestTrack() {
        PlayList playList = new PlayList(5);
        playList.add(new Track("Creep", "Radiohead", 369));
        playList.add(new Track("Yesterday", "The Beatles", 125)); // This is the shortest
        playList.add(new Track("Fernando", "ABBA", 354));
    
        String shortestTrack = playList.titleOfShortestTrack();
    
        if ("Yesterday".equals(shortestTrack)) {
            System.out.println("testTitleOfShortestTrack: PASS");
        } else {
            System.out.println("testTitleOfShortestTrack: FAIL. Expected 'Yesterday', got " + shortestTrack);
        }
    }

}
