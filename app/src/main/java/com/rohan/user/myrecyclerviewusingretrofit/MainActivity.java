package com.rohan.user.myrecyclerviewusingretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
TextView textView;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("OK", "In OnClick");
                StackTipsApi.Factory.getInstance().getData().enqueue(new Callback<Data>() {

                    @Override
                    public void onResponse(Call<Data> call, Response<Data> response) {
                        Log.d("OK", "In OnResponse");
                        textView.setText(response.body().getStatus());

                    }

                    @Override
                    public void onFailure(Call<Data> call, Throwable t) {
                        Log.e("Failed", t.getMessage());
                    }
                });
            }
        });

    }

}
