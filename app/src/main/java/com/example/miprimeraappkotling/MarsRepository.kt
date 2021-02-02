package com.example.miprimeraappkotling

import android.telecom.Call
import android.util.Log
import retrofit2.Callback
import retrofit2.Response
import java.net.CacheResponse
import java.security.cert.CertPathValidatorException
import javax.security.auth.callback.Callback
import kotlin.math.log

class MarsRepository {

    private val services = RetrofitClient.retrofitInstance()
    private val liveDataMarsTerrain = MutableLiveData<List<MarsTerrain>>

    //vieja confiable, enqueue desde retrofit
    fun  fetchMarsTerrainEnqueue(): List<MarsTerrain> {
        services.fetchMarsTerrainEnqueue().enqueue(object : Callback<List<MarsTerrain>> {
            override fun onResponse(
                    call: Call<List<MarsTerrain>>,
                    response: Response<List<MarsTerrain>>
            ) {

                when (response.code()) {
                    in 200..299 -> liveDataMarsTerrain.value = response.body()
                    in 300..399 -> Log.d(tag:
                    "ERROR", response.errorBody().toString())
                    else -> Log.d("ERROR", "error del server ${response.code()}")
                }
            }

            override fun onFaiture(call: Call<List<MarsTerrain>>, t: Throwable) {
                Log.e("ERROR", t.message.toString())
            }

        })
        return liveDataMarsTerrain
    }

    }

