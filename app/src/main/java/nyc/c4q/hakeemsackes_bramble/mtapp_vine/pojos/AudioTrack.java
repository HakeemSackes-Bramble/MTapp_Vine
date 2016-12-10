package nyc.c4q.hakeemsackes_bramble.mtapp_vine.pojos;

/**
 * Created by hakeemsackes-bramble on 12/10/16.
 */

public class AudioTrack {

    public String origin;
    public String created;
    public Object deleted;
    public int trackId;
    public Object modified;

    public int getNumberOfMeasures() {
        return numberOfMeasures;
    }

    public void setNumberOfMeasures(int numberOfMeasures) {
        this.numberOfMeasures = numberOfMeasures;
    }

    public float getAudioOffset() {
        return audioOffset;
    }

    public void setAudioOffset(float audioOffset) {
        this.audioOffset = audioOffset;
    }

    public int getAverageBpm() {
        return averageBpm;
    }

    public void setAverageBpm(int averageBpm) {
        this.averageBpm = averageBpm;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Object getDeleted() {
        return deleted;
    }

    public void setDeleted(Object deleted) {
        this.deleted = deleted;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public int getLinkId() {
        return linkId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }

    public Object getModified() {
        return modified;
    }

    public void setModified(Object modified) {
        this.modified = modified;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getSnapToBeat() {
        return snapToBeat;
    }

    public void setSnapToBeat(int snapToBeat) {
        this.snapToBeat = snapToBeat;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public float getVideoOffset() {
        return videoOffset;
    }

    public void setVideoOffset(float videoOffset) {
        this.videoOffset = videoOffset;
    }

    public int numberOfMeasures;
    public Track track;
    public float audioOffset;
    public int snapToBeat;
    public int linkId;
    public float duration;
    public int averageBpm;
    public float videoOffset;

}