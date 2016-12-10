package nyc.c4q.hakeemsackes_bramble.mtapp_vine.pojos;

import java.util.List;

/**
 * Created by hakeemsackes-bramble on 12/10/16.
 */
public class Repost {

    public String username;
    public int verified;
    public List<String> vanityUrls = null;
    public int flagsPlatformLo;
    public int repostId;
    public String avatarUrl;
    public int userId;
    public String profileBackground;
    public String created;
    public User user;
    public int postId;
    public int ipAddress;
    public int flagsPlatformHi;

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public int getFlagsPlatformHi() {
        return flagsPlatformHi;
    }

    public void setFlagsPlatformHi(int flagsPlatformHi) {
        this.flagsPlatformHi = flagsPlatformHi;
    }

    public int getFlagsPlatformLo() {
        return flagsPlatformLo;
    }

    public void setFlagsPlatformLo(int flagsPlatformLo) {
        this.flagsPlatformLo = flagsPlatformLo;
    }

    public int getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(int ipAddress) {
        this.ipAddress = ipAddress;
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

    public int getRepostId() {
        return repostId;
    }

    public void setRepostId(int repostId) {
        this.repostId = repostId;
    }

    public int getSourceType() {
        return sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public int getVerified() {
        return verified;
    }

    public void setVerified(int verified) {
        this.verified = verified;
    }

    public int sourceType;
    public int sourceId;

}
