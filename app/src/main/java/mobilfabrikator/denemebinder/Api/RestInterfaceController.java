package mobilfabrikator.denemebinder.Api;

import java.util.List;

import mobilfabrikator.denemebinder.model.RetrofitResponse;
import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by alperbeyler on 10/11/15.
 */
public interface RestInterfaceController {

    // GET yada POST mu olduğunu belirliyoruz.
    @GET("/test/retrofitJson.php")
    Call<List<RetrofitResponse>> getJsonValues();


}
