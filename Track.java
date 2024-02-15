/**
 * this class represents a music track
 * a track has a title (String), an artist (String), and a duration (int), in
 * seconds.
 * 
 * @Author: YBO
 * @version: 1.0
 */

public class Track {
    private String title;
    private String artist;
    private int duration;

    /**
     * Constructs a track from the given values.
     * 
     * @param title    - the title of the track
     * @param artist   - the artist of the track
     * @param duration - the duration of the track in seconds
     */
    public Track(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    /**
     * Returns this track's data as "artist, title, minutes:seconds".
     * For example, "John Lennon, Imagine, 3:07"
     */
    public String toString() {
        return artist + ", " + title + ", " + duration;
    }

    /** Returns this track's title. */
    public String getTitle() {
        return title;
    }

    /** Returns this track's artist. */
    public String getArtist() {
        return artist;
    }

    /** Returns this track's duration. */
    public int getDuration() {
        return duration;
    }

    /**
     * If this track's duration is shorter than the other track's duration
     * returns true; otherwise returns false.
     * 
     * @param other - the other track
     * @return - true if this track's duration is shorter than the other track's
     */
    public boolean isShorterThan(Track other) {
        return duration < other.duration;
    }

    /**
     * Returns a string that represents the totalSeconds as "minutes:seconds",
     * where seconds is always two digits. For example, "3:17" or "12:05".
     * 
     * @param totalSeconds - the total duration in seconds
     * @return - the formatted duration
     */
    private String formattedDuration(int totalSeconds) {
        // calculate the minutes and seconds
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        // return the formatted duration
        return minutes + ":" + (seconds < 10 ? "0" : "") + seconds;
    }
}