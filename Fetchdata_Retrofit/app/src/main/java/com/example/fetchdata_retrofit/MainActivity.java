package com.example.fetchdata_retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView tV;

    String url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tV = (TextView)findViewById(R.id.tv);
         tV.setText(" ");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


          mayapi api = retrofit.create(mayapi.class);

        Call<List<model>>  call = api.getmodels();

        call.enqueue(new Callback<List<model>>() {
            @Override
            public void onResponse(Call<List<model>> call, Response<List<model>> response) {

                List<model> data = response.body();
                for (int i=0;i<data.size();i++)
                    tV.append("Sl No: "+data.get(i).getId()+"\n Title: "+data.get(i).getTitle()+"\n\n\n");


            }

            @Override
            public void onFailure(Call<List<model>> call, Throwable t) {

            }
        });


    }
}