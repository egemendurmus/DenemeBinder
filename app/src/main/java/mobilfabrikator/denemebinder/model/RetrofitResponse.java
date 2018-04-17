package mobilfabrikator.denemebinder.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by TULPAR on 16.04.2018.
 */

public class RetrofitResponse {
    @SerializedName("category")
    @Expose
    public String category;
    @SerializedName("price")
    @Expose
    public Double price;
    @SerializedName("instructions")
    @Expose
    public String instructions;
    @SerializedName("photo")
    @Expose
    public String photo;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("productId")
    @Expose
    public Integer productId;
}
