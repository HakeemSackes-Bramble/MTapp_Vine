package nyc.c4q.hakeemsackes_bramble.mtapp_vine.pojos;

import android.media.AudioTrack;

import java.util.List;

/**
 * Created by hakeemsackes-bramble on 12/10/16.
 */

public class Record {

    public int liked;
    public String videoDashUrl;

    public List<AudioTrack> getAudioTracks() {
        return audioTracks;
    }

    public void setAudioTracks(List<AudioTrack> audioTracks) {
        this.audioTracks = audioTracks;
    }

    public String foursquareVenueId;
    public int remixDisabled;

    public int getBlocked() {
        return blocked;
    }

    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Object> getEntities() {
        return entities;
    }

    public void setEntities(List<Object> entities) {
        this.entities = entities;
    }

    public int getExplicitContent() {
        return explicitContent;
    }

    public void setExplicitContent(int explicitContent) {
        this.explicitContent = explicitContent;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getFollowRequested() {
        return followRequested;
    }

    public void setFollowRequested(int followRequested) {
        this.followRequested = followRequested;
    }

    public int getHasRemixes() {
        return hasRemixes;
    }

    public void setHasRemixes(int hasRemixes) {
        this.hasRemixes = hasRemixes;
    }

    public String getFoursquareVenueId() {
        return foursquareVenueId;
    }

    public void setFoursquareVenueId(String foursquareVenueId) {
        this.foursquareVenueId = foursquareVenueId;
    }

    public int getHasSimilarPosts() {
        return hasSimilarPosts;
    }

    public void setHasSimilarPosts(int hasSimilarPosts) {
        this.hasSimilarPosts = hasSimilarPosts;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public Loops getLoops() {
        return loops;
    }

    public void setLoops(Loops loops) {
        this.loops = loops;
    }

    public int getMyRepostId() {
        return myRepostId;
    }

    public void setMyRepostId(int myRepostId) {
        this.myRepostId = myRepostId;
    }

    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getProfileBackground() {
        return profileBackground;
    }

    public void setProfileBackground(String profileBackground) {
        this.profileBackground = profileBackground;
    }

    public int getPromoted() {
        return promoted;
    }

    public void setPromoted(int promoted) {
        this.promoted = promoted;
    }

    public int getRemixDisabled() {
        return remixDisabled;
    }

    public void setRemixDisabled(int remixDisabled) {
        this.remixDisabled = remixDisabled;
    }

    public Repost getRepost() {
        return repost;
    }

    public void setRepost(Repost repost) {
        this.repost = repost;
    }

    public Reposts getReposts() {
        return reposts;
    }

    public void setReposts(Reposts reposts) {
        this.reposts = reposts;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getVanityUrls() {
        return vanityUrls;
    }

    public void setVanityUrls(List<String> vanityUrls) {
        this.vanityUrls = vanityUrls;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    public String getVenueCategoryIconUrl() {
        return venueCategoryIconUrl;
    }

    public void setVenueCategoryIconUrl(String venueCategoryIconUrl) {
        this.venueCategoryIconUrl = venueCategoryIconUrl;
    }

    public String getVenueCategoryId() {
        return venueCategoryId;
    }

    public void setVenueCategoryId(String venueCategoryId) {
        this.venueCategoryId = venueCategoryId;
    }

    public String getVenueCategoryShortName() {
        return venueCategoryShortName;
    }

    public void setVenueCategoryShortName(String venueCategoryShortName) {
        this.venueCategoryShortName = venueCategoryShortName;
    }

    public String getVenueCity() {
        return venueCity;
    }

    public void setVenueCity(String venueCity) {
        this.venueCity = venueCity;
    }

    public String getVenueCountryCode() {
        return venueCountryCode;
    }

    public void setVenueCountryCode(String venueCountryCode) {
        this.venueCountryCode = venueCountryCode;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueState() {
        return venueState;
    }

    public void setVenueState(String venueState) {
        this.venueState = venueState;
    }

    public int getVerified() {
        return verified;
    }

    public void setVerified(int verified) {
        this.verified = verified;
    }

    public String getVideoDashUrl() {
        return videoDashUrl;
    }

    public void setVideoDashUrl(String videoDashUrl) {
        this.videoDashUrl = videoDashUrl;
    }

    public String getVideoLowURL() {
        return videoLowURL;
    }

    public void setVideoLowURL(String videoLowURL) {
        this.videoLowURL = videoLowURL;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Object getVideoWebmUrl() {
        return videoWebmUrl;
    }

    public void setVideoWebmUrl(Object videoWebmUrl) {
        this.videoWebmUrl = videoWebmUrl;
    }

    public int getUserId() {

        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int get_private() {
        return _private;
    }

    public void set_private(int _private) {
        this._private = _private;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public int userId;
    public int _private;
    public Object videoWebmUrl;
    public Loops loops;
    public String thumbnailUrl;
    public int explicitContent;
    public Repost repost;
    public int verified;
    public String avatarUrl;
    public Comments comments;
    public List<Object> entities = null;
    public String videoLowURL;
    public List<String> vanityUrls = null;
    public int blocked;
    public String username;
    public String description;
    public List<Object> tags = null;
    public String permalinkUrl;
    public int promoted;
    public int postId;
    public String profileBackground;
    public String videoUrl;
    public int followRequested;
    public String created;
    public int hasSimilarPosts;
    public String shareUrl;
    public int myRepostId;
    public int following;
    public Reposts reposts;
    public Likes likes;
    public int hasRemixes;
    public String venueCategoryId;
    public String venueName;
    public String venueCategoryShortName;
    public String venueCity;
    public String venueCountryCode;
    public String venueState;
    public String venueAddress;
    public String venueCategoryIconUrl;
    public List<AudioTrack> audioTracks = null;

}

