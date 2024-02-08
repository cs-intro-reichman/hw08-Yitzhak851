// Tests the PlayList and Track classes.
class RuniFi {
    
    public static void main(String[] args) {
        // Creates a play list with a maximum capacity of 10 tracks
        // (small maximum capacity is good for testing purposes)
        PlayList myList = new PlayList(10);
    
        // Creates some tracks
        Track track1 = new Track("Fernando", "ABBA", 354);
        Track track2 = new Track("Imagine", "John Lennon", 187);
        Track track3 = new Track("Creep", "Radiohead", 369);
        Track track4 = new Track("Thriller", "Michael Jackson", 222);
        Track track5 = new Track("Yesterday", "The Beatles", 125);
      
        // Adds the tracks to the List
        System.out.println("Adding tracks...");
        myList.add(track1);
        myList.add(track2);
        myList.add(track3);
        myList.add(track4);

        // Displays the list
        display("My list", myList);

        // Displays the total duration
        System.out.println("\nTotal time duration of my list (in seconds):" + myList.totalDuration());

        // Inserts a track to some location
        myList.add(1, track5);
        display("After adding Yesterday at location 1", myList);

        // Tests the ability to find the locations of track titles
        System.out.println("\nIndex of Creep: " + myList.indexOf("Creep"));
        System.out.println("\nIndex of Shake It Off: " + myList.indexOf("Shake It Off"));

        // Removes some tracks
        myList.remove(2);
        display("After removing the track in location 2", myList);

        myList.removeFirst();
        display("After removing the first track", myList);

        myList.removeLast();
        display("After removing the last track", myList);

        PlayList newList = new PlayList(10);
    
        // Creates some tracks and adds them to a new list
        newList.add(new Track("Believe", "Cher", 240));
        newList.add(new Track("Yellow", "Coldplay", 269));
        newList.add(new Track("Shallow", "Lady Gaga", 217));
        newList.add(new Track("Woman", "Doja Cat", 172));
        display("New list", newList);

        newList.remove("Yellow");
        display("New list after removing Yellow:", newList);

        // Adds all the tracks from the new list to my list 
        myList.add(newList);
        display("My list after merging with new list", myList);

        // Tests the ability to find the track with the shortest duration
        System.out.println("\nThe shortest track in my list is " + myList.titleOfShortestTrack());

        // Sorts the list 
        myList.sortedInPlace();
        display("My list after sorting by increasing duration", myList);
    }

    private static void display(String str, PlayList list) {
        System.out.println("\n" + str + ":" + list);
    }
}
