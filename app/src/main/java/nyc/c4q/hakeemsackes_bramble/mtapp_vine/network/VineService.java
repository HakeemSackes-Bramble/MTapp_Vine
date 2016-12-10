package nyc.c4q.hakeemsackes_bramble.mtapp_vine.network;

import nyc.c4q.hakeemsackes_bramble.mtapp_vine.pojos.VineData;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by hakeemsackes-bramble on 12/10/16.
 */
public interface VineService {

    @GET("api/timelines/users/918753190470619136")
    Call<VineData> getVineData();
}
