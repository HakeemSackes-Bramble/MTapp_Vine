package nyc.c4q.hakeemsackes_bramble.mtapp_vine.pojos;

import java.util.List;

/**
 * Created by hakeemsackes-bramble on 12/10/16.
 */


public class Record_ {

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }

    public User_ getUser() {
        return user;
    }

    public void setUser(User_ user) {
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

    public String username;
    public int verified;
    public List<String> vanityUrls = null;
    public String created;
    public int userId;
    public User_ user;
    public int likeId;


}
