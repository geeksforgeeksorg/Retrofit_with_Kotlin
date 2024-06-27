package org.geeksforgeeks.retrofit_application;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("users/{id}")
    Call<User> getUserById(@Path("id") int userId);
}
