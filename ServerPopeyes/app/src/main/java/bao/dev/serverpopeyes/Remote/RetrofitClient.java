package bao.dev.serverpopeyes.Remote;

import android.view.animation.ScaleAnimation;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {
    private  static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl)
    {
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return  retrofit;
    }
}
