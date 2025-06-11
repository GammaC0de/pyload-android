package org.pyload.android.openapi.api;

import org.pyload.android.openapi.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface PyLoadAuthenticationApi {
  /**
   * Login into pyLoad, this must be called when using rpc before any methods can be used.
   * 
   * @param username  (required)
   * @param password  (required)
   * @return Call&lt;Void&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("api/login")
  Call<Void> apiLoginPost(
    @retrofit2.http.Field("username") String username, @retrofit2.http.Field("password") String password
  );

  /**
   * Logout current user, clear session data
   * 
   * @return Call&lt;Void&gt;
   */
  @GET("api/logout")
  Call<Void> apiLogoutGet();
    

}
