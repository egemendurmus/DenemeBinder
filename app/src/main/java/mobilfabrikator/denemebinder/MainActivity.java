package mobilfabrikator.denemebinder;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mobilfabrikator.denemebinder.Api.ApiClient;
import mobilfabrikator.denemebinder.Api.RestInterfaceController;
import mobilfabrikator.denemebinder.model.RetrofitResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    String x;
    RestInterfaceController restInterface;

    @BindView(R.id.buttonFirst)
    Button first_button;
    @BindView(R.id.buttonSecond)
    Button second_button;
    @BindView(R.id.buttonThird)
    Button third_button;

    @BindViews({R.id.buttonFirst, R.id.buttonSecond, R.id.buttonThird})
    List<Button> buttons_list;

    @OnClick(R.id.buttonThird)
    void showToastThird() {
        x = "üç";
        Toast.makeText(getApplicationContext(), x, Toast.LENGTH_LONG).show();

    }

    @OnClick(R.id.buttonSecond)
    void showToastSecond() {
        x = "iki";
        setActioniki();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        buttons_list.get(0).setBackgroundColor(Color.BLUE); // birinci buton mavi renk alıyor
        buttons_list.get(1).setBackgroundColor(Color.RED);  // ikinci buton kırmızı renk alıyor
        buttons_list.get(2).setBackgroundColor(Color.GRAY); // üçüncü buton gri renk alıyor

    }

    private void setActioniki() {
        Toast.makeText(getApplicationContext(), x, Toast.LENGTH_LONG).show();
        restInterface = ApiClient.getClient().create(RestInterfaceController.class);
        Call<List<RetrofitResponse>> call = restInterface.getJsonValues();
        call.enqueue(new Callback<List<RetrofitResponse>>() {
            @Override
            public void onResponse(Call<List<RetrofitResponse>> call, Response<List<RetrofitResponse>> response) {
                System.out.println("dfbfdbdfbd "+response.body().get(0).name);

            }

            @Override
            public void onFailure(Call<List<RetrofitResponse>> call, Throwable t) {

            }
        });

    }
}
