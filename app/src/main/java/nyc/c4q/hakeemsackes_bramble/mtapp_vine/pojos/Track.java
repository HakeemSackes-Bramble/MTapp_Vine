package nyc.c4q.hakeemsackes_bramble.mtapp_vine.pojos;

/**
 * Created by hakeemsackes-bramble on 12/10/16.
 */

public class Track {

    public int albumTrackCount;
    public int hasAudioTrackTimeline;
    public String trackName;
    public int beatsPerMinute;
    public int albumTrackNumber;
    public String albumName;
    public String releaseDate;

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(int discNumber) {
        this.discNumber = discNumber;
    }

    public int getDiscCount() {
        return discCount;
    }

    public void setDiscCount(int discCount) {
        this.discCount = discCount;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }

    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getAlbumTrackNumber() {
        return albumTrackNumber;
    }

    public void setAlbumTrackNumber(int albumTrackNumber) {
        this.albumTrackNumber = albumTrackNumber;
    }

    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }

    public void setBeatsPerMinute(int beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public int getHasAudioTrackTimeline() {
        return hasAudioTrackTimeline;
    }

    public void setHasAudioTrackTimeline(int hasAudioTrackTimeline) {
        this.hasAudioTrackTimeline = hasAudioTrackTimeline;
    }

    public int getAlbumTrackCount() {
        return albumTrackCount;
    }

    public void setAlbumTrackCount(int albumTrackCount) {
        this.albumTrackCount = albumTrackCount;
    }

    public String artistName;
    public String albumArtist;
    public String composer;
    public String genre;
    public int discNumber;
    public int discCount;

}