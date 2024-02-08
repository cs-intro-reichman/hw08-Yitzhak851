public class CombinedOperationsTester {
    public static void main(String[] args) {
        // Initialize the playlist with a capacity of 5 tracks
        PlayList playList = new PlayList(5);

        // Predefined set of operations
        performOperations(playList);

    }

    private static void performOperations(PlayList playList) {
        // Add tracks to the playlist
        playList.add(new Track("Fernando", "ABBA", 354));
        playList.add(new Track("Imagine", "John Lennon", 187));
        System.out.println("Tracks added: 2");
        System.out.println("Playlist Size: " + playList.getSize());

        // Check total duration
        System.out.println("Total Duration: " + playList.totalDuration() + " seconds");

        // Remove the last track and check size
        playList.removeLast();
        System.out.println("Last track removed");
        System.out.println("Playlist Size: " + playList.getSize());

        // Add another track
        playList.add(new Track("Creep", "Radiohead", 369));
        System.out.println("Track added: Creep");

        // Final state of the playlist
        System.out.println("Final Playlist Size: " + playList.getSize());
        System.out.println("Final Total Duration: " + playList.totalDuration() + " seconds");
    


        // Adding tracks at specific indexes
        playList.add(0, new Track("Yesterday", "The Beatles", 125)); // Add at the beginning
        System.out.println("Track 'Yesterday' added at index 0.");
        
        playList.add(playList.getSize(), new Track("Bohemian Rhapsody", "Queen", 354)); // Assuming to add at the end
        System.out.println("Track 'Bohemian Rhapsody' added at the end.");
        
        // Removing a track by index
        playList.remove(1); // This now refers to removing the second track which was "Imagine" initially
        System.out.println("Track at index 1 removed.");
        
        // Sorting the playlist
        playList.sortedInPlace();
        System.out.println("Playlist sorted by increasing duration.");
    
        // Since we can't directly print sorted tracks, let's focus on aspects we can test
        // Displaying the title of the shortest track after sorting
        System.out.println("Shortest track after sorting: " + playList.titleOfShortestTrack());
        
        // Final state of the playlist after additional operations
        System.out.println("Final Playlist Size after additional operations: " + playList.getSize());
        System.out.println("Final Total Duration after additional operations: " + playList.totalDuration() + " seconds");
    }
    

    
}
