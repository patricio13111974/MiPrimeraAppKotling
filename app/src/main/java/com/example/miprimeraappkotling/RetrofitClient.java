package com.example.miprimeraappkotling;

import org.jetbrains.annotations.NotNull;

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient<companion, val> {
    companion object{
        private const val URL_BASE = "https://android-kotlin-fun-mars-server.appspot.com/"

         fun retrofitInstance(): MarsAPI{
            val retrofit = Retrofit.Builder()
                    .baseUrl(URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    return retrofit.create(MarsAPI::class.java)
        }
    }

    @NotNull
    public static Object retrofitInstance() {
        return null;
    }
}
