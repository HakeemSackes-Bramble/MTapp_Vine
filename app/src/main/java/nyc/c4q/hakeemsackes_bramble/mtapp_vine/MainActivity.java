package nyc.c4q.hakeemsackes_bramble.mtapp_vine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import nyc.c4q.hakeemsackes_bramble.mtapp_vine.network.VineService;
import nyc.c4q.hakeemsackes_bramble.mtapp_vine.pojos.VineData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getVines();
    }

    public void getVines() { // its a

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.vine.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        VineService service = retrofit.create(VineService.class);
        Call<VineData> call = service.getVineData();
        call.enqueue(new Callback<VineData>() {
            @Override
            public void onResponse(Call<VineData> call, Response<VineData> response) {
                VineData data = response.body();
                System.out.println("it worked");
                Log.d("", "onResponse: post data " );
            }

            @Override
            public void onFailure(Call<VineData> call, Throwable t) {
                Log.d("error", t.getMessage());
                System.out.println("hey");
            }
        });
    }
}
